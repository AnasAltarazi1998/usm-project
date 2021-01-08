package app.Models;

import java.util.Objects;

public class ProfsModel {

    String name;
    String image;
    String spec;

    public ProfsModel() {
    }

    public ProfsModel(String name, String image, String spec) {
        this.name = name;
        this.image = image;
        this.spec = spec;
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

    public String getSpec() {
        return this.spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }

    public ProfsModel name(String name) {
        this.name = name;
        return this;
    }

    public ProfsModel image(String image) {
        this.image = image;
        return this;
    }

    public ProfsModel spec(String spec) {
        this.spec = spec;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof ProfsModel)) {
            return false;
        }
        ProfsModel ProfsModel = (ProfsModel) o;
        return Objects.equals(name, ProfsModel.name) && Objects.equals(image, ProfsModel.image)
                && Objects.equals(spec, ProfsModel.spec);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, image, spec);
    }

    @Override
    public String toString() {
        return "{" + " name='" + getName() + "'" + ", image='" + getImage() + "'" + ", spec='" + getSpec() + "'" + "}";
    }

}
