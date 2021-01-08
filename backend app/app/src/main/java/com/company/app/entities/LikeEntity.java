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
@Table(name = "likes")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")

public class LikeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "u_id", nullable = false)
    private UserEntity uEntity;
    @ManyToOne
    @JoinColumn(name = "p_id", nullable = false)
    private PostEntity pEntity;

    public LikeEntity() {
    }

    public LikeEntity(Long id, UserEntity uEntity, PostEntity pEntity) {
        this.id = id;
        this.uEntity = uEntity;
        this.pEntity = pEntity;
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

    public LikeEntity id(Long id) {
        this.id = id;
        return this;
    }

    public LikeEntity uEntity(UserEntity uEntity) {
        this.uEntity = uEntity;
        return this;
    }

    public LikeEntity pEntity(PostEntity pEntity) {
        this.pEntity = pEntity;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof LikeEntity)) {
            return false;
        }
        LikeEntity likeEntity = (LikeEntity) o;
        return Objects.equals(id, likeEntity.id) && Objects.equals(uEntity, likeEntity.uEntity)
                && Objects.equals(pEntity, likeEntity.pEntity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, uEntity, pEntity);
    }

    @Override
    public String toString() {
        return "{" + " id='" + getId() + "'" + ", uEntity='" + getUEntity() + "'" + ", pEntity='" + getPEntity() + "'"
                + "}";
    }

}