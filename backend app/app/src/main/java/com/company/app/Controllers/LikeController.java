package com.company.app.Controllers;

import com.company.app.Repositories.LikeRepo;
import com.company.app.Repositories.PostRepo;
import com.company.app.Repositories.UserRepo;
import com.company.app.entities.LikeEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/like")
public class LikeController {

    @Autowired
    LikeRepo likeRepo;
    @Autowired
    UserRepo userRepo;
    @Autowired
    PostRepo postRepo;

    @GetMapping(path = "/addLike/{u_id}/{p_id}")
    public boolean addLike(@PathVariable(name = "u_id") Long U_id, @PathVariable(name = "p_id") Long P_id) {
        LikeEntity likeEntity = new LikeEntity();
        if (!postRepo.findById(P_id).isPresent()) {
            likeEntity.setId(-1L);
            return false;
        } else {
            for (int j = 0; j < userRepo.findById(U_id).get().getLikes().size(); j++) {
                if (userRepo.findById(U_id).get().getLikes().get(j).getPEntity()
                        .equals(postRepo.findById(P_id).get())) {
                    // userRepo.findById(U_id).get().getLikes().remove(j);
                    likeRepo.deleteById(userRepo.findById(U_id).get().getLikes().get(j).getId());
                    return false;
                }
            }
            likeEntity.setUEntity(userRepo.findById(U_id).get());
            likeEntity.setPEntity(postRepo.findById(P_id).get());
            likeRepo.save(likeEntity);
            return true;
        }
    }
}