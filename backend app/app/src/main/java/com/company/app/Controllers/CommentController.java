package com.company.app.Controllers;

import com.company.app.Repositories.CommentRepo;
import com.company.app.Repositories.PostRepo;
import com.company.app.Repositories.UserRepo;
import com.company.app.entities.CommentEntity;
import com.company.app.entities.PostEntity;
import com.company.app.entities.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/comments")
public class CommentController {
    @Autowired
    UserRepo userRepo;
    @Autowired
    PostRepo postRepo;
    @Autowired
    CommentRepo commentRepo;

    @PostMapping(path = "/add/{u_id}/{p_id}")
    public Boolean addComment(@RequestBody String value, @PathVariable(name = "u_id") Long u_id,
            @PathVariable(name = "p_id") Long p_id) {
        CommentEntity comment = new CommentEntity();
        if (userRepo.findById(u_id).isPresent() && postRepo.findById(p_id).isPresent()) {
            UserEntity u = userRepo.findById(u_id).get();
            PostEntity p = postRepo.findById(p_id).get();
            comment.setUEntity(u);
            comment.setPEntity(p);
            comment.setValue(value);
            comment = commentRepo.save(comment);
            return commentRepo.findById(comment.getId()).isPresent();
        } else {
            return false;
        }
    }

    @PostMapping(path = "/delete/{u_id}/{p_id}/{c_id}")
    public Boolean deleteComment(@PathVariable(name = "u_id") Long u_id, @PathVariable(name = "p_id") Long p_id,
            @PathVariable(name = "c_id") Long c_id) {
        if (!userRepo.findById(u_id).isPresent() || !commentRepo.findById(c_id).isPresent()
                || !postRepo.findById(p_id).isPresent())
            return false;

        CommentEntity commentEntity = commentRepo.findById(c_id).get();
        UserEntity userEntity = userRepo.findById(u_id).get();

        if (userEntity.getComments().contains(commentRepo.findById(c_id).get())) {
            commentRepo.delete(commentEntity);
            return true;
        } else
            return false;
    }

    @PostMapping(path = "/edit/{u_id}/{p_id}/{c_id}")
    public Boolean editComment(@RequestBody String value, @PathVariable(name = "u_id") Long u_id,
            @PathVariable(name = "p_id") Long p_id, @PathVariable(name = "c_id") Long c_id) {
        UserEntity userEntity = userRepo.findById(u_id).get();
        if (!userRepo.findById(u_id).isPresent() || !commentRepo.findById(c_id).isPresent()
                || !postRepo.findById(p_id).isPresent())
            return false;
        else {
            if (userEntity.getComments().contains(commentRepo.findById(c_id).get())) {
                CommentEntity comment = commentRepo.findById(c_id).get();
                comment.setValue(value);
                comment = commentRepo.save(comment);
                return true;
            } else {
                return false;
            }
        }

    }

}
