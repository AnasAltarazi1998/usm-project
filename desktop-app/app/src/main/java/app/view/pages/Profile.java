package app.view.pages;

import java.io.FileNotFoundException;
import java.util.Objects;

import app.Models.UserModel;
import app.styles.StyleValues;
import app.view.components.LeftProfile;
import app.view.components.NavBar;
import app.view.components.RightProfile;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;

public class Profile {
    Scene scene;
    Label value;
    LeftProfile leftProfile;
    RightProfile rightProfile;
    UserModel userinfo;
    HBox primary_layout;
    NavBar navBar;

    public Profile(UserModel u) throws FileNotFoundException {
        leftProfile  = new LeftProfile(u) ;
        rightProfile = new RightProfile();
        navBar = new NavBar();
        userinfo = u;
        primary_layout = new HBox(navBar,leftProfile,rightProfile);
        scene = new Scene(primary_layout,600,600);
        scene.getStylesheets().add(StyleValues.css_uri);
    }

    public Profile(Scene scene, Label value, HBox primary_layout) {
        this.scene = scene;
        this.value = value;
        this.primary_layout = primary_layout;
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

    public HBox getPrimary() {
        return this.primary_layout;
    }

    public void setPrimary(HBox primary_layout) {
        this.primary_layout = primary_layout;
    }

    public Profile scene(Scene scene) {
        this.scene = scene;
        return this;
    }

    public Profile value(Label value) {
        this.value = value;
        return this;
    }

    public Profile primary_layout(HBox primary_layout) {
        this.primary_layout = primary_layout;
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
        return Objects.equals(scene, profile.scene) && Objects.equals(value, profile.value) && Objects.equals(primary_layout, profile.primary_layout);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scene, value, primary_layout);
    }

    @Override
    public String toString() {
        return "{" +
            " scene='" + getScene() + "'" +
            ", value='" + getValue() + "'" +
            ", primary_layout='" + getPrimary() + "'" +
            "}";
    }

    
    
}
