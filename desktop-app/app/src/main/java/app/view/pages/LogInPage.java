package app.view.pages;

import java.io.FileNotFoundException;
import java.util.Objects;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import app.styles.StyleValues;
import app.view.components.BaseForm;
import app.view.components.LoginForm;

public class LogInPage {
    public Scene scene;
    BaseForm baseForm;
    LoginForm loginForm;
    StackPane primaryLayout;

    public LogInPage() throws FileNotFoundException {
        baseForm = new BaseForm();
        loginForm = new LoginForm();
        primaryLayout = new StackPane(baseForm,loginForm);
        StackPane.setAlignment(baseForm, Pos.CENTER);
        StackPane.setAlignment(loginForm, Pos.CENTER);
        scene = new Scene(primaryLayout,600,600);
        baseForm.getBg().fitWidthProperty().bind(scene.widthProperty());
        baseForm.getBg().fitHeightProperty().bind(scene.heightProperty());
        scene.widthProperty().addListener(e->{
            baseForm.getRec().setWidth(scene.widthProperty().get()*0.225);
        });
        scene.heightProperty().addListener(e->{
            baseForm.getRec().setHeight(scene.heightProperty().get()*0.538);
        });

       
        scene.getStylesheets().add(StyleValues.css_uri);
        
    }

    public LogInPage(Scene scene, BaseForm baseForm, LoginForm loginForm, StackPane primaryLayout) {
        this.scene = scene;
        this.baseForm = baseForm;
        this.loginForm = loginForm;
        this.primaryLayout = primaryLayout;
    }

    public Scene getScene() {
        return this.scene;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }

    public BaseForm getBaseForm() {
        return this.baseForm;
    }

    public void setBaseForm(BaseForm baseForm) {
        this.baseForm = baseForm;
    }

    public LoginForm getLoginForm() {
        return this.loginForm;
    }

    public void setLoginForm(LoginForm loginForm) {
        this.loginForm = loginForm;
    }

    public StackPane getPrimaryLayout() {
        return this.primaryLayout;
    }

    public void setPrimaryLayout(StackPane primaryLayout) {
        this.primaryLayout = primaryLayout;
    }

    public LogInPage scene(Scene scene) {
        this.scene = scene;
        return this;
    }

    public LogInPage baseForm(BaseForm baseForm) {
        this.baseForm = baseForm;
        return this;
    }

    public LogInPage loginForm(LoginForm loginForm) {
        this.loginForm = loginForm;
        return this;
    }

    public LogInPage primaryLayout(StackPane primaryLayout) {
        this.primaryLayout = primaryLayout;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof LogInPage)) {
            return false;
        }
        LogInPage logInPage = (LogInPage) o;
        return Objects.equals(scene, logInPage.scene) && Objects.equals(baseForm, logInPage.baseForm) && Objects.equals(loginForm, logInPage.loginForm) && Objects.equals(primaryLayout, logInPage.primaryLayout);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scene, baseForm, loginForm, primaryLayout);
    }

    @Override
    public String toString() {
        return "{" +
            " scene='" + getScene() + "'" +
            ", baseForm='" + getBaseForm() + "'" +
            ", loginForm='" + getLoginForm() + "'" +
            ", primaryLayout='" + getPrimaryLayout() + "'" +
            "}";
    }

    
}
