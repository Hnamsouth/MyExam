package EX1;

import EX1.EntityViewStyle.SetView;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {
    public static Stage MainStage;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        MainStage=stage;
        SetView.setViewGet();
        stage.setResizable(false);
        stage.show();
    }
}
