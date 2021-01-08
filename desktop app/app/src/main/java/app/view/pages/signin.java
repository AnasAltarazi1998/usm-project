package app.view.pages;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class signin {
    public Scene scene;
    TextField usernameTextField;
    PasswordField passwordField;
    Button submit;
    VBox primary_layout;

    public signin() {
        usernameTextField = new TextField();
        passwordField = new PasswordField();
        submit = new Button("sign in");
        usernameTextField.setPromptText("username ...");
        passwordField.setPromptText("password ...");
        primary_layout = new VBox();
        primary_layout.setSpacing(10.0);
        primary_layout.getChildren().addAll(usernameTextField, passwordField, submit);
        scene = new Scene(primary_layout, 600, 600);
        primary_layout.setPadding(new Insets(10, 10, 10, 10));
        primary_layout.setAlignment(Pos.CENTER);

        submit.setOnAction((e) -> {
            System.out.println("test");
            String uservalue = usernameTextField.getText();
            String passvalue = passwordField.getText();
            if (uservalue.equals("java") && passvalue.equals("123")) {
                Label info = new Label(uservalue + " ... " + passvalue);
                primary_layout.getChildren().add(info);
                info.setTextFill(Color.SKYBLUE);
                info.setFont(new Font(24));
            } else {
                Label info = new Label("invalid values");
                primary_layout.getChildren().add(info);
                info.setTextFill(Color.RED);
                info.setFont(new Font(24));
            }
        });

    }

}
