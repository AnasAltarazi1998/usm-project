package app.view.pages;

import java.io.FileNotFoundException;
import java.util.Objects;

import app.styles.StyleValues;
import app.view.components.NavBar;
import app.view.components.UpdateForm;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;

public class settings {
    Scene scene;
    HBox primary_layout;
    NavBar navBar;
    UpdateForm updateForm;

    public settings() throws FileNotFoundException {
        updateForm = new UpdateForm();
        navBar = new NavBar();
        primary_layout = new HBox(navBar,updateForm);
        primary_layout.setId("primary_layout");
        scene = new Scene(primary_layout,600,600);
        scene.getStylesheets().add(StyleValues.css_uri);
    }

    public settings(Scene scene, HBox primary_layout, NavBar navBar, UpdateForm updateForm) {
        this.scene = scene;
        this.primary_layout = primary_layout;
        this.navBar = navBar;
        this.updateForm = updateForm;
    }

    public UpdateForm getUpdateForm() {
        return this.updateForm;
    }

    public void setUpdateForm(UpdateForm updateForm) {
        this.updateForm = updateForm;
    }

    public settings updateForm(UpdateForm updateForm) {
        setUpdateForm(updateForm);
        return this;
    }


    public Scene getScene() {
        return this.scene;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }

    public HBox getPrimary_layout() {
        return this.primary_layout;
    }

    public void setPrimary_layout(HBox primary_layout) {
        this.primary_layout = primary_layout;
    }

    public NavBar getNavBar() {
        return this.navBar;
    }

    public void setNavBar(NavBar navBar) {
        this.navBar = navBar;
    }

    public settings scene(Scene scene) {
        setScene(scene);
        return this;
    }

    public settings primary_layout(HBox primary_layout) {
        setPrimary_layout(primary_layout);
        return this;
    }

    public settings navBar(NavBar navBar) {
        setNavBar(navBar);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof settings)) {
            return false;
        }
        settings settings = (settings) o;
        return Objects.equals(scene, settings.scene) && Objects.equals(primary_layout, settings.primary_layout) && Objects.equals(navBar, settings.navBar);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scene, primary_layout, navBar);
    }

    @Override
    public String toString() {
        return "{" +
            " scene='" + getScene() + "'" +
            ", primary_layout='" + getPrimary_layout() + "'" +
            ", navBar='" + getNavBar() + "'" +
            "}";
    }
    
    
}
