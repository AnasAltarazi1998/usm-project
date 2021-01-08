package com.company.app.entities;

import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name = "boards")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")

public class BoardEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String image;
    private String description;
    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(name = "users_in_board", joinColumns = { @JoinColumn(name = "board_id") }, inverseJoinColumns = {
            @JoinColumn(name = "user_id") })
    private List<UserEntity> users;
    @OneToMany(mappedBy = "board")
    private List<ScholarEntity> scholarships;
    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(name = "profs_in_board", joinColumns = { @JoinColumn(name = "board_id") }, inverseJoinColumns = {
            @JoinColumn(name = "prof_id") })
    private List<ProfsEntity> profs;

    public BoardEntity() {
    }

    public BoardEntity(Long id, String name, String image, String description, List<UserEntity> users,
            List<ScholarEntity> scholarships, List<ProfsEntity> profs) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.description = description;
        this.users = users;
        this.scholarships = scholarships;
        this.profs = profs;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return this.image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<UserEntity> getUsers() {
        return this.users;
    }

    public void setUsers(List<UserEntity> users) {
        this.users = users;
    }

    public List<ScholarEntity> getScholarships() {
        return this.scholarships;
    }

    public void setScholarships(List<ScholarEntity> scholarships) {
        this.scholarships = scholarships;
    }

    public List<ProfsEntity> getProfs() {
        return this.profs;
    }

    public void setProfs(List<ProfsEntity> profs) {
        this.profs = profs;
    }

    public BoardEntity id(Long id) {
        this.id = id;
        return this;
    }

    public BoardEntity name(String name) {
        this.name = name;
        return this;
    }

    public BoardEntity image(String image) {
        this.image = image;
        return this;
    }

    public BoardEntity description(String description) {
        this.description = description;
        return this;
    }

    public BoardEntity users(List<UserEntity> users) {
        this.users = users;
        return this;
    }

    public BoardEntity scholarships(List<ScholarEntity> scholarships) {
        this.scholarships = scholarships;
        return this;
    }

    public BoardEntity profs(List<ProfsEntity> profs) {
        this.profs = profs;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof BoardEntity)) {
            return false;
        }
        BoardEntity boardEntity = (BoardEntity) o;
        return Objects.equals(id, boardEntity.id) && Objects.equals(name, boardEntity.name)
                && Objects.equals(image, boardEntity.image) && Objects.equals(description, boardEntity.description)
                && Objects.equals(users, boardEntity.users) && Objects.equals(scholarships, boardEntity.scholarships)
                && Objects.equals(profs, boardEntity.profs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, image, description, users, scholarships, profs);
    }

    @Override
    public String toString() {
        return "{" + " id='" + getId() + "'" + ", name='" + getName() + "'" + ", image='" + getImage() + "'"
                + ", description='" + getDescription() + "'" + ", users='" + getUsers() + "'" + ", scholarships='"
                + getScholarships() + "'" + ", profs='" + getProfs() + "'" + "}";
    }

}