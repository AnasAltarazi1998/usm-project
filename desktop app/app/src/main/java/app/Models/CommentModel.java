package app.Models;

import java.util.Objects;

public class CommentModel {

    String UserName;
    String Value;

    public CommentModel() {
    }

    public CommentModel(String UserName, String Value) {
        this.UserName = UserName;
        this.Value = Value;
    }

    public String getUserName() {
        return this.UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public String getValue() {
        return this.Value;
    }

    public void setValue(String Value) {
        this.Value = Value;
    }

    public CommentModel UserName(String UserName) {
        this.UserName = UserName;
        return this;
    }

    public CommentModel Value(String Value) {
        this.Value = Value;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof CommentModel)) {
            return false;
        }
        CommentModel CommentModel = (CommentModel) o;
        return Objects.equals(UserName, CommentModel.UserName) && Objects.equals(Value, CommentModel.Value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(UserName, Value);
    }

    @Override
    public String toString() {
        return "{" + " UserName='" + getUserName() + "'" + ", Value='" + getValue() + "'" + "}";
    }

}
