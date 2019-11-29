package sample.lawn;

import com.sun.javafx.fxml.builder.JavaFXImageBuilder;
import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.beans.property.ObjectProperty;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.transform.Translate;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URL;
import java.sql.Time;
import java.util.ResourceBundle;

public class lawnController implements Initializable
{

    private ImageView plant_0;

    @FXML
    private ImageView pea_tile;
    private String pea_tile_loc;

    @FXML
    private ImageView sun_tile;
    private String sun_tile_loc;

    @FXML
    private ImageView walnut_tile;
    private String walnut_tile_loc;

    @FXML
    private ImageView mine_tile;
    private String mine_tile_loc;


    private ImageView tile_list[] = new ImageView[]{pea_tile, sun_tile, walnut_tile, mine_tile};

    private int tile_click_count=0;

    private ImageView temp_ImageView;
    private Image temp_Image;








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

    @FXML
    private AnchorPane lawn_pane_00;
    @FXML
    private AnchorPane lawn_pane_01;
    @FXML
    private AnchorPane lawn_pane_02;
    @FXML
    private AnchorPane lawn_pane_03;
    @FXML
    private AnchorPane lawn_pane_04;
    @FXML
    private AnchorPane lawn_pane_05;
    @FXML
    private AnchorPane lawn_pane_06;
    @FXML
    private AnchorPane lawn_pane_07;
    @FXML
    private AnchorPane lawn_pane_08;


    @FXML
    private AnchorPane lawn_pane_10;
    @FXML
    private AnchorPane lawn_pane_11;
    @FXML
    private AnchorPane lawn_pane_12;
    @FXML
    private AnchorPane lawn_pane_13;
    @FXML
    private AnchorPane lawn_pane_14;
    @FXML
    private AnchorPane lawn_pane_15;
    @FXML
    private AnchorPane lawn_pane_16;
    @FXML
    private AnchorPane lawn_pane_17;
    @FXML
    private AnchorPane lawn_pane_18;

    @FXML
    private AnchorPane lawn_pane_20;
    @FXML
    private AnchorPane lawn_pane_21;
    @FXML
    private AnchorPane lawn_pane_22;
    @FXML
    private AnchorPane lawn_pane_23;
    @FXML
    private AnchorPane lawn_pane_24;
    @FXML
    private AnchorPane lawn_pane_25;
    @FXML
    private AnchorPane lawn_pane_26;
    @FXML
    private AnchorPane lawn_pane_27;
    @FXML
    private AnchorPane lawn_pane_28;


    @FXML
    private AnchorPane lawn_pane_30;
    @FXML
    private AnchorPane lawn_pane_31;
    @FXML
    private AnchorPane lawn_pane_32;
    @FXML
    private AnchorPane lawn_pane_33;
    @FXML
    private AnchorPane lawn_pane_34;
    @FXML
    private AnchorPane lawn_pane_35;
    @FXML
    private AnchorPane lawn_pane_36;
    @FXML
    private AnchorPane lawn_pane_37;
    @FXML
    private AnchorPane lawn_pane_38;

    @FXML
    private AnchorPane lawn_pane_40;
    @FXML
    private AnchorPane lawn_pane_41;
    @FXML
    private AnchorPane lawn_pane_42;
    @FXML
    private AnchorPane lawn_pane_43;
    @FXML
    private AnchorPane lawn_pane_44;
    @FXML
    private AnchorPane lawn_pane_45;
    @FXML
    private AnchorPane lawn_pane_46;
    @FXML
    private AnchorPane lawn_pane_47;
    @FXML
    private AnchorPane lawn_pane_48;



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

    double orgSceneX, orgSceneY;
    double orgTranslateX, orgTranslateY;

    public void tileonmouseclick(MouseEvent t) {
        ((ImageView)t.getSource()).setMouseTransparent(true);

        System.out.println("transparent mouse");
        orgSceneX = t.getSceneX();
        orgSceneY = t.getSceneY();
        orgTranslateX = ((ImageView) (t.getSource())).getTranslateX();
        orgTranslateY = ((ImageView) (t.getSource())).getTranslateY();
    }
    public void test1(MouseEvent t)
    {

    }


