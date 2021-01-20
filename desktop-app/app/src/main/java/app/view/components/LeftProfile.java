package app.view.components;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Objects;
import app.Models.UserModel;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.paint.ImagePattern;

public class LeftProfile extends VBox {

    Label userName, age, email;
    Circle circle;

    public LeftProfile(UserModel u) throws FileNotFoundException {
        super();
        setSpacing(10);
        setMinSize(834, 542);
      //  setBackground(new Background(new BackgroundFill(Color.rgb(179, 157, 216), CornerRadii.EMPTY, Insets.EMPTY)));
        
        //username
        userName = new Label(u.getName());
        userName.setFont(new Font("Arial",25));
        userName.setMaxWidth(Double.MAX_VALUE);
        userName.setAlignment(Pos.CENTER);
        setMargin(userName, new Insets(20, 200, 20, 190));  
        userName.setId("profileusername");
        //age
        age = new Label(u.getAge().toString());
        age.setFont(new Font("Arial", 24));
        age.setMaxWidth(Double.MAX_VALUE);
        age.setAlignment(Pos.CENTER);
        setMargin(age, new Insets(20, 200, 20, 190)); 
        age.setId("profileusername");
        
        //email
        email = new Label(u.getEmail());
        email.setFont(new Font("Arial", 24));
        email.setId("profileusername");
        email.setMaxWidth(Double.MAX_VALUE);
        email.setAlignment(Pos.CENTER);
        setMargin(email, new Insets(20, 200, 20, 190)); 

        circle = new Circle(300,60,120);
        setMargin(circle, new Insets(20, 10, 50, 300));
        Image im = new Image(new FileInputStream("./src/assets/profile.png"));
        circle.setFill(new ImagePattern(im));

        getChildren().addAll(circle,userName,age ,email);
    }
    

    public LeftProfile() {
    }

    public LeftProfile( Label userName, Label age, Label email, Circle circle) {
      
        this.userName = userName;
        this.age = age;
        this.email = email;
        this.circle = circle;
    }



    public Label getUserName() {
        return this.userName;
    }

    public void setUserName(Label userName) {
        this.userName = userName;
    }

    public Label getAge() {
        return this.age;
    }

    public void setAge(Label age) {
        this.age = age;
    }

    public Label getEmail() {
        return this.email;
    }

    public void setEmail(Label email) {
        this.email = email;
    }

    public Circle getCircle() {
        return this.circle;
    }

    public void setCircle(Circle circle) {
        this.circle = circle;
    }



    public LeftProfile userName(Label userName) {
        setUserName(userName);
        return this;
    }

    public LeftProfile age(Label age) {
        setAge(age);
        return this;
    }

    public LeftProfile email(Label email) {
        setEmail(email);
        return this;
    }

    public LeftProfile circle(Circle circle) {
        setCircle(circle);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof LeftProfile)) {
            return false;
        }
        LeftProfile leftProfile = (LeftProfile) o;
        return Objects.equals(userName, leftProfile.userName) && Objects.equals(age, leftProfile.age) && Objects.equals(email, leftProfile.email) && Objects.equals(circle, leftProfile.circle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName, age, email, circle);
    }

    @Override
    public String toString() {
        return "{" +
            ", userName='" + getUserName() + "'" +
            ", age='" + getAge() + "'" +
            ", email='" + getEmail() + "'" +
            ", circle='" + getCircle() + "'" +
            "}";
    }

    
}
