package sample.lawn;

import com.sun.javafx.fxml.builder.JavaFXImageBuilder;
import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.transform.Translate;
import javafx.util.Duration;

import java.net.URL;
import java.sql.Time;
import java.util.ResourceBundle;

    public class lawnController implements Initializable{



    @FXML
    private ImageView lawn_mower_5;

    @FXML
    private Pane lawn_pane;

    @FXML
    private ImageView zombie_0;
    @FXML
    private ImageView zombie_1;
    @FXML
    private ImageView zombie_3;

    @FXML
    private ImageView football_zombie_0;

    @FXML
    private ImageView sun_token_0;

    @FXML
    private ImageView pea_1_0;

    @FXML
    private ImageView pause;

    @FXML
    private StackPane stackpane_pause;


    TranslateTransition move_lawn_mower_1;
    TranslateTransition move_lawn_mower_2;
    TranslateTransition move_lawn_mower_3;
    TranslateTransition move_lawn_mower_4;
    TranslateTransition move_lawn_mower_5 = null;

    TranslateTransition move_zombie_0 = null;
    TranslateTransition move_zombie_1 = null;
    TranslateTransition move_zombie_3 = null;
    TranslateTransition move_football_zombie_0 = null;

    TranslateTransition move_sun_token_0 = null;

    TranslateTransition move_pea_1_0 = null;



    protected void move_lawn_mower(ImageView lawn_mower_id, TranslateTransition move)
    {
        move = new TranslateTransition(Duration.seconds(2),lawn_mower_id);
        move.setToX(800);
        move.setCycleCount(Timeline.INDEFINITE);
        move.play();
    }

    protected void move_zombie(ImageView zombie_id, int time, TranslateTransition move)
    {
        move = new TranslateTransition(Duration.seconds(time),zombie_id);
        move.setToX(-800);
        move.setCycleCount(Timeline.INDEFINITE);
        move.play();
    }

    protected void sun_token_fall(ImageView sun_token_id, TranslateTransition move)
    {
        move = new TranslateTransition(Duration.seconds(3),sun_token_id);
        move.setToY(300);
        move.setCycleCount(Timeline.INDEFINITE);
        move.play();
    }

    public void game_pause()
    {
        stackpane_pause.setVisible(true);
        move_lawn_mower_5.pause();
        move_zombie_0.pause();
        move_zombie_1.pause();
        move_zombie_3.pause();
        move_football_zombie_0.pause();
        move_sun_token_0.pause();
        move_pea_1_0.pause();


    }

    public void game_play()
    {
        stackpane_pause.setVisible(false);
        move_lawn_mower_5.play();
        move_zombie_0.play();
        move_zombie_1.play();
        move_zombie_3.play();
        move_football_zombie_0.play();
        move_sun_token_0.play();
        move_pea_1_0.play();

    }

    public void return_to_main_menu() throws Exception
    {
        Pane pane = FXMLLoader.load(getClass().getResource("../main.fxml"));
        lawn_pane.getChildren().setAll(pane);
    }

    public void change_image_on_hover(String loc, ImageView i)
    {
        Image popup = new Image(loc);
        i.setImage(popup);
    }

//    public void hover_plant_tile()
//    {
//
//    }

    protected  void shoot_pea(ImageView pea_id, TranslateTransition move)
    {
        move = new TranslateTransition(Duration.seconds(2),pea_id);
        move.setToX(700);
        move.setCycleCount(Timeline.INDEFINITE);
        move.play();
    }

    protected  void shoot_pea_1_0(ImageView pea_id, TranslateTransition move)
    {
        move = new TranslateTransition(Duration.seconds(2),pea_id);
        move.setToX(700);
        move.setCycleCount(Timeline.INDEFINITE);
        move.play();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        move_lawn_mower(lawn_mower_5, move_lawn_mower_5);

        move_zombie(zombie_0,60, move_zombie_0);
        move_zombie(zombie_1,60, move_zombie_1);
        move_zombie(zombie_3,60, move_zombie_3);
        move_zombie(football_zombie_0,40, move_football_zombie_0);

        sun_token_fall(sun_token_0, move_sun_token_0);

        shoot_pea(pea_1_0, move_pea_1_0);
    }
}
