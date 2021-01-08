package com.company.app.Models;

import java.util.List;
import java.util.Objects;

public class CommunityModel {
    String name;
    String description;
    String img;
    List<UserModel> users;
    List<PostModel> posts; 

    public CommunityModel() {
    }

    public CommunityModel(String name, String description, String img, List<UserModel> users, List<PostModel> posts) {
        this.name = name;
        this.description = description;
        this.img = img;
        this.users = users;
        this.posts = posts;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImg() {
        return this.img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public List<UserModel> getUsers() {
        return this.users;
    }

    public void setUsers(List<UserModel> users) {
        this.users = users;
    }

    public List<PostModel> getPosts() {
        return this.posts;
    }

    public void setPosts(List<PostModel> posts) {
        this.posts = posts;
    }

    public CommunityModel name(String name) {
        this.name = name;
        return this;
    }

    public CommunityModel description(String description) {
        this.description = description;
        return this;
    }

    public CommunityModel img(String img) {
        this.img = img;
        return this;
    }

    public CommunityModel users(List<UserModel> users) {
        this.users = users;
        return this;
    }

    public CommunityModel posts(List<PostModel> posts) {
        this.posts = posts;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof CommunityModel)) {
            return false;
        }
        CommunityModel communityModel = (CommunityModel) o;
        return Objects.equals(name, communityModel.name) && Objects.equals(description, communityModel.description) && Objects.equals(img, communityModel.img) && Objects.equals(users, communityModel.users) && Objects.equals(posts, communityModel.posts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, img, users, posts);
    }

    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", description='" + getDescription() + "'" +
            ", img='" + getImg() + "'" +
            ", users='" + getUsers() + "'" +
            ", posts='" + getPosts() + "'" +
            "}";
    }

}