    public void tile_onmousedrag(MouseEvent t)
    {
        double offsetX = t.getSceneX() - orgSceneX;
        double offsetY = t.getSceneY() - orgSceneY;
        double newTranslateX = orgTranslateX + offsetX;
        double newTranslateY = orgTranslateY + offsetY;

        ((ImageView)(t.getSource())).setTranslateX(newTranslateX);
        ((ImageView)(t.getSource())).setTranslateY(newTranslateY);

    }

    public void tile_onmouserelease(MouseEvent t)
    {
        //System.out.println(i.getX());
        ((ImageView)t.getSource()).setMouseTransparent(false);
//        ((ImageView) (t.getSource())).setImage(new Image("resources_not/bg_level.PNG"));
    }

//    public void test4()
//    {
//
//        //dragEvent.acceptTransferModes(TransferMode.ANY);
//        System.out.println("4");
//
//        //Dragboard dragboard = dragEvent.getDragboard();
//        //lawn_pane_00.getChildren().add(new ImageView("resources_not/pea_shooter.gif"));
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


//    @Override
//    public void start(Stage primaryStage) throws Exception
//    {
//        System.out.println(1);
//        AnchorPane lawn_pane_00_1 = new AnchorPane();
//        lawn_pane_00_1.setTranslateX(190);
//        lawn_pane_00_1.setTranslateY(62);
//
//        lawn_pane_00.setOnMouseDragOver(new EventHandler<MouseDragEvent>() {
//            @Override
//            public void handle(MouseDragEvent mouseDragEvent) {
//                System.out.println(11);
//            }
//        });
//
//        lawn_pane_00.setOnMouseDragReleased(new EventHandler<MouseDragEvent>() {
//            @Override
//            public void handle(MouseDragEvent mouseDragEvent) {
//                System.out.println("12");
//
//            }
//
//        });
//
//        lawn_pane_00.setOnDragOver(new EventHandler<DragEvent>() {
//            @Override
//            public void handle(DragEvent dragEvent) {
//                System.out.println(13);
//            }
//        });
//        lawn_pane_00.setOnDragDropped(new EventHandler<DragEvent>() {
//            @Override
//            public void handle(DragEvent dragEvent) {
//                System.out.println(14);
//            }
//        });
//
//
//    }
    private void testtt(AnchorPane p)
    {
        p.setOnMouseClicked(new EventHandler<MouseEvent>()
        {
            @Override
            public void handle(MouseEvent mouseEvent)
            {

            }
        });
    }

    private void set_on_click_list(ImageView imageView)
    {
        imageView.setOnMouseClicked(new EventHandler<MouseEvent>()
        {
            @Override
            public void handle(MouseEvent mouseEvent)
            {
                tile_click_count=1;
                temp_ImageView = new ImageView();
                String s = ((ImageView)(mouseEvent.getSource())).getId();
                System.out.println(s);

                if(s.equals(pea_tile_loc))
                {
                    temp_Image = new Image("pea_shooter.gif",true);
                    System.out.println(temp_Image.getUrl());
                    System.out.println("clicked pea shooter");
                }

                if(s.equals(sun_tile_loc))
                {
//                    System.out.println(3);
                    System.out.println("clicked sun");
                    try {
                        temp_Image = new Image(new FileInputStream(
                                "src/resources_not/sun_flower.gif"));
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }
                }
                if (s.equals(walnut_tile_loc))
                {
//                    System.out.println(3);
                    System.out.println("clicked walnut");
                    try {
                        temp_Image = new Image(new FileInputStream(
                                "src/resources_not/walnut_full_life.gif"));
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }
                }

                if (s.equals(mine_tile_loc))
                {

//                    System.out.println(3);
                    System.out.println("clicked mine");
                    try {
                        temp_Image = new Image(new FileInputStream(
                                "src/resources_not/cherry-bomb.gif"));
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }
                }
                temp_ImageView.setImage(temp_Image);
                tile_click_count=1;
            }
        });
    }

