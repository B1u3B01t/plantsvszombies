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
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.transform.Translate;
import javafx.util.Duration;

import java.io.File;
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

    TranslateTransition move_pea_1_0;


    MediaPlayer mediaPlayer3=null;

//    protected void move_lawn_mower(ImageView lawn_mower_id, TranslateTransition move)
//    {
//        move = new TranslateTransition(Duration.seconds(2),lawn_mower_id);
//        move.setToX(800);
//        move.setCycleCount(Timeline.INDEFINITE);
//        move.play();
//    }
//
//    protected void move_zombie(ImageView zombie_id, int time, TranslateTransition move)
//    {
//        move = new TranslateTransition(Duration.seconds(time),zombie_id);
//        move.setToX(-800);
//        move.setCycleCount(Timeline.INDEFINITE);
//        move.play();
//    }
//
//    protected void sun_token_fall(ImageView sun_token_id, TranslateTransition move)
//    {
//        move = new TranslateTransition(Duration.seconds(3),sun_token_id);
//        move.setToY(300);
//        move.setCycleCount(Timeline.INDEFINITE);
//        move.play();
//    }



    public void play_music3()
    {
        String loc = "battle.mp3";
        Media media = new Media(new File(loc).toURI().toString());
        mediaPlayer3 = new MediaPlayer(media);
        mediaPlayer3.setAutoPlay(true);
        mediaPlayer3.setCycleCount(MediaPlayer.INDEFINITE);
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
        mediaPlayer3.pause();


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
        mediaPlayer3.play();
    }

    public void return_to_main_menu() throws Exception
    {
        Pane pane = FXMLLoader.load(getClass().getResource("../main.fxml"));
        lawn_pane.getChildren().setAll(pane);
        mediaPlayer3.stop();
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

//    protected  void shoot_pea(ImageView pea_id, TranslateTransition move)
//    {
//        move = new TranslateTransition(Duration.seconds(2),pea_id);
//        move.setToX(700);
//        move.setCycleCount(Timeline.INDEFINITE);
//        move.play();
//    }
//
//    protected  void shoot_pea_1_0(ImageView pea_id, TranslateTransition move)
//    {
//        move = new TranslateTransition(Duration.seconds(2),pea_id);
//        move.setToX(700);
//        move.setCycleCount(Timeline.INDEFINITE);
//        move.play();
//    }
    public void stuff1()
    {
        move_pea_1_0 = new TranslateTransition(Duration.seconds(2),pea_1_0);
        move_pea_1_0.setToX(700);
        move_pea_1_0.setCycleCount(Timeline.INDEFINITE);
        move_pea_1_0.play();
    }
    public void stuff2()
    {
        move_sun_token_0 = new TranslateTransition(Duration.seconds(3),sun_token_0);
        move_sun_token_0.setToY(300);
        move_sun_token_0.setCycleCount(Timeline.INDEFINITE);
        move_sun_token_0.play();
    }
    public void stuff3()
    {
        move_zombie_0 = new TranslateTransition(Duration.seconds(60),zombie_0);
        move_zombie_0.setToX(-800);
        move_zombie_0.setCycleCount(Timeline.INDEFINITE);
        move_zombie_0.play();
    }
    public void stuff4()
    {
        move_zombie_1 = new TranslateTransition(Duration.seconds(60),zombie_1);
        move_zombie_1.setToX(-800);
        move_zombie_1.setCycleCount(Timeline.INDEFINITE);
        move_zombie_1.play();
    }
    public void stuff5()
    {
        move_zombie_3 = new TranslateTransition(Duration.seconds(60),zombie_3);
        move_zombie_3.setToX(-800);
        move_zombie_3.setCycleCount(Timeline.INDEFINITE);
        move_zombie_3.play();
    }

    public void stuff6()
    {
        move_football_zombie_0 = new TranslateTransition(Duration.seconds(60),football_zombie_0);
        move_football_zombie_0.setToX(-800);
        move_football_zombie_0.setCycleCount(Timeline.INDEFINITE);
        move_football_zombie_0.play();
    }

    public void stuff7()
    {
        move_lawn_mower_5 = new TranslateTransition(Duration.seconds(2),lawn_mower_5);
        move_lawn_mower_5.setToX(800);
        move_lawn_mower_5.setCycleCount(Timeline.INDEFINITE);
        move_lawn_mower_5.play();
    }





    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        stuff1();
        stuff2();
        stuff3();
        stuff4();
        stuff5();
        stuff6();
        stuff7();
        play_music3();



//        move_lawn_mower(lawn_mower_5, move_lawn_mower_5);
//
//        move_zombie(zombie_0,60, move_zombie_0);
//        move_zombie(zombie_1,60, move_zombie_1);
//        move_zombie(zombie_3,60, move_zombie_3);
//        move_zombie(football_zombie_0,40, move_football_zombie_0);
//
//        sun_token_fall(sun_token_0, move_sun_token_0);
//
//        shoot_pea(pea_1_0, move_pea_1_0);

    }
}
