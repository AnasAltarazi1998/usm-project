package app.view.components;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class RightProfile extends VBox {
    ImageView sticker ;
    Button chat;

    public RightProfile() throws FileNotFoundException
    {
        super();
        setBackground(new Background(new BackgroundFill(Color.rgb(255, 255, 255), CornerRadii.EMPTY, Insets.EMPTY)));
        setMinSize(600, 542);

        chat = new Button("Chat");
        chat.setTextFill(Color.rgb(255, 255, 255));
        chat.setFont(new Font("Arial", 20));
        chat.setBackground(new Background(new BackgroundFill(Color.rgb(131, 111, 169), new CornerRadii(5), Insets.EMPTY)));
        chat.setMinWidth(200);
        chat.setMinHeight(29);
        chat.setId("chatprofile");
       // Polygon= new ImageView(new Image(new FileInputStream("./src/assets/Polygon.png")));
        // Polygon.setFitHeight(2000);
        // Polygon.setFitWidth(4000);
        // Polygon.setTranslateX(-1500);
        // Polygon.setTranslateY(0);
        sticker = new ImageView(new Image(new FileInputStream("./src/assets/sticker.png")));
        sticker.setFitHeight(300);
        sticker.setFitWidth(350);
        setMargin(chat, new Insets(300, 20, 20, 200));
        setMargin(sticker, new Insets(100, 20, 20, 150)); 
        getChildren().addAll(chat,sticker);

    }
    
}
