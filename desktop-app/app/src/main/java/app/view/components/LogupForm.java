package app.view.components;

import java.util.Objects;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;



public class LogupForm extends VBox {
  
    TextField username;
    TextField email;
    TextField specialization;
    TextField university;
    PasswordField password;
    Label birthdate;
    DatePicker datePicker1;
    Label registrationYear;
    DatePicker datePicker2;
    CheckBox checkBox;
    Button submit; 

    public LogupForm() {
        username = new TextField();
        username.setPromptText("Username");
        
        email = new TextField();
        email.setPromptText("email");
        
        
        password = new PasswordField();
        password.setPromptText("password");
    

        specialization = new TextField();
        specialization.setPromptText("Specialization");

        university = new TextField();
        university.setPromptText("university");
        
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

        checkBox = new CheckBox("I agree to terms and condition");
        checkBox.setFont(new Font("Arial", 18));
        checkBox.setTextFill(Color.WHITE);
        
        birthdate.setTextFill(Color.WHITE);
        birthdate.setPrefSize(100, 20);
        registrationYear.setTextFill(Color.WHITE);
        registrationYear.setPrefSize(100, 20);
        submit = new Button("Log up");
        submit.setId("baseformbutton");

        VBox.setVgrow(email, Priority.ALWAYS);
        VBox.setVgrow(password, Priority.ALWAYS);
        VBox.setVgrow(submit, Priority.ALWAYS);
        VBox.setVgrow(username, Priority.ALWAYS);
        VBox.setVgrow(specialization, Priority.ALWAYS);
        VBox.setVgrow(university,Priority.ALWAYS);

    
        getChildren().addAll(username,password,email,university,specialization,birthdate,datePicker1,registrationYear,datePicker2,checkBox,submit);
        setAlignment(Pos.CENTER);
    }

    public LogupForm(TextField username, TextField email, TextField specialization, TextField university, PasswordField password, Label birthdate, DatePicker datePicker1, Label registrationYear, DatePicker datePicker2, CheckBox checkBox, Button submit) {
        this.username = username;
        this.email = email;
        this.specialization = specialization;
        this.university = university;
        this.password = password;
        this.birthdate = birthdate;
        this.datePicker1 = datePicker1;
        this.registrationYear = registrationYear;
        this.datePicker2 = datePicker2;
        this.checkBox = checkBox;
        this.submit = submit;
    }

    public TextField getUsername() {
        return this.username;
    }

    public void setUsername(TextField username) {
        this.username = username;
    }

    public TextField getEmail() {
        return this.email;
    }

    public void setEmail(TextField email) {
        this.email = email;
    }

    public TextField getSpecialization() {
        return this.specialization;
    }

    public void setSpecialization(TextField specialization) {
        this.specialization = specialization;
    }

    public TextField getUniversity() {
        return this.university;
    }

    public void setUniversity(TextField university) {
        this.university = university;
    }

    public PasswordField getPassword() {
        return this.password;
    }

    public void setPassword(PasswordField password) {
        this.password = password;
    }

    public Label getBirthdate() {
        return this.birthdate;
    }

    public void setBirthdate(Label birthdate) {
        this.birthdate = birthdate;
    }

    public DatePicker getDatePicker1() {
        return this.datePicker1;
    }

    public void setDatePicker1(DatePicker datePicker1) {
        this.datePicker1 = datePicker1;
    }

    public Label getRegistrationYear() {
        return this.registrationYear;
    }

    public void setRegistrationYear(Label registrationYear) {
        this.registrationYear = registrationYear;
    }

    public DatePicker getDatePicker2() {
        return this.datePicker2;
    }

    public void setDatePicker2(DatePicker datePicker2) {
        this.datePicker2 = datePicker2;
    }

    public CheckBox getCheckBox() {
        return this.checkBox;
    }

    public void setCheckBox(CheckBox checkBox) {
        this.checkBox = checkBox;
    }

    public Button getSubmit() {
        return this.submit;
    }

    public void setSubmit(Button submit) {
        this.submit = submit;
    }

    public LogupForm username(TextField username) {
        this.username = username;
        return this;
    }

    public LogupForm email(TextField email) {
        this.email = email;
        return this;
    }

    public LogupForm specialization(TextField specialization) {
        this.specialization = specialization;
        return this;
    }

    public LogupForm university(TextField university) {
        this.university = university;
        return this;
    }

    public LogupForm password(PasswordField password) {
        this.password = password;
        return this;
    }

    public LogupForm birthdate(Label birthdate) {
        this.birthdate = birthdate;
        return this;
    }

    public LogupForm datePicker1(DatePicker datePicker1) {
        this.datePicker1 = datePicker1;
        return this;
    }

    public LogupForm registrationYear(Label registrationYear) {
        this.registrationYear = registrationYear;
        return this;
    }

    public LogupForm datePicker2(DatePicker datePicker2) {
        this.datePicker2 = datePicker2;
        return this;
    }

    public LogupForm checkBox(CheckBox checkBox) {
        this.checkBox = checkBox;
        return this;
    }

    public LogupForm submit(Button submit) {
        this.submit = submit;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof LogupForm)) {
            return false;
        }
        LogupForm logupForm = (LogupForm) o;
        return Objects.equals(username, logupForm.username) && Objects.equals(email, logupForm.email) && Objects.equals(specialization, logupForm.specialization) && Objects.equals(university, logupForm.university) && Objects.equals(password, logupForm.password) && Objects.equals(birthdate, logupForm.birthdate) && Objects.equals(datePicker1, logupForm.datePicker1) && Objects.equals(registrationYear, logupForm.registrationYear) && Objects.equals(datePicker2, logupForm.datePicker2) && Objects.equals(checkBox, logupForm.checkBox) && Objects.equals(submit, logupForm.submit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, email, specialization, university, password, birthdate, datePicker1, registrationYear, datePicker2, checkBox, submit);
    }

    @Override
    public String toString() {
        return "{" +
            " username='" + getUsername() + "'" +
            ", email='" + getEmail() + "'" +
            ", specialization='" + getSpecialization() + "'" +
            ", university='" + getUniversity() + "'" +
            ", password='" + getPassword() + "'" +
            ", birthdate='" + getBirthdate() + "'" +
            ", datePicker1='" + getDatePicker1() + "'" +
            ", registrationYear='" + getRegistrationYear() + "'" +
            ", datePicker2='" + getDatePicker2() + "'" +
            ", checkBox='" + getCheckBox() + "'" +
            ", submit='" + getSubmit() + "'" +
            "}";
    }

}