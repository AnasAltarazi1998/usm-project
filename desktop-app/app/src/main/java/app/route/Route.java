package app.route;

import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Popup;
import javafx.stage.Stage;

public class Route {
    static Stage stage;
    public static void setStage(Stage stage)
    {
        Route.stage = stage;
    }
    public static Stage getStage()
    {
        return stage;
    }
    public static void showError(String error){
        Popup popup;
        popup = new Popup();
        popup.setAutoHide(true);
        Label l = new Label(error);
        l.setFont(new Font("arial", 24));
        l.setTextFill(Color.WHITE);
        if(!popup.isShowing())
        popup.getContent().add(l);
        popup.show(stage);
        
    } 
}
