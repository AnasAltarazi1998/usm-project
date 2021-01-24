package com.company.app.Controllers;

import java.util.List;
import java.util.Optional;

import com.company.app.Models.UserModel;
import com.company.app.Repositories.BoardRepo;
import com.company.app.Repositories.CommunityRepo;
import com.company.app.Repositories.UserRepo;
import com.company.app.entities.UserEntity;
import com.company.app.services.FormService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/users")
public class UserController {

    @Autowired
    UserRepo userRepo;
    @Autowired
    FormService service;
    @Autowired
    CommunityRepo communityRepo;
    @Autowired
    BoardRepo boardrepo;

    // @PostMapping(path = "/register")
    // public UserModel registerNewUser(@RequestBody UserEntity u) {
    // UserModel response = new UserModel();

    // if (userRepo.findByEmail(u.getEmail()).isPresent()) {
    // response.setId(-1);
    // response.setName("this email is already exist");
    // return response;
    // } else
    // {

    // Optional<CommunityEntity> c;
    // if((c = communityRepo.findByName(u.getSpec())).isPresent())
    // {
    // u.setCommuninty(c.get());
    // u = userRepo.save(u);
    // response = service.convertToUserResponseForm(u);
    // return response;
    // }else
    // {
    // response.setId(-1);
    // response.setName("community is not valid");
    // return response;
    // }

    // }

    // }

    /**
     * loai :)
     */
    @PostMapping(path = "/register")
    public UserModel registerNewUserByModel(@RequestBody UserModel u) {
        UserEntity responseEntity = new UserEntity();
        if (userRepo.findByEmail(u.getEmail()).isPresent()) {
            u.setId(-1);
            u.setName("user is already exist");
            return u;
        } else {
            responseEntity = service.convertToUserEntityFromUserModelForm(u);
            responseEntity.setImg("https://eu.ui-avatars.com/api/?name="+u.getName());
            responseEntity = userRepo.save(responseEntity);
            return u = service.convertToUserResponseForm(responseEntity);
        }
    }

    @GetMapping(path = "/signin/{email}/{password}")

    public UserModel signIn(@PathVariable(name = "email") String email,
            @PathVariable(name = "password") String password) {
        if (userRepo.findByEmail(email).isEmpty()) {
            UserModel response = new UserModel();
            response.setId(-1);
            response.setName("email not found");
            return response;
        } else {
            Optional<UserEntity> u = userRepo.findByEmail(email);
            if (u.get().getPassword().equals(password)) {
                return service.convertToUserResponseForm(u.get());
            } else {
                UserModel response = new UserModel();
                response.setId(-1);
                response.setName("password incorrect");
                return response;
            }
        }
    }
    
    @GetMapping(path = "/test")
    public Optional<UserEntity> test() {
        return userRepo.findByEmail("test");

    }

    @PostMapping(name = "/update")
    public UserModel updateUser(@RequestBody UserEntity u) {
        UserEntity res = userRepo.save(u);
        return service.convertToUserResponseForm(res);
    }

    @GetMapping(value = "/search/{val}")
    public List<UserModel> searchList(@PathVariable(name = "val") String s) {

        return service.convertToListOfUserResponseForm(userRepo.search(s).get());
    }

    // @GetMapping(value = "joinboard/{u_id}/b_id")
    // public boolean joinBoard(@PathVariable(name = "u_id") long u_id,
    // @PathVariable(name = "b_id") long b_id) {
    // Optional<UserEntity> u;
    // Optional<BoardEntity> b;
    // if ((u = userRepo.findById(u_id)).isPresent() && (b =
    // boardrepo.findById(b_id)).isPresent()) {
    // u.get().getBoards().add(b.get());
    // return userRepo.save(u.get()).getBoards().contains(b.get());
    // }
    // return false;
    // }

    @PostMapping(path = "/delete/{email}")
    public Boolean deleteUser(@PathVariable(name="email")String email)
    {
        if(!userRepo.findByEmail(email).isPresent())
            return false ;
        else{
            UserEntity userEntity = userRepo.findByEmail(email).get();
            userRepo.delete(userEntity);         
            return true;
        }
    }
}