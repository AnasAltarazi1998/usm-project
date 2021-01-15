package com.company.app.Controllers;

import java.util.List;
import java.util.Optional;

import com.company.app.Models.PostModel;
import com.company.app.Repositories.PostRepo;
import com.company.app.Repositories.UserRepo;
import com.company.app.entities.PostEntity;
import com.company.app.entities.UserEntity;
import com.company.app.services.FormService;
import com.company.app.services.PostServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/posts")
public class PostController {
    @Autowired
    PostRepo postRepo;
    @Autowired
    UserRepo userRepo;
    @Autowired
    FormService formService;
    @Autowired
    PostServices postServices;

    @PostMapping(path = "/add/{u_id}")
    public boolean addPost(@RequestBody PostEntity p, @PathVariable(name = "u_id") Long id) {
        Optional<UserEntity> userEntity;
        if ((userEntity = userRepo.findById(id)).isPresent()) {
            UserEntity u = userEntity.get();
            p.setUEntity(u);
            p = postRepo.save(p);
            return postRepo.findById(p.getId()).isPresent();

        } else
            return false;
    }

    @GetMapping(path = "/getpostbyid/{p_id}")
    public PostModel getPostById(@PathVariable(name = "p_id") long id) {
        PostEntity post = postRepo.findById(id).get();
        return formService.convertToPostResponseFromPostEntitiesForm(post);
    }

    @GetMapping(path = "/search/{val}")
    public List<PostEntity> searchList(@PathVariable(name = "val") String s) {
        return postRepo.search(s).get();
    }

    @GetMapping(path = "/getbestposts")
    public List<PostModel> getBestPosts() {

        List<PostEntity> postlist = postRepo.getPostByDate().get();
        return formService.convertToListOfPostResponseFromPostEntitiesForm(postlist);
    }

    @GetMapping(path = "/getallposts")
    public Page<PostModel> getAllPosts() {
        Pageable pageable = new Pageable();
        List<PostEntity> allPost = postRepo.findAll();
        List<PostModel> allPostModels = formService.convertToListOfPostResponseFromPostEntitiesForm(allPost);
        Page<PostModel> allPostsPage = new PageImpl<>(allPostModels);
        return allPostsPage;

    }

    @PostMapping(value = "/editpost")
    public PostModel editPost(@RequestBody PostModel newPost) {

        if (postRepo.existsById(Long.valueOf(newPost.getId()))) {
            PostEntity post = postRepo.findById(Long.valueOf(newPost.getId())).get();
            post.setTitle(newPost.getTitle());
            post.setValue(newPost.getValue());
            post.setAttach(newPost.getValue());
            postRepo.save(post);
            PostModel postModel = formService.convertToPostResponseFromPostEntitiesForm(post);
            return postModel;
        } else {
            PostEntity post = new PostEntity();
            post.setTitle("404 - post Not Found");
            PostModel postModel = formService.convertToPostResponseFromPostEntitiesForm(post);
            return postModel;
        }
    }

}
