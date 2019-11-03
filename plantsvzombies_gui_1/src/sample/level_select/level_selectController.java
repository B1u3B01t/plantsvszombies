package sample.level_select;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

import javafx.scene.control.Button;

public class level_selectController {

    @FXML
    private Button back;

    @FXML
    private ImageView level_1;

    @FXML
    private Pane level_select_pane;

    public void go_back_main_menu() throws Exception
    {

        Pane pane = FXMLLoader.load(getClass().getResource("../main.fxml"));
        level_select_pane.getChildren().setAll(pane);
    }

    public void go_to_lawn() throws Exception
    {

        Pane pane = FXMLLoader.load(getClass().getResource("../lawn/lawn.fxml"));
        level_select_pane.getChildren().setAll(pane);
    }
}
