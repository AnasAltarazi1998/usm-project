package app.view.components;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import app.Controllers.UserController;
import app.Models.UserModel;
import app.route.Route;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;

public class UpdateForm extends VBox {

    TextField username;
    ImageView sticker;
    TextField email;
    TextField specialization;
    TextField university;
    TextField password;
    Label birthdate;
    DatePicker datePicker1;
    Label registrationYear;
    DatePicker datePicker2;
    Button update;
    Circle image;
    Label setting;
    UserController userController = UserController.getInstance();

    public UpdateForm() throws FileNotFoundException {

        setting = new Label("Settings");
        setting.setFont(new Font("arial", 25));
        setting.setTextFill(Color.rgb(67, 66, 93));

        username = new TextField();
        username.setPromptText("Username");

        email = new TextField();
        email.setPromptText("Email");

        password = new TextField();
        password.setPromptText("Password");

        specialization = new TextField();
        specialization.setPromptText("Specialization");

        university = new TextField();
        university.setPromptText("University");

        birthdate = new Label("Birthdate");
        birthdate.setId("text");

        username.setMinWidth(22);
        password.setMinWidth(22);
        email.setMinWidth(22);
        university.setMinWidth(22);
        specialization.setMinWidth(22);

        username.setMaxWidth(240);
        password.setMaxWidth(240);
        email.setMaxWidth(240);
        university.setMaxWidth(240);
        specialization.setMaxWidth(240);

        datePicker1 = new DatePicker();
        datePicker1.setPrefSize(100, 30);

        registrationYear = new Label("Registration Year");
        registrationYear.setId("text");

        datePicker2 = new DatePicker();
        datePicker2.setPrefSize(100, 30);

        birthdate.setTextFill(Color.BLACK);
        birthdate.setPrefSize(100, 20);
        registrationYear.setTextFill(Color.BLACK);
        registrationYear.setPrefSize(100, 20);
        update = new Button("Update");
        update.setId("Updatebutton");
        update.setMinWidth(25);

        update.setMaxWidth(150);
        //update.setPrefSize(200, 10);
         UserModel updateUser = new UserModel();
        // System.out.println(userController.getUserModel().getName());
        // System.out.println(userController.getUserModel().getEmail());
        // System.out.println(userController.getUserModel().getUniversity());
        // System.out.println(userController.getUserModel().getStudy_year());
        // System.out.println(userController.getUserModel().getStart_year());
        // System.out.println(userController.getUserModel().getAge());
        // System.out.println(userController.getUserModel().getspec());
        // System.out.println(userController.getUserModel().getImg());
        // System.out.println(userController.getUserModel().getId());
        // System.out.println(userController.getUserModel().getCommunity_name());
        // System.out.println(userController.getUserModel().getPassword());

        updateUser.setName(userController.getUserModel().getName());
        updateUser.setspec(userController.getUserModel().getspec());
        updateUser.setUniversity(userController.getUserModel().getUniversity());
        updateUser.setPassword(userController.getUserModel().getPassword());
        updateUser.setEmail(userController.getUserModel().getEmail());
        updateUser.setCommunity_name(userController.getUserModel().getCommunity_name());
        updateUser.setAge(userController.getUserModel().getAge());
        updateUser.setStart_year(userController.getUserModel().getStart_year());
        updateUser.setStudy_year(userController.getUserModel().getStudy_year());
        updateUser.setImg(userController.getUserModel().getImg());
        updateUser.setId(userController.getUserModel().getId());

        username.setId("textfieldupdate");
        email.setId("textfieldupdate");
        password.setId("textfieldupdate");
        specialization.setId("textfieldupdate");
        university.setId("textfieldupdate");

        email.setTranslateX(300);
        email.setTranslateY(-40);
        university.setTranslateX(300);
        university.setTranslateY(-40);


        update.setOnAction(e -> {

            boolean state = userController.checkupdate(updateUser);

            if (state) {
                //UpdateError();
            } else {
               // UpdateError();
            }

        });

        VBox.setVgrow(email, Priority.ALWAYS);
        VBox.setVgrow(password, Priority.ALWAYS);
        VBox.setVgrow(update, Priority.ALWAYS);
        VBox.setVgrow(username, Priority.ALWAYS);
        VBox.setVgrow(specialization, Priority.ALWAYS);
        VBox.setVgrow(university, Priority.ALWAYS);

        setMargin(setting, new Insets(50, 0, 10, 250));
        setMargin(username, new Insets(50, 0, 10, 10));
        setMargin(password, new Insets(10, 0, 10, 10));
        setMargin(specialization, new Insets(10, 0, 10, 10));
        setMargin(datePicker2, new Insets(10, 0, 10, 10));
        setMargin(registrationYear, new Insets(10, 0, 10, 10));
        setMargin(update, new Insets(10, 0, 10, 150));

        sticker = new ImageView(new Image(new FileInputStream("./src/assets/update.png")));
        setMargin(sticker, new Insets(60, 0, 10, 450));
        image = new Circle(300, 60, 120);
        Image im = new Image(new FileInputStream("./src/assets/profile.png"));
        image.setFill(new ImagePattern(im));
        image.setTranslateX(900);
        image.setTranslateY(-650);

        getChildren().addAll(setting, username,email, password,university, specialization, registrationYear, datePicker2, update,
                sticker, image);

    }

    public void UpdateError() {
        Route.showError(userController.getUserModel().getName());
    }
}
