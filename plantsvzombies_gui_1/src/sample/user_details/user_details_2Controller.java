package sample.user_details;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

public class user_details_2Controller {

    @FXML
    private ImageView ok;

    @FXML
    private Pane user_details_2_pane;


    public void go_back_main_menu() throws Exception
    {

        Pane pane = FXMLLoader.load(getClass().getResource("../main.fxml"));
        user_details_2_pane.getChildren().setAll(pane);
    }

    public void go_back() throws Exception
    {
        Pane pane = FXMLLoader.load(getClass().getResource("user_details.fxml"));
        user_details_2_pane.getChildren().setAll(pane);
    }
}
