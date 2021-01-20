package app.view.components;

import java.io.FileNotFoundException;

import app.Controllers.UserController;
import app.Models.UserModel;
import app.route.Route;
import app.view.pages.Profile;
import app.view.pages.settings;
import de.jensd.fx.glyphs.GlyphsDude;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIcon;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

public class NavBar extends VBox {
   
    Header header;
    NavBarButton navBarButtons[] = new NavBarButton[7];
    UserController userController = UserController.getInstance();

    public NavBar() throws FileNotFoundException
    {
        super();
        header = new Header();
        for (int i = 0; i < navBarButtons.length; i++) {
            if(i==0)
            navBarButtons[i] = new NavBarButton("Profile", GlyphsDude.createIcon(FontAwesomeIcon.USER,"20"));

            else if(i==1)
            navBarButtons[i] = new NavBarButton("profile", GlyphsDude.createIcon(FontAwesomeIcon.USER,"20"));

            else if(i==2)
            navBarButtons[i] = new NavBarButton("profile", GlyphsDude.createIcon(FontAwesomeIcon.USER,"20"));

            else if(i==3)
            navBarButtons[i] = new NavBarButton("profile", GlyphsDude.createIcon(FontAwesomeIcon.USER,"20"));

            else if(i==4)
            navBarButtons[i] = new NavBarButton("profile", GlyphsDude.createIcon(FontAwesomeIcon.USER,"20"));

            else if(i==5)
            navBarButtons[i] = new NavBarButton("profile", GlyphsDude.createIcon(FontAwesomeIcon.USER,"20"));

            else
            navBarButtons[i] = new NavBarButton("Settings", GlyphsDude.createIcon(FontAwesomeIcon.COGS,"20"));

              setMargin(navBarButtons[i], new Insets(40,0,0 ,0));     
                 
        }
        navBarButtons[0].setOnAction((ActionEvent e) ->{
            
                try {
                profileRoute(userController.getUserModel());
            } catch (FileNotFoundException e1) {
               
                e1.printStackTrace();
            }
            
        });
        navBarButtons[6].setOnAction((ActionEvent e) ->{
            try {
                SettingRoute();
            } catch (FileNotFoundException e1) {
               
                e1.printStackTrace();
            }
            
        });
        setBackground(new Background(new BackgroundFill(Color.rgb(131, 111, 169), new CornerRadii(0), Insets.EMPTY)));

        getChildren().add(header);
        getChildren().addAll(navBarButtons);
    }
    public void SettingRoute() throws FileNotFoundException {
        Route.getStage().setScene((new settings().getScene()));
    }
    
    public void profileRoute(UserModel u) throws FileNotFoundException {
        Route.getStage().setScene((new Profile(u).getScene()));
    }

    
}
