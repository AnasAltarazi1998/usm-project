package com.company.app.Controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

import com.company.app.Models.PostModel;
import com.company.app.Repositories.PostRepo;
import com.company.app.Repositories.UserRepo;
import com.company.app.entities.PostEntity;
import com.company.app.entities.UserEntity;
import com.company.app.services.FormService;
import com.company.app.services.PostServices;

import org.springframework.beans.factory.annotation.Autowired;
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
    public boolean addPost(@RequestBody PostModel p, @PathVariable(name = "u_id") Long id) {
        PostEntity req = new PostEntity();
        Optional<UserEntity> userEntity;
        if ((userEntity = userRepo.findById(id)).isPresent()) {
            UserEntity u = userEntity.get();
            req.setTitle(p.getTitle());
            req.value(p.getValue());

            if(p.getAttach() != null) 
                req.setAttach(p.getAttach());
            else
                req.setAttach("https://th.bing.com/th/id/OIP.wwFDVQdzDng7C7kB6f4I7gHaE7?pid=Api&rs=1");

            req.setUEntity(u);
            req.setPcommuninty(u.getCommuninty());
            req = postRepo.save(req);
            return postRepo.findById(req.getId()).isPresent();

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

    @GetMapping(path = "/getallposts/{u_id}")
    public Iterable<PostModel> getAllPosts(@PathVariable(name = "u_id") long uid) {
       List<PostModel> res = new ArrayList<PostModel>();
       Iterable<PostEntity> db_values = postRepo.findAll();
        if(db_values.iterator().hasNext())
        {
         
            db_values.forEach(new Consumer<PostEntity>(){

                @Override
                public void accept(PostEntity t) {
                    if(t.getPcommuninty().getName().equals(userRepo.findById(uid).get().getCommuninty().getName()))
                        res.add(formService.convertToPostResponseFromPostEntitiesForm(t));
                }

                
            });
            return res;

        }else{
            res.add(
                new PostModel()
                .id(-1)
                .Title("404 - no posts yet")
                .attach("https://i.pinimg.com/originals/ae/8a/c2/ae8ac2fa217d23aadcc913989fcc34a2.png")
                .UserImage(userRepo.findById(uid).get().getImg()));
            return res;
        }
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
