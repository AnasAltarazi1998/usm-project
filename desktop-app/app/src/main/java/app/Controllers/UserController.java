package app.Controllers;

import app.Models.UserModel;
import app.repository.UserRepository;

public class UserController {
    UserRepository userRepository;
    private UserModel userModel;

    private static UserController userController;
    private UserController(){
        init();
    }
    private void init(){
        userRepository = new UserRepository();
        userModel = new UserModel();
    }
    public static UserController getInstance(){
        if(userController == null)
        {
            userController = new UserController();
            return userController;
        }else
        return userController;
    }
    
    public boolean checkSignIn(String email, String password)
    {
        userModel = userRepository.signIn(email, password);
        if(userModel.getId() == -1 ) return false;
        else return true;
        
    } 
    
    
    public UserModel getUserModel() {
        return this.userModel;
    }
    
    public void setUserModel(UserModel userModel) {
        this.userModel = userModel;
    }
}
