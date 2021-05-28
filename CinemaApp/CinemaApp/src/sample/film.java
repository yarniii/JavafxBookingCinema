package sample;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import javax.imageio.ImageIO;
import javax.swing.*;

public class film {


    public Button backButton;
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ImageView filmImage;

    @FXML
    private Label FilmText;

    @FXML
    private Button BuyButton;

    @FXML
    void initialize() throws SQLException, IOException, ClassNotFoundException {
        otchet();
        addImage();
        addImage1();

    }
 public void addImage() throws SQLException, ClassNotFoundException, IOException {
        DataBaseHandler dataBaseHandler=new DataBaseHandler();
     Connection connection=dataBaseHandler.getDbConnection();
     PreparedStatement preparedStatement=connection.prepareStatement("SELECT * FROM films WHERE MovieName = ?");
     preparedStatement.setString(1,Controller.film);
     ResultSet resultSet=preparedStatement.executeQuery();
     while (resultSet.next()){

         Image image=new Image(resultSet.getString("MoviePicture"));
         filmImage.setImage(image);
         FilmText.setText(resultSet.getString("MivieTale"));
     }


 }
    public void addImage1() throws SQLException, ClassNotFoundException, IOException {
        DataBaseHandler dataBaseHandler=new DataBaseHandler();
        Connection connection=dataBaseHandler.getDbConnection();
        PreparedStatement preparedStatement=connection.prepareStatement("SELECT * FROM films WHERE MovieName = ?");
        preparedStatement.setString(1,autorized.film);
        ResultSet resultSet=preparedStatement.executeQuery();
        while (resultSet.next()){

            Image image=new Image(resultSet.getString("MoviePicture"));
            filmImage.setImage(image);
            FilmText.setText(resultSet.getString("MivieTale"));
        }


    }

    public void openzal(MouseEvent mouseEvent) {
        BuyButton.getScene().getWindow().hide();
        FXMLLoader loader=new FXMLLoader();
        loader.setLocation(getClass().getResource("/sample/zal.fxml"));
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

    public void back(MouseEvent mouseEvent) {
        backButton.getScene().getWindow().hide();
        FXMLLoader loader=new FXMLLoader();
        loader.setLocation(getClass().getResource("/sample/sample.fxml"));
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
    public void otchet() throws SQLException, ClassNotFoundException {
        int Counter=1;
        DataBaseHandler dataBaseHandler=new DataBaseHandler();
        PreparedStatement preparedStatement=dataBaseHandler.getDbConnection().prepareStatement("SELECT * FROM zal WHERE filmId = ? AND Available = свободно");
preparedStatement.setInt(1,Controller.filmId);
        ResultSet resultSet=preparedStatement.executeQuery();
            while (resultSet.next()){
                Counter++;

            }
            System.out.println(Counter+" свободно");
        PreparedStatement preparedStatement1=dataBaseHandler.getDbConnection().prepareStatement("SELECT * FROM zal WHERE filmId = ? AND Available = занято");
        preparedStatement1.setInt(1,Controller.filmId);
        ResultSet resultSet1=preparedStatement1.executeQuery();
        while (resultSet.next()){
            Counter++;

        }
        System.out.println(Counter+" занято");
        }

    }

