package com.company.app.Models;

import java.util.Objects;

public class CommentModel {

    UserModel user;
    String Value;


    public CommentModel() {
    }

    public CommentModel(UserModel user, String Value) {
        this.user = user;
        this.Value = Value;
    }

    public UserModel getUser() {
        return this.user;
    }

    public void setUser(UserModel user) {
        this.user = user;
    }

    public String getValue() {
        return this.Value;
    }

    public void setValue(String Value) {
        this.Value = Value;
    }

    public CommentModel user(UserModel user) {
        setUser(user);
        return this;
    }

    public CommentModel Value(String Value) {
        setValue(Value);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof CommentModel)) {
            return false;
        }
        CommentModel commentModel = (CommentModel) o;
        return Objects.equals(user, commentModel.user) && Objects.equals(Value, commentModel.Value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user, Value);
    }

    @Override
    public String toString() {
        return "{" +
            " user='" + getUser() + "'" +
            ", Value='" + getValue() + "'" +
            "}";
    }
  
}
