package app.repository;

import java.io.IOException;
import java.io.InputStream;

import com.google.gson.Gson;

import app.Models.UserModel;
import app.api.ApiClass;

public class UserRepository {
      String base_user_url = Constants.base_url + "/users";
      ApiClass apiClass = ApiClass.getInstance();

    public UserModel signIn(String email, String password) {
        try {
            InputStream in = apiClass.get(base_user_url + "/signin"+"/" + email + "/" + password);
            String result = BaseRepository.convertInputStreamToString(in);
            Gson g = new Gson();
            UserModel u = g.fromJson(result, UserModel.class);
            return u;
            
        } catch (UnsupportedOperationException | IOException e) {
           e.printStackTrace();
            UserModel u = new UserModel();
            u.setId(-1);
            u.setName(e.getMessage());
            return u;
        }
    }
    public UserModel update(UserModel u)
    {
        try {
            InputStream in = apiClass.post(base_user_url + "/update", u.toString());
            String result = BaseRepository.convertInputStreamToString(in);
            Gson g = new Gson();
            UserModel userModel = g.fromJson(result, UserModel.class);
            return userModel;
        } catch (IOException e) {

            e.printStackTrace();
            UserModel error = new UserModel();
            error.setId(-1);
            error.setName(e.getMessage());
            return error;
        }     
    }
    
}
