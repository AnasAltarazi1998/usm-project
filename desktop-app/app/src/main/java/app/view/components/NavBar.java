package app.view.components;

import java.io.FileNotFoundException;

import javafx.scene.layout.VBox;

public class NavBar extends VBox {
   
    Header header;
    NavBarButton navBarButtons[] = new NavBarButton[7];

    public NavBar() throws FileNotFoundException
    {
        super();
        header = new Header();
        for (int i = 0; i < navBarButtons.length; i++) {
            navBarButtons[i] = new NavBarButton();
        }

        getChildren().add(header);
        getChildren().addAll(navBarButtons);
    }

    
}
