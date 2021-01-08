package app.view.pages;

import java.util.Objects;
import java.io.File;
import java.io.FileNotFoundException;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import app.view.components.BaseForm;
import app.view.components.LogupForm;

public class LogupPage {
  
    public Scene scene;
    BaseForm baseForm;
    LogupForm logupForm;
    StackPane primaryLayout;

    public LogupPage() throws FileNotFoundException {

        baseForm = new BaseForm();
        logupForm = new LogupForm();
        primaryLayout = new StackPane(baseForm,logupForm);
        StackPane.setAlignment(baseForm, Pos.CENTER);
        StackPane.setAlignment(logupForm, Pos.CENTER);
        scene = new Scene(primaryLayout,600,600);
        baseForm.getBg().fitWidthProperty().bind(scene.widthProperty());
        baseForm.getBg().fitHeightProperty().bind(scene.heightProperty());
        scene.widthProperty().addListener(e->{
            baseForm.getRec().setWidth(scene.widthProperty().get()*0.525);
        });
        scene.heightProperty().addListener(e->{
            baseForm.getRec().setHeight(scene.heightProperty().get()*0.638);
        });

        File f = new File("./src/assets/style.css");
        scene.getStylesheets().clear();
        scene.getStylesheets().add("file:///" + f.getAbsolutePath().replace("\\", "/"));
       
    }

    public LogupPage(Scene scene, BaseForm baseForm, LogupForm logupForm, StackPane primaryLayout) {
        this.scene = scene;
        this.baseForm = baseForm;
        this.logupForm = logupForm;
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

    public LogupForm getLogupForm() {
        return this.logupForm;
    }

    public void setLogupForm(LogupForm logupForm) {
        this.logupForm = logupForm;
    }

    public StackPane getPrimaryLayout() {
        return this.primaryLayout;
    }

    public void setPrimaryLayout(StackPane primaryLayout) {
        this.primaryLayout = primaryLayout;
    }

    public LogupPage scene(Scene scene) {
        this.scene = scene;
        return this;
    }

    public LogupPage baseForm(BaseForm baseForm) {
        this.baseForm = baseForm;
        return this;
    }

    public LogupPage logupForm(LogupForm logupForm) {
        this.logupForm = logupForm;
        return this;
    }

    public LogupPage primaryLayout(StackPane primaryLayout) {
        this.primaryLayout = primaryLayout;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof LogupPage)) {
            return false;
        }
        LogupPage logupPage = (LogupPage) o;
        return Objects.equals(scene, logupPage.scene) && Objects.equals(baseForm, logupPage.baseForm) && Objects.equals(logupForm, logupPage.logupForm) && Objects.equals(primaryLayout, logupPage.primaryLayout);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scene, baseForm, logupForm, primaryLayout);
    }

    @Override
    public String toString() {
        return "{" +
            " scene='" + getScene() + "'" +
            ", baseForm='" + getBaseForm() + "'" +
            ", logupForm='" + getLogupForm() + "'" +
            ", primaryLayout='" + getPrimaryLayout() + "'" +
            "}";
    }
}
