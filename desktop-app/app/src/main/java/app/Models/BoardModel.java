package app.Models;

import java.util.List;
import java.util.Objects;

public class BoardModel {
    String name;
    List<ScholarshipModel> scholarship;
    List<ProfsModel> profs;
    String image;
    String description;

    public BoardModel() {
    }

    public BoardModel(String name, List<ScholarshipModel> scholarship, List<ProfsModel> profs, String image, String description) {
        this.name = name;
        this.scholarship = scholarship;
        this.profs = profs;
        this.image = image;
        this.description = description;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ScholarshipModel> getScholarship() {
        return this.scholarship;
    }

    public void setScholarship(List<ScholarshipModel> scholarship) {
        this.scholarship = scholarship;
    }

    public List<ProfsModel> getProfs() {
        return this.profs;
    }

    public void setProfs(List<ProfsModel> profs) {
        this.profs = profs;
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

    public BoardModel name(String name) {
        this.name = name;
        return this;
    }

    public BoardModel scholarship(List<ScholarshipModel> scholarship) {
        this.scholarship = scholarship;
        return this;
    }

    public BoardModel profs(List<ProfsModel> profs) {
        this.profs = profs;
        return this;
    }

    public BoardModel image(String image) {
        this.image = image;
        return this;
    }

    public BoardModel description(String description) {
        this.description = description;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof BoardModel)) {
            return false;
        }
        BoardModel boardModel = (BoardModel) o;
        return Objects.equals(name, boardModel.name) && Objects.equals(scholarship, boardModel.scholarship) && Objects.equals(profs, boardModel.profs) && Objects.equals(image, boardModel.image) && Objects.equals(description, boardModel.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, scholarship, profs, image, description);
    }

    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", scholarship='" + getScholarship() + "'" +
            ", profs='" + getProfs() + "'" +
            ", image='" + getImage() + "'" +
            ", description='" + getDescription() + "'" +
            "}";
    }

}
