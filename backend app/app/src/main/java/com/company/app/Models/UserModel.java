package com.company.app.Models;

import java.util.Date;
import java.util.Objects;

public class UserModel {

    private int id ;
    private String name ;
    private String email ;
    private String password ;
    private String spec ;
    private String university ;
    private String img ;
    private String community_name ;
    private int  study_year ;
    private Date  start_year ;
    private Date  age ;


    public UserModel() {
    }

    public UserModel(int id, String name, String email, String password, String spec, String university, String img, String community_name, int study_year, Date start_year, Date age) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.spec = spec;
        this.university = university;
        this.img = img;
        this.community_name = community_name;
        this.study_year = study_year;
        this.start_year = start_year;
        this.age = age;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSpec() {
        return this.spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }

    public String getUniversity() {
        return this.university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getImg() {
        return this.img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getCommunity_name() {
        return this.community_name;
    }

    public void setCommunity_name(String community_name) {
        this.community_name = community_name;
    }

    public int getStudy_year() {
        return this.study_year;
    }

    public void setStudy_year(int study_year) {
        this.study_year = study_year;
    }

    public Date getStart_year() {
        return this.start_year;
    }

    public void setStart_year(Date start_year) {
        this.start_year = start_year;
    }

    public Date getAge() {
        return this.age;
    }

    public void setAge(Date age) {
        this.age = age;
    }

    public UserModel id(int id) {
        this.id = id;
        return this;
    }

    public UserModel name(String name) {
        this.name = name;
        return this;
    }

    public UserModel email(String email) {
        this.email = email;
        return this;
    }

    public UserModel password(String password) {
        this.password = password;
        return this;
    }

    public UserModel spec(String spec) {
        this.spec = spec;
        return this;
    }

    public UserModel university(String university) {
        this.university = university;
        return this;
    }

    public UserModel img(String img) {
        this.img = img;
        return this;
    }

    public UserModel community_name(String community_name) {
        this.community_name = community_name;
        return this;
    }

    public UserModel study_year(int study_year) {
        this.study_year = study_year;
        return this;
    }

    public UserModel start_year(Date start_year) {
        this.start_year = start_year;
        return this;
    }

    public UserModel age(Date age) {
        this.age = age;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof UserModel)) {
            return false;
        }
        UserModel UserModel = (UserModel) o;
        return id == UserModel.id && Objects.equals(name, UserModel.name) && Objects.equals(email, UserModel.email) && Objects.equals(password, UserModel.password) && Objects.equals(spec, UserModel.spec) && Objects.equals(university, UserModel.university) && Objects.equals(img, UserModel.img) && Objects.equals(community_name, UserModel.community_name) && study_year == UserModel.study_year && Objects.equals(start_year, UserModel.start_year) && Objects.equals(age, UserModel.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, email, password, spec, university, img, community_name, study_year, start_year, age);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", name='" + getName() + "'" +
            ", email='" + getEmail() + "'" +
            ", password='" + getPassword() + "'" +
            ", spec='" + getSpec() + "'" +
            ", university='" + getUniversity() + "'" +
            ", img='" + getImg() + "'" +
            ", community_name='" + getCommunity_name() + "'" +
            ", study_year='" + getStudy_year() + "'" +
            ", start_year='" + getStart_year() + "'" +
            ", age='" + getAge() + "'" +
            "}";
    }

}
