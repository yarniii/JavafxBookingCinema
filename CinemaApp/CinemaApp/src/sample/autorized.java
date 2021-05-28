package sample;



import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class autorized {
    public static int filmId;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button ButtonFilm1;

    @FXML
    private Button ButtonFilm2;

    @FXML
    private Button ButtonFilm3;

    @FXML
    private Button ButtonFilm4;

    @FXML
    private TextField SearchField;

    @FXML
    private Button ButtonTheatres;

    @FXML
    private Button ButtonMovies;

    @FXML
    private Button profileButton;
    public static String film;

    @FXML
    void initialize() {
       profileButton.setOnAction(actionEvent -> {
           profileButton.getScene().getWindow().hide();
           FXMLLoader loader=new FXMLLoader();
           loader.setLocation(getClass().getResource("/sample/profile.fxml"));
           try {
               loader.load();
           } catch (IOException e) {
               e.printStackTrace();
           }
           Parent root=loader.getRoot();
           Stage stage=new Stage();
           stage.setResizable(false);
           stage.setScene(new Scene(root));
           stage.show();
       });
    }

    public void openzal(MouseEvent mouseEvent) {
      filmId=1;
        film="Том и джерри";
        ButtonFilm1.getScene().getWindow().hide();
        FXMLLoader loader=new FXMLLoader();
        loader.setLocation(getClass().getResource("/sample/film.fxml"));
        try {
            loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Parent root1=loader.getRoot();
        Stage stage1=new Stage();
        stage1.setScene(new Scene(root1));
        stage1.setResizable(false);
        stage1.show();
    }
    public void openSoul(MouseEvent mouseEvent) {
        filmId=2;
        film="Душа";
        ButtonFilm1.getScene().getWindow().hide();
        FXMLLoader loader=new FXMLLoader();
        loader.setLocation(getClass().getResource("/sample/film.fxml"));
        try {
            loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Parent root1=loader.getRoot();
        Stage stage1=new Stage();
        stage1.setScene(new Scene(root1));
        stage1.setResizable(false);
        stage1.show();
    }

    public void openKiller(MouseEvent mouseEvent) {
        filmId=3;
        film="Телохранитель жены киллера";
        ButtonFilm1.getScene().getWindow().hide();
        FXMLLoader loader=new FXMLLoader();
        loader.setLocation(getClass().getResource("/sample/film.fxml"));
        try {
            loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Parent root1=loader.getRoot();
        Stage stage1=new Stage();
        stage1.setScene(new Scene(root1));
        stage1.setResizable(false);
        stage1.show();
    }

    public void openMayor(MouseEvent mouseEvent) {
        filmId=4;
        film="Майор Гром и Чумной Доктор";
        ButtonFilm1.getScene().getWindow().hide();
        FXMLLoader loader=new FXMLLoader();
        loader.setLocation(getClass().getResource("/sample/film.fxml"));
        try {
            loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Parent root1=loader.getRoot();
        Stage stage1=new Stage();
        stage1.setScene(new Scene(root1));
        stage1.setResizable(false);
        stage1.show();
    }
}
