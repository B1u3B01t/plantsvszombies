package sample;

import javafx.fxml.FXML;

import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

//import java.net.URL;
//import java.util.ResourceBundle;
import javafx.scene.input.MouseEvent;

public class Controller {

    @FXML
    private ImageView adventure_popup;

    @FXML
    private Button user_details;

    @FXML
    private Pane main_menu;






    public void change_to_popup()
    {
        Image popup = new Image("resources_not/popup.png");
        adventure_popup.setImage(popup);
    }

    public void go_to_select_level() throws Exception
    {
        System.out.println("hello");
        Pane pane = FXMLLoader.load(getClass().getResource("level_select/level_select.fxml"));
        main_menu.getChildren().setAll(pane);
    }

    public void change_to_normal()
    {
        adventure_popup.setImage(null);
    }

    public void popup_user_details() throws Exception
    {
        Pane pane = FXMLLoader.load(getClass().getResource("user_details/user_details.fxml"));
        //Stage stage = new Stage();
        //stage.setScene(new Scene(pane));
        //stage.show();
        main_menu.getChildren().setAll(pane);
    }



//    public void go_to_select_level(javafx.scene.input.MouseEvent mouseEvent) throws Exception
//    {
//        Pane pane = FXMLLoader.load(getClass().getResource("level_select/level_select.fxml"));
//        main_menu.getChildren().setAll(pane);
//    }
}
