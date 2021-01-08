package app.view.components;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Objects;

import javafx.geometry.Pos;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Rectangle;

public class BaseForm extends StackPane {

    ImageView bg;
    Rectangle rec;

    public BaseForm() throws FileNotFoundException {
        bg = new ImageView(new Image(new FileInputStream(new File("D:\\hellofx\\src\\main\\java\\assets\\baseformbg.png"))));
        rec = new Rectangle(400,400);
        getChildren().addAll(bg,rec);
        StackPane.setAlignment(bg, Pos.CENTER);
        StackPane.setAlignment(rec, Pos.CENTER);
        rec.setId("baseformrec");
        

    }
    public BaseForm(ImageView bg, Rectangle rec) {
        this.bg = bg;
        this.rec = rec;
    }

    public ImageView getBg() {
        return this.bg;
    }

    public void setBg(ImageView bg) {
        this.bg = bg;
    }

    public Rectangle getRec() {
        return this.rec;
    }

    public void setRec(Rectangle rec) {
        this.rec = rec;
    }

    public BaseForm bg(ImageView bg) {
        this.bg = bg;
        return this;
    }

    public BaseForm rec(Rectangle rec) {
        this.rec = rec;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof BaseForm)) {
            return false;
        }
        BaseForm baseForm = (BaseForm) o;
        return Objects.equals(bg, baseForm.bg) && Objects.equals(rec, baseForm.rec);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bg, rec);
    }

    @Override
    public String toString() {
        return "{" +
            " bg='" + getBg() + "'" +
            ", rec='" + getRec() + "'" +
            "}";
    }
    

    
}
