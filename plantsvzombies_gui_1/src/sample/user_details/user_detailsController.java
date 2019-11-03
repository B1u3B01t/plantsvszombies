package sample.user_details;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

public class user_detailsController {

    @FXML
    private ImageView ok;

    @FXML
    private Pane user_details_1_pane;

    public void create_new_user() throws Exception
    {
        Pane pane = FXMLLoader.load(getClass().getResource("user_details_2.fxml"));
        user_details_1_pane.getChildren().setAll(pane);
    }

    public void go_back_main_menu() throws Exception
    {

        Pane pane = FXMLLoader.load(getClass().getResource("../main.fxml"));
        user_details_1_pane.getChildren().setAll(pane);
    }

}
