package EX2.EntityViewStyle;

import EX2.Main;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Screen;

import java.io.IOException;

public class SetView {

    final static int getW=498,getH=652,showW=1280,showH=720;

    public static void setVcenter(int w,int h){
        Rectangle2D primScreen = Screen.getPrimary().getVisualBounds();
        Main.MainStage.setX(primScreen.getWidth()/2-(w/2.0));
        Main.MainStage.setY(primScreen.getHeight()/2-(h/2.0));

    }

    public static void setViewGet() throws IOException {
        Parent root= FXMLLoader.load(SetView.class.getResource("/EX2/Get/get.fxml"));
        Scene scene = new Scene(root);
        scene.getStylesheets().add(SetView.class.getResource("Style.css").toExternalForm());
        setVcenter(getW,getH);
        Main.MainStage.setScene(scene);
    }
    public static void setViewShow() throws IOException {
        Parent root= FXMLLoader.load(SetView.class.getResource("/EX2/Show/show.fxml"));
        Scene scene = new Scene(root);
        scene.getStylesheets().add(SetView.class.getResource("Style.css").toExternalForm());
        setVcenter(showW,showH);
        Main.MainStage.setScene(scene);
    }

}
