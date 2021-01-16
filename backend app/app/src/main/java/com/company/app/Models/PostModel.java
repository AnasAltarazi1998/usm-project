package com.company.app.Models;

import java.util.Date;
import java.util.List;
import java.util.Objects;

public class PostModel {

    int id;
    String UserImage;
    String Title;
    String Value;
    String attach;
    List<UserModel> UserWhoMakeLike;
    List<CommentModel> CommentsInfo;
    Date Created_at;
    int rate;

    public PostModel() {
    }

    public PostModel(int id, String UserImage, String Title, String Value, String attach, List<UserModel> UserWhoMakeLike, List<CommentModel> CommentsInfo, Date Created_at, int rate) {
        this.id = id;
        this.UserImage = UserImage;
        this.Title = Title;
        this.Value = Value;
        this.attach = attach;
        this.UserWhoMakeLike = UserWhoMakeLike;
        this.CommentsInfo = CommentsInfo;
        this.Created_at = Created_at;
        this.rate = rate;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserImage() {
        return this.UserImage;
    }

    public void setUserImage(String UserImage) {
        this.UserImage = UserImage;
    }

    public String getTitle() {
        return this.Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public String getValue() {
        return this.Value;
    }

    public void setValue(String Value) {
        this.Value = Value;
    }

    public String getAttach() {
        return this.attach;
    }

    public void setAttach(String attach) {
        this.attach = attach;
    }

    public List<UserModel> getUserWhoMakeLike() {
        return this.UserWhoMakeLike;
    }

    public void setUserWhoMakeLike(List<UserModel> UserWhoMakeLike) {
        this.UserWhoMakeLike = UserWhoMakeLike;
    }

    public List<CommentModel> getCommentsInfo() {
        return this.CommentsInfo;
    }

    public void setCommentsInfo(List<CommentModel> CommentsInfo) {
        this.CommentsInfo = CommentsInfo;
    }

    public Date getCreated_at() {
        return this.Created_at;
    }

    public void setCreated_at(Date Created_at) {
        this.Created_at = Created_at;
    }

    public int getRate() {
        return this.rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public PostModel id(int id) {
        setId(id);
        return this;
    }

    public PostModel UserImage(String UserImage) {
        setUserImage(UserImage);
        return this;
    }

    public PostModel Title(String Title) {
        setTitle(Title);
        return this;
    }

    public PostModel Value(String Value) {
        setValue(Value);
        return this;
    }

    public PostModel attach(String attach) {
        setAttach(attach);
        return this;
    }

    public PostModel UserWhoMakeLike(List<UserModel> UserWhoMakeLike) {
        setUserWhoMakeLike(UserWhoMakeLike);
        return this;
    }

    public PostModel CommentsInfo(List<CommentModel> CommentsInfo) {
        setCommentsInfo(CommentsInfo);
        return this;
    }

    public PostModel Created_at(Date Created_at) {
        setCreated_at(Created_at);
        return this;
    }

    public PostModel rate(int rate) {
        setRate(rate);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof PostModel)) {
            return false;
        }
        PostModel postModel = (PostModel) o;
        return id == postModel.id && Objects.equals(UserImage, postModel.UserImage) && Objects.equals(Title, postModel.Title) && Objects.equals(Value, postModel.Value) && Objects.equals(attach, postModel.attach) && Objects.equals(UserWhoMakeLike, postModel.UserWhoMakeLike) && Objects.equals(CommentsInfo, postModel.CommentsInfo) && Objects.equals(Created_at, postModel.Created_at) && rate == postModel.rate;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, UserImage, Title, Value, attach, UserWhoMakeLike, CommentsInfo, Created_at, rate);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", UserImage='" + getUserImage() + "'" +
            ", Title='" + getTitle() + "'" +
            ", Value='" + getValue() + "'" +
            ", attach='" + getAttach() + "'" +
            ", UserWhoMakeLike='" + getUserWhoMakeLike() + "'" +
            ", CommentsInfo='" + getCommentsInfo() + "'" +
            ", Created_at='" + getCreated_at() + "'" +
            ", rate='" + getRate() + "'" +
            "}";
    }

}
