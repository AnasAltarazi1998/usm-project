package app.view.components;

import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
public class NavBarButton extends Button{

    public NavBarButton(String text,Node icon){
            super(text,icon);
        setBackground(new Background(new BackgroundFill(Color.rgb(131, 111, 169), new CornerRadii(0), Insets.EMPTY)));
        setMinSize(150,50);
        //setId("navbarbutton");
        
        // maxWidth(200);
        // maxHeight(100);
        setTextFill(Color.rgb(60, 59, 84));
        setFont(new Font("arial", 15));


    }
    
}