    private void tile_mouse_click_listeners()
    {
//        for (int i=0; i<tile_list.length; i++)
//        {
//            set_on_click_list(tile_list[i]);
//        }
        pea_tile_loc = "pea_tile";
        sun_tile_loc = "sun_tile";
        walnut_tile_loc = "walnut_tile";
        mine_tile_loc = "mine_tile";

        temp_Image=null;


        set_on_click_list(pea_tile);
        set_on_click_list(sun_tile);
        set_on_click_list(walnut_tile);
        set_on_click_list(mine_tile);
    }
    private void  set_on_click_list_anchor_pane(AnchorPane anchorPane)
    {
        anchorPane.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                if(tile_click_count==1 && anchorPane.getChildren().isEmpty())
                {
                    System.out.println("clicked pane");
                    System.out.println(temp_Image.getUrl());

//                    System.out.println(anchorPane.getChildren().isEmpty() == true);

                    ImageView a = new ImageView(temp_Image);

                    anchorPane.getChildren().add(a);
//                    plant.setImage(temp_Image);
                    ImageView plant = (ImageView) (Node)anchorPane.getChildren().get(0);
                    plant.setX(0);
                    plant.setY(0);
                    plant.setVisible(true);
                    plant.setFitHeight(55);
                    plant.setFitWidth(55);
//                    plant.fitHeightProperty().bind(anchorPane.heightProperty());
//                    plant.fitWidthProperty().bind(anchorPane.widthProperty());
                    tile_click_count=0;
                }
            }
        });
    }
    private void anchor_pane_click_listeners()
    {
        set_on_click_list_anchor_pane(lawn_pane_00);
        set_on_click_list_anchor_pane(lawn_pane_01);
        set_on_click_list_anchor_pane(lawn_pane_02);
        set_on_click_list_anchor_pane(lawn_pane_03);
        set_on_click_list_anchor_pane(lawn_pane_04);
        set_on_click_list_anchor_pane(lawn_pane_05);
        set_on_click_list_anchor_pane(lawn_pane_06);
        set_on_click_list_anchor_pane(lawn_pane_07);
        set_on_click_list_anchor_pane(lawn_pane_08);

        set_on_click_list_anchor_pane(lawn_pane_10);
        set_on_click_list_anchor_pane(lawn_pane_11);
        set_on_click_list_anchor_pane(lawn_pane_12);
        set_on_click_list_anchor_pane(lawn_pane_13);
        set_on_click_list_anchor_pane(lawn_pane_14);
        set_on_click_list_anchor_pane(lawn_pane_15);
        set_on_click_list_anchor_pane(lawn_pane_16);
        set_on_click_list_anchor_pane(lawn_pane_17);
        set_on_click_list_anchor_pane(lawn_pane_18);

        set_on_click_list_anchor_pane(lawn_pane_20);
        set_on_click_list_anchor_pane(lawn_pane_21);
        set_on_click_list_anchor_pane(lawn_pane_22);
        set_on_click_list_anchor_pane(lawn_pane_23);
        set_on_click_list_anchor_pane(lawn_pane_24);
        set_on_click_list_anchor_pane(lawn_pane_25);
        set_on_click_list_anchor_pane(lawn_pane_26);
        set_on_click_list_anchor_pane(lawn_pane_27);
        set_on_click_list_anchor_pane(lawn_pane_28);

        set_on_click_list_anchor_pane(lawn_pane_30);
        set_on_click_list_anchor_pane(lawn_pane_31);
        set_on_click_list_anchor_pane(lawn_pane_32);
        set_on_click_list_anchor_pane(lawn_pane_33);
        set_on_click_list_anchor_pane(lawn_pane_34);
        set_on_click_list_anchor_pane(lawn_pane_35);
        set_on_click_list_anchor_pane(lawn_pane_36);
        set_on_click_list_anchor_pane(lawn_pane_37);
        set_on_click_list_anchor_pane(lawn_pane_38);

        set_on_click_list_anchor_pane(lawn_pane_40);
        set_on_click_list_anchor_pane(lawn_pane_41);
        set_on_click_list_anchor_pane(lawn_pane_42);
        set_on_click_list_anchor_pane(lawn_pane_43);
        set_on_click_list_anchor_pane(lawn_pane_44);
        set_on_click_list_anchor_pane(lawn_pane_45);
        set_on_click_list_anchor_pane(lawn_pane_46);
        set_on_click_list_anchor_pane(lawn_pane_47);
        set_on_click_list_anchor_pane(lawn_pane_48);


    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle)
    {
//        stuff1();
//        stuff2();
//        stuff3();
//        stuff4();
//        stuff5();
//        stuff6();
//        stuff7();
//        play_music3();

        tile_mouse_click_listeners();
        anchor_pane_click_listeners();
        //testtt(lawn_pane_00);




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
