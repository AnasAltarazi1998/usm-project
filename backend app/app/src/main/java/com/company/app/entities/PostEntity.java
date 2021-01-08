package com.company.app.entities;

import java.util.Date;
import java.util.List;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
@Entity
@Table(name = "posts")
@JsonIdentityInfo(
    generator = ObjectIdGenerators.PropertyGenerator.class,
    property = "id"
)

public class PostEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "u_id" , nullable = true)
    private UserEntity uEntity;
    private String title;
    private String value;
    private String attach;
    @OneToMany(mappedBy = "pEntity")
    private List<LikeEntity> likes;
    @OneToMany(mappedBy = "pEntity")
    private List<CommentEntity> comments;
    @JsonFormat(pattern = "yyyy-mm-dd")
    private Date created_at;
    @ManyToOne
    @JoinColumn(name = "com_id")
    private CommunityEntity pcommuninty;


    public PostEntity() {
    }

    public PostEntity(Long id, UserEntity uEntity, String title, String value, String attach, List<LikeEntity> likes, List<CommentEntity> comments, Date created_at, CommunityEntity pcommuninty) {
        this.id = id;
        this.uEntity = uEntity;
        this.title = title;
        this.value = value;
        this.attach = attach;
        this.likes = likes;
        this.comments = comments;
        this.created_at = created_at;
        this.pcommuninty = pcommuninty;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public UserEntity getUEntity() {
        return this.uEntity;
    }

    public void setUEntity(UserEntity uEntity) {
        this.uEntity = uEntity;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getAttach() {
        return this.attach;
    }

    public void setAttach(String attach) {
        this.attach = attach;
    }

    public List<LikeEntity> getLikes() {
        return this.likes;
    }

    public void setLikes(List<LikeEntity> likes) {
        this.likes = likes;
    }

    public List<CommentEntity> getComments() {
        return this.comments;
    }

    public void setComments(List<CommentEntity> comments) {
        this.comments = comments;
    }

    public Date getCreated_at() {
        return this.created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public CommunityEntity getPcommuninty() {
        return this.pcommuninty;
    }

    public void setPcommuninty(CommunityEntity pcommuninty) {
        this.pcommuninty = pcommuninty;
    }

    public PostEntity id(Long id) {
        this.id = id;
        return this;
    }

    public PostEntity uEntity(UserEntity uEntity) {
        this.uEntity = uEntity;
        return this;
    }

    public PostEntity title(String title) {
        this.title = title;
        return this;
    }

    public PostEntity value(String value) {
        this.value = value;
        return this;
    }

    public PostEntity attach(String attach) {
        this.attach = attach;
        return this;
    }

    public PostEntity likes(List<LikeEntity> likes) {
        this.likes = likes;
        return this;
    }

    public PostEntity comments(List<CommentEntity> comments) {
        this.comments = comments;
        return this;
    }

    public PostEntity created_at(Date created_at) {
        this.created_at = created_at;
        return this;
    }

    public PostEntity pcommuninty(CommunityEntity pcommuninty) {
        this.pcommuninty = pcommuninty;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof PostEntity)) {
            return false;
        }
        PostEntity postEntity = (PostEntity) o;
        return Objects.equals(id, postEntity.id) && Objects.equals(uEntity, postEntity.uEntity) && Objects.equals(title, postEntity.title) && Objects.equals(value, postEntity.value) && Objects.equals(attach, postEntity.attach) && Objects.equals(likes, postEntity.likes) && Objects.equals(comments, postEntity.comments) && Objects.equals(created_at, postEntity.created_at) && Objects.equals(pcommuninty, postEntity.pcommuninty);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, uEntity, title, value, attach, likes, comments, created_at, pcommuninty);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", uEntity='" + getUEntity() + "'" +
            ", title='" + getTitle() + "'" +
            ", value='" + getValue() + "'" +
            ", attach='" + getAttach() + "'" +
            ", likes='" + getLikes() + "'" +
            ", comments='" + getComments() + "'" +
            ", created_at='" + getCreated_at() + "'" +
            ", pcommuninty='" + getPcommuninty() + "'" +
            "}";
    }
  


}