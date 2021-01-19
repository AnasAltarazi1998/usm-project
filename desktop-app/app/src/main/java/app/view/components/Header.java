package app.view.components;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class Header extends HBox{
   
    private ImageView img;
    private Label USM;

    public Header() throws FileNotFoundException {
        super();
        USM = new Label("USM");
        USM.setFont(new Font("arial", 32));
        USM.setTextFill(Color.WHITE);
        img = new ImageView(new Image(new FileInputStream("./src/assets/logo.png")));
        img.setFitWidth(100);
        img.setFitHeight(100);
        getChildren().addAll(img, USM);
    }

    
    public ImageView getImg() {
        return this.img;
    }

    public void setImg(ImageView img) {
        this.img = img;
    }

    public Label getUSM() {
        return this.USM;
    }

    public void setUSM(Label USM) {
        this.USM = USM;
    }

    
}
