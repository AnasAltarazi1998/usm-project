package app.view.components;

import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import de.jensd.fx.glyphs.GlyphsDude;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIcon;
public class NavBarButton extends Button{

    public NavBarButton(){
        super("test", GlyphsDude.createIcon(FontAwesomeIcon.BACKWARD,"20"));
        maxWidth(200);
        maxHeight(100);
        setTextFill(Color.rgb(60, 59, 84));
        setFont(new Font("arial", 15));


    }
    
}
