package app.route;

import javafx.stage.Stage;

public class Route {
    static Stage stage;
    public static Stage getStage()
    {
        return stage;
    }
    public static void setStage(Stage stage)
    {
        Route.stage = stage;
    }
}
