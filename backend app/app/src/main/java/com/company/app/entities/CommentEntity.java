package com.company.app.entities;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
@Entity
@Table(name = "comments")
@JsonIdentityInfo(
    generator = ObjectIdGenerators.PropertyGenerator.class,
    property = "id"
)

public class CommentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "u_id", nullable = true)
    private UserEntity uEntity;
    @ManyToOne
    @JoinColumn(name = "p_id", nullable = true)
    private PostEntity pEntity;
    private String value;


    public CommentEntity() {
    }

    public CommentEntity(Long id, UserEntity uEntity, PostEntity pEntity, String value) {
        this.id = id;
        this.uEntity = uEntity;
        this.pEntity = pEntity;
        this.value = value;
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

    public PostEntity getPEntity() {
        return this.pEntity;
    }

    public void setPEntity(PostEntity pEntity) {
        this.pEntity = pEntity;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public CommentEntity id(Long id) {
        this.id = id;
        return this;
    }

    public CommentEntity uEntity(UserEntity uEntity) {
        this.uEntity = uEntity;
        return this;
    }

    public CommentEntity pEntity(PostEntity pEntity) {
        this.pEntity = pEntity;
        return this;
    }

    public CommentEntity value(String value) {
        this.value = value;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof CommentEntity)) {
            return false;
        }
        CommentEntity commentEntity = (CommentEntity) o;
        return Objects.equals(id, commentEntity.id) && Objects.equals(uEntity, commentEntity.uEntity) && Objects.equals(pEntity, commentEntity.pEntity) && Objects.equals(value, commentEntity.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, uEntity, pEntity, value);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", uEntity='" + getUEntity() + "'" +
            ", pEntity='" + getPEntity() + "'" +
            ", value='" + getValue() + "'" +
            "}";
    }

}