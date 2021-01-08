package app.view.pages;

import java.util.Objects;

import app.Models.UserModel;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;

public class Profile {
    Scene scene;
    Label value;
    StackPane primary;
    UserModel userinfo;
    public Profile(UserModel u) {
        userinfo = u;
        value = new Label(u.toString());
        primary = new StackPane(value);
        value.setFont(new Font("arial", 30));
        scene = new Scene(primary,600,600);
    }

    public Profile(Scene scene, Label value, StackPane primary) {
        this.scene = scene;
        this.value = value;
        this.primary = primary;
    }

    public Scene getScene() {
        return this.scene;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }

    public Label getValue() {
        return this.value;
    }

    public void setValue(Label value) {
        this.value = value;
    }

    public StackPane getPrimary() {
        return this.primary;
    }

    public void setPrimary(StackPane primary) {
        this.primary = primary;
    }

    public Profile scene(Scene scene) {
        this.scene = scene;
        return this;
    }

    public Profile value(Label value) {
        this.value = value;
        return this;
    }

    public Profile primary(StackPane primary) {
        this.primary = primary;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Profile)) {
            return false;
        }
        Profile profile = (Profile) o;
        return Objects.equals(scene, profile.scene) && Objects.equals(value, profile.value) && Objects.equals(primary, profile.primary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scene, value, primary);
    }

    @Override
    public String toString() {
        return "{" +
            " scene='" + getScene() + "'" +
            ", value='" + getValue() + "'" +
            ", primary='" + getPrimary() + "'" +
            "}";
    }

    
    
}
