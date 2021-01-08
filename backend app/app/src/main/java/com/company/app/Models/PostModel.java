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
    int LikeCount;
    List<UserModel> UserWhoMakeLike;
    int CommentCount;
    List<CommentModel> CommentsInfo;
    Date Created_at;
    int rate;
    CommunityModel communityModel;

    public PostModel() {
    }

    public PostModel(int id, String UserImage, String Title, String Value, String attach, int LikeCount, List<UserModel> UserWhoMakeLike, int CommentCount, List<CommentModel> CommentsInfo, Date Created_at, int rate, CommunityModel communityModel) {
        this.id = id;
        this.UserImage = UserImage;
        this.Title = Title;
        this.Value = Value;
        this.attach = attach;
        this.LikeCount = LikeCount;
        this.UserWhoMakeLike = UserWhoMakeLike;
        this.CommentCount = CommentCount;
        this.CommentsInfo = CommentsInfo;
        this.Created_at = Created_at;
        this.rate = rate;
        this.communityModel = communityModel;
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

    public int getLikeCount() {
        return this.LikeCount;
    }

    public void setLikeCount(int LikeCount) {
        this.LikeCount = LikeCount;
    }

    public List<UserModel> getUserWhoMakeLike() {
        return this.UserWhoMakeLike;
    }

    public void setUserWhoMakeLike(List<UserModel> UserWhoMakeLike) {
        this.UserWhoMakeLike = UserWhoMakeLike;
    }

    public int getCommentCount() {
        return this.CommentCount;
    }

    public void setCommentCount(int CommentCount) {
        this.CommentCount = CommentCount;
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

    public CommunityModel getCommunityModel() {
        return this.communityModel;
    }

    public void setCommunityModel(CommunityModel communityModel) {
        this.communityModel = communityModel;
    }

    public PostModel id(int id) {
        this.id = id;
        return this;
    }

    public PostModel UserImage(String UserImage) {
        this.UserImage = UserImage;
        return this;
    }

    public PostModel Title(String Title) {
        this.Title = Title;
        return this;
    }

    public PostModel Value(String Value) {
        this.Value = Value;
        return this;
    }

    public PostModel attach(String attach) {
        this.attach = attach;
        return this;
    }

    public PostModel LikeCount(int LikeCount) {
        this.LikeCount = LikeCount;
        return this;
    }

    public PostModel UserWhoMakeLike(List<UserModel> UserWhoMakeLike) {
        this.UserWhoMakeLike = UserWhoMakeLike;
        return this;
    }

    public PostModel CommentCount(int CommentCount) {
        this.CommentCount = CommentCount;
        return this;
    }

    public PostModel CommentsInfo(List<CommentModel> CommentsInfo) {
        this.CommentsInfo = CommentsInfo;
        return this;
    }

    public PostModel Created_at(Date Created_at) {
        this.Created_at = Created_at;
        return this;
    }

    public PostModel rate(int rate) {
        this.rate = rate;
        return this;
    }

    public PostModel communityModel(CommunityModel communityModel) {
        this.communityModel = communityModel;
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
        return id == postModel.id && Objects.equals(UserImage, postModel.UserImage) && Objects.equals(Title, postModel.Title) && Objects.equals(Value, postModel.Value) && Objects.equals(attach, postModel.attach) && LikeCount == postModel.LikeCount && Objects.equals(UserWhoMakeLike, postModel.UserWhoMakeLike) && CommentCount == postModel.CommentCount && Objects.equals(CommentsInfo, postModel.CommentsInfo) && Objects.equals(Created_at, postModel.Created_at) && rate == postModel.rate && Objects.equals(communityModel, postModel.communityModel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, UserImage, Title, Value, attach, LikeCount, UserWhoMakeLike, CommentCount, CommentsInfo, Created_at, rate, communityModel);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", UserImage='" + getUserImage() + "'" +
            ", Title='" + getTitle() + "'" +
            ", Value='" + getValue() + "'" +
            ", attach='" + getAttach() + "'" +
            ", LikeCount='" + getLikeCount() + "'" +
            ", UserWhoMakeLike='" + getUserWhoMakeLike() + "'" +
            ", CommentCount='" + getCommentCount() + "'" +
            ", CommentsInfo='" + getCommentsInfo() + "'" +
            ", Created_at='" + getCreated_at() + "'" +
            ", rate='" + getRate() + "'" +
            ", communityModel='" + getCommunityModel() + "'" +
            "}";
    }

}
