package com.company.app.entities;

import java.util.Date;
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
@Table(name = "scholarships")
@JsonIdentityInfo(
    generator = ObjectIdGenerators.PropertyGenerator.class,
    property = "id"
)

public class ScholarEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "board_id", nullable=false)
    private BoardEntity board;
    private String title;
    private String attach;
    private Date date;
    private Date expire_date;

    public ScholarEntity() {
    }

    public ScholarEntity(Long id, BoardEntity board, String title, String attach, Date date, Date expire_date) {
        this.id = id;
        this.board = board;
        this.title = title;
        this.attach = attach;
        this.date = date;
        this.expire_date = expire_date;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BoardEntity getBoard() {
        return this.board;
    }

    public void setBoard(BoardEntity board) {
        this.board = board;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAttach() {
        return this.attach;
    }

    public void setAttach(String attach) {
        this.attach = attach;
    }

    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getExpire_date() {
        return this.expire_date;
    }

    public void setExpire_date(Date expire_date) {
        this.expire_date = expire_date;
    }

    public ScholarEntity id(Long id) {
        this.id = id;
        return this;
    }

    public ScholarEntity board(BoardEntity board) {
        this.board = board;
        return this;
    }

    public ScholarEntity title(String title) {
        this.title = title;
        return this;
    }

    public ScholarEntity attach(String attach) {
        this.attach = attach;
        return this;
    }

    public ScholarEntity date(Date date) {
        this.date = date;
        return this;
    }

    public ScholarEntity expire_date(Date expire_date) {
        this.expire_date = expire_date;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof ScholarEntity)) {
            return false;
        }
        ScholarEntity scholarEntity = (ScholarEntity) o;
        return Objects.equals(id, scholarEntity.id) && Objects.equals(board, scholarEntity.board) && Objects.equals(title, scholarEntity.title) && Objects.equals(attach, scholarEntity.attach) && Objects.equals(date, scholarEntity.date) && Objects.equals(expire_date, scholarEntity.expire_date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, board, title, attach, date, expire_date);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", board='" + getBoard() + "'" +
            ", title='" + getTitle() + "'" +
            ", attach='" + getAttach() + "'" +
            ", date='" + getDate() + "'" +
            ", expire_date='" + getExpire_date() + "'" +
            "}";
    }


}