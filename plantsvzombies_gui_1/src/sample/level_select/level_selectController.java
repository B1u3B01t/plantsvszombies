package sample.level_select;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

import javafx.scene.control.Button;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

public class level_selectController implements Initializable {

    @FXML
    private Button back;

    @FXML
    private ImageView level_1;

    @FXML
    private Pane level_select_pane;

    MediaPlayer mediaPlayer2;

    public void go_back_main_menu() throws Exception
    {

        Pane pane = FXMLLoader.load(getClass().getResource("../main.fxml"));
        level_select_pane.getChildren().setAll(pane);
        mediaPlayer2.pause();
        mediaPlayer2.stop();
    }

    public void play_music2()
    {
        String loc = "finalfanfare.wav";
        Media media = new Media(new File(loc).toURI().toString());
        mediaPlayer2 = new MediaPlayer(media);
        mediaPlayer2.setAutoPlay(true);
        mediaPlayer2.setCycleCount(MediaPlayer.INDEFINITE);
    }

    public void go_to_lawn() throws Exception
    {

        Pane pane = FXMLLoader.load(getClass().getResource("../lawn/lawn.fxml"));
        level_select_pane.getChildren().setAll(pane);
        mediaPlayer2.pause();
        mediaPlayer2.stop();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle)
    {
        play_music2();
    }
}
