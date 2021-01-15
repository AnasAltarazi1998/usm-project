package com.company.app.entities;

import java.util.Date;
import java.util.List;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name = "user")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class UserEntity {
    /**
     * attrs area
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    @Column(name = "name")
    private String name;
    private String email;
    private String password;
    private String university;
    @Column(name = "specialize")
    private String community_name;
    private Integer study_year;
    @JsonFormat(pattern = "yyyy-mm")
    private Date start_year;
    @JsonFormat(pattern = "yyyy-mm-dd")
    private Date age;
    @JsonIgnore
    private boolean flag;
    @JsonFormat(pattern = "yyyy-mm-dd")
    private Date created_at;
    private String img;

    /**
     * relational attrs
     */
    @ManyToOne
    @JoinColumn(name = "com_id", nullable = true)
    private CommunityEntity communinty;

    @OneToMany(mappedBy = "uEntity")
    List<PostEntity> posts;

    @OneToMany(mappedBy = "uEntity")
    List<LikeEntity> likes;

    @ManyToMany(mappedBy = "users")
    List<BoardEntity> boards;

    @OneToMany(mappedBy = "uEntity")
    List<CommentEntity> comments;

    // @OneToOne(mappedBy = "admin")
    // private CommunityEntity comm_admin;
    /**
     * constructors
     */

    public UserEntity() {
    }

    public UserEntity(Long id, String name, String email, String password, String university, String community_name, Integer study_year, Date start_year, Date age, boolean flag, Date created_at, String img, CommunityEntity communinty, List<PostEntity> posts, List<LikeEntity> likes, List<BoardEntity> boards, List<CommentEntity> comments) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.university = university;
        this.community_name = community_name;
        this.study_year = study_year;
        this.start_year = start_year;
        this.age = age;
        this.flag = flag;
        this.created_at = created_at;
        this.img = img;
        this.communinty = communinty;
        this.posts = posts;
        this.likes = likes;
        this.boards = boards;
        this.comments = comments;
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

    public String getUniversity() {
        return this.university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getCommunity_name() {
        return this.community_name;
    }

    public void setCommunity_name(String community_name) {
        this.community_name = community_name;
    }

    public Integer getStudy_year() {
        return this.study_year;
    }

    public void setStudy_year(Integer study_year) {
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

    public boolean isFlag() {
        return this.flag;
    }

    public boolean getFlag() {
        return this.flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public Date getCreated_at() {
        return this.created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public String getImg() {
        return this.img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public CommunityEntity getCommuninty() {
        return this.communinty;
    }

    public void setCommuninty(CommunityEntity communinty) {
        this.communinty = communinty;
    }

    public List<PostEntity> getPosts() {
        return this.posts;
    }

    public void setPosts(List<PostEntity> posts) {
        this.posts = posts;
    }

    public List<LikeEntity> getLikes() {
        return this.likes;
    }

    public void setLikes(List<LikeEntity> likes) {
        this.likes = likes;
    }

    public List<BoardEntity> getBoards() {
        return this.boards;
    }

    public void setBoards(List<BoardEntity> boards) {
        this.boards = boards;
    }

    public List<CommentEntity> getComments() {
        return this.comments;
    }

    public void setComments(List<CommentEntity> comments) {
        this.comments = comments;
    }

    public UserEntity id(Long id) {
        setId(id);
        return this;
    }

    public UserEntity name(String name) {
        setName(name);
        return this;
    }

    public UserEntity email(String email) {
        setEmail(email);
        return this;
    }

    public UserEntity password(String password) {
        setPassword(password);
        return this;
    }

    public UserEntity university(String university) {
        setUniversity(university);
        return this;
    }

    public UserEntity community_name(String community_name) {
        setCommunity_name(community_name);
        return this;
    }

    public UserEntity study_year(Integer study_year) {
        setStudy_year(study_year);
        return this;
    }

    public UserEntity start_year(Date start_year) {
        setStart_year(start_year);
        return this;
    }

    public UserEntity age(Date age) {
        setAge(age);
        return this;
    }

    public UserEntity flag(boolean flag) {
        setFlag(flag);
        return this;
    }

    public UserEntity created_at(Date created_at) {
        setCreated_at(created_at);
        return this;
    }

    public UserEntity img(String img) {
        setImg(img);
        return this;
    }

    public UserEntity communinty(CommunityEntity communinty) {
        setCommuninty(communinty);
        return this;
    }

    public UserEntity posts(List<PostEntity> posts) {
        setPosts(posts);
        return this;
    }

    public UserEntity likes(List<LikeEntity> likes) {
        setLikes(likes);
        return this;
    }

    public UserEntity boards(List<BoardEntity> boards) {
        setBoards(boards);
        return this;
    }

    public UserEntity comments(List<CommentEntity> comments) {
        setComments(comments);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof UserEntity)) {
            return false;
        }
        UserEntity userEntity = (UserEntity) o;
        return Objects.equals(id, userEntity.id) && Objects.equals(name, userEntity.name) && Objects.equals(email, userEntity.email) && Objects.equals(password, userEntity.password) && Objects.equals(university, userEntity.university) && Objects.equals(community_name, userEntity.community_name) && Objects.equals(study_year, userEntity.study_year) && Objects.equals(start_year, userEntity.start_year) && Objects.equals(age, userEntity.age) && flag == userEntity.flag && Objects.equals(created_at, userEntity.created_at) && Objects.equals(img, userEntity.img) && Objects.equals(communinty, userEntity.communinty) && Objects.equals(posts, userEntity.posts) && Objects.equals(likes, userEntity.likes) && Objects.equals(boards, userEntity.boards) && Objects.equals(comments, userEntity.comments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, email, password, university, community_name, study_year, start_year, age, flag, created_at, img, communinty, posts, likes, boards, comments);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", name='" + getName() + "'" +
            ", email='" + getEmail() + "'" +
            ", password='" + getPassword() + "'" +
            ", university='" + getUniversity() + "'" +
            ", community_name='" + getCommunity_name() + "'" +
            ", study_year='" + getStudy_year() + "'" +
            ", start_year='" + getStart_year() + "'" +
            ", age='" + getAge() + "'" +
            ", flag='" + isFlag() + "'" +
            ", created_at='" + getCreated_at() + "'" +
            ", img='" + getImg() + "'" +
            ", communinty='" + getCommuninty() + "'" +
            ", posts='" + getPosts() + "'" +
            ", likes='" + getLikes() + "'" +
            ", boards='" + getBoards() + "'" +
            ", comments='" + getComments() + "'" +
            "}";
    }

}