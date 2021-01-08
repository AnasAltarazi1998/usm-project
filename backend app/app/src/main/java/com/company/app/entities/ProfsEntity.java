package com.company.app.entities;

import java.util.Date;
import java.util.List;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name = "profs")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")

public class ProfsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String email;
    private String password;
    private String spec;
    private Date created_at;
    private String image;
    @ManyToMany(mappedBy = "profs")
    private List<BoardEntity> boards;

    public ProfsEntity() {
    }

    public ProfsEntity(Long id, String name, String email, String password, String spec, Date created_at, String image,
            List<BoardEntity> boards) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.spec = spec;
        this.created_at = created_at;
        this.image = image;
        this.boards = boards;
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

    public Date getCreated_at() {
        return this.created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public String getImage() {
        return this.image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public List<BoardEntity> getBoards() {
        return this.boards;
    }

    public void setBoards(List<BoardEntity> boards) {
        this.boards = boards;
    }

    public ProfsEntity id(Long id) {
        this.id = id;
        return this;
    }

    public ProfsEntity name(String name) {
        this.name = name;
        return this;
    }

    public ProfsEntity email(String email) {
        this.email = email;
        return this;
    }

    public ProfsEntity password(String password) {
        this.password = password;
        return this;
    }

    public ProfsEntity spec(String spec) {
        this.spec = spec;
        return this;
    }

    public ProfsEntity created_at(Date created_at) {
        this.created_at = created_at;
        return this;
    }

    public ProfsEntity image(String image) {
        this.image = image;
        return this;
    }

    public ProfsEntity boards(List<BoardEntity> boards) {
        this.boards = boards;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof ProfsEntity)) {
            return false;
        }
        ProfsEntity profEntity = (ProfsEntity) o;
        return Objects.equals(id, profEntity.id) && Objects.equals(name, profEntity.name)
                && Objects.equals(email, profEntity.email) && Objects.equals(password, profEntity.password)
                && Objects.equals(spec, profEntity.spec) && Objects.equals(created_at, profEntity.created_at)
                && Objects.equals(image, profEntity.image) && Objects.equals(boards, profEntity.boards);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, email, password, spec, created_at, image, boards);
    }

    @Override
    public String toString() {
        return "{" + " id='" + getId() + "'" + ", name='" + getName() + "'" + ", email='" + getEmail() + "'"
                + ", password='" + getPassword() + "'" + ", spec='" + getSpec() + "'" + ", created_at='"
                + getCreated_at() + "'" + ", image='" + getImage() + "'" + ", boards='" + getBoards() + "'" + "}";
    }

}