package com.company.app.Models;

import java.util.Date;
import java.util.Objects;

public class ScholarshipModel {
    String title;
    String attach;
    Date date;
    Date expiredDate;

    public ScholarshipModel() {
    }

    public ScholarshipModel(String title, String attach, Date date, Date expiredDate) {
        this.title = title;
        this.attach = attach;
        this.date = date;
        this.expiredDate = expiredDate;
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

    public Date getExpiredDate() {
        return this.expiredDate;
    }

    public void setExpiredDate(Date expiredDate) {
        this.expiredDate = expiredDate;
    }

    public ScholarshipModel title(String title) {
        this.title = title;
        return this;
    }

    public ScholarshipModel attach(String attach) {
        this.attach = attach;
        return this;
    }

    public ScholarshipModel date(Date date) {
        this.date = date;
        return this;
    }

    public ScholarshipModel expiredDate(Date expiredDate) {
        this.expiredDate = expiredDate;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof ScholarshipModel)) {
            return false;
        }
        ScholarshipModel scholarship = (ScholarshipModel) o;
        return Objects.equals(title, scholarship.title) && Objects.equals(attach, scholarship.attach)
                && Objects.equals(date, scholarship.date) && Objects.equals(expiredDate, scholarship.expiredDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, attach, date, expiredDate);
    }

    @Override
    public String toString() {
        return "{" + " title='" + getTitle() + "'" + ", attach='" + getAttach() + "'" + ", date='" + getDate() + "'"
                + ", expiredDate='" + getExpiredDate() + "'" + "}";
    }

}
