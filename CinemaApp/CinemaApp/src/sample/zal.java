package sample;

import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.stage.Stage;

import javax.swing.*;

public class zal {


    public Button refreshButton;
    public TextField NameField;
    public Button backButton;
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button FirstRow1Seat;

    @FXML
    private Button FirstRow2Seat;

    @FXML
    private Button FirstRow3Seat;

    @FXML
    private Button FirstRow4Seat;

    @FXML
    private Button FirstRow5Seat;

    @FXML
    private Button FirstRow6Seat;

    @FXML
    private Button SecondRow1Seat;

    @FXML
    private Button SecondRow2Seat;

    @FXML
    private Button SecondRow3Seat;

    @FXML
    private Button SecondRow4Seat;

    @FXML
    private Button SecondRow5Seat;

    @FXML
    private Button SecondRow6Seat;

    @FXML
    private Button ThirdfRow1Seat;

    @FXML
    private Button ThirdfRow2Seat;

    @FXML
    private Button ThirdfRow3Seat;

    @FXML
    private Button ThirdfRow4Seat;

    @FXML
    private Button ThirdfRow5Seat;

    @FXML
    private Button ThirdfRow6Seat;

    @FXML
    private Button FourthRow1Seat;

    @FXML
    private Button FourthRow2Seat;

    @FXML
    private Button FourthRow3Seat;

    @FXML
    private Button FourthRow4Seat;

    @FXML
    private Button FourthRow5Seat;

    @FXML
    private Button FourthRow6Seat;

    @FXML
    private Label PriceLabel;

    @FXML
    private Label SelectedSeatsLabel;

    @FXML
    private Button BuyButton;

    @FXML
    void initialize() throws SQLException, ClassNotFoundException {

        NameField.setText(SIgnUpScreen.userNameText);
        DataBaseHandler dataBaseHandler=new DataBaseHandler();
        Connection connection=dataBaseHandler.getDbConnection();
        PreparedStatement preparedStatement=connection.prepareStatement("SELECT * FROM zal WHERE filmId = ? AND seat = ?");
        if (Controller.filmId == 0) {
            preparedStatement.setInt(1, autorized.filmId);

        } else {
            preparedStatement.setInt(1, Controller.filmId);
        }
        preparedStatement.setString(2,"1 ряд 1 место");
        ResultSet resultSet=preparedStatement.executeQuery();
        while (resultSet.next()){

            if(resultSet.getString("available").equals("занято")){
                FirstRow1Seat.setDisable(true);


            }
        }
        PreparedStatement preparedStatement1=connection.prepareStatement("SELECT * FROM zal WHERE filmId = ? AND seat = ?");
        if (Controller.filmId == 0) {
            preparedStatement1.setInt(1, autorized.filmId);

        } else {
            preparedStatement1.setInt(1, Controller.filmId);
        }
        preparedStatement1.setString(2,"1 ряд 2 место");
        ResultSet resultSet1=preparedStatement1.executeQuery();
        while (resultSet1.next()){

            if(resultSet1.getString("available").equals("занято")){
                FirstRow2Seat.setDisable(true);


            }
        }
        PreparedStatement preparedStatement2=connection.prepareStatement("SELECT * FROM zal WHERE filmId = ? AND seat = ?");
        if (Controller.filmId == 0) {
            preparedStatement2.setInt(1, autorized.filmId);

        } else {
            preparedStatement2.setInt(1, Controller.filmId);
        }
        preparedStatement2.setString(2,"1 ряд 3 место");
        ResultSet resultSet2=preparedStatement2.executeQuery();
        while (resultSet2.next()){

            if(resultSet2.getString("available").equals("занято")){
                FirstRow3Seat.setDisable(true);


            }
        }
        PreparedStatement preparedStatement3=connection.prepareStatement("SELECT * FROM zal WHERE filmId = ? AND seat = ?");
        if (Controller.filmId == 0) {
            preparedStatement3.setInt(1, autorized.filmId);

        } else {
            preparedStatement3.setInt(1, Controller.filmId);
        }
        preparedStatement3.setString(2,"1 ряд 4 место");
        ResultSet resultSet3=preparedStatement3.executeQuery();
        while (resultSet3.next()){

            if(resultSet3.getString("available").equals("занято")){
                FirstRow4Seat.setDisable(true);


            }
        }
        PreparedStatement preparedStatement4=connection.prepareStatement("SELECT * FROM zal WHERE filmId = ? AND seat = ?");
        if (Controller.filmId == 0) {
            preparedStatement4.setInt(1, autorized.filmId);

        } else {
            preparedStatement4.setInt(1, Controller.filmId);
        }
        preparedStatement4.setString(2,"1 ряд 5 место");
        ResultSet resultSet4=preparedStatement4.executeQuery();
        while (resultSet4.next()){

            if(resultSet4.getString("available").equals("занято")){
                FirstRow5Seat.setDisable(true);


            }
        }
        PreparedStatement preparedStatement5=connection.prepareStatement("SELECT * FROM zal WHERE filmId = ? AND seat = ?");
        if (Controller.filmId == 0) {
            preparedStatement5.setInt(1, autorized.filmId);

        } else {
            preparedStatement5.setInt(1, Controller.filmId);
        }
        preparedStatement5.setString(2,"1 ряд 6 место");
        ResultSet resultSet5=preparedStatement5.executeQuery();
        while (resultSet5.next()){

            if(resultSet5.getString("available").equals("занято")){
                FirstRow6Seat.setDisable(true);


            }
        }
        PreparedStatement preparedStatement6=connection.prepareStatement("SELECT * FROM zal WHERE filmId = ? AND seat = ?");
        if (Controller.filmId == 0) {
            preparedStatement6.setInt(1, autorized.filmId);

        } else {
            preparedStatement6.setInt(1, Controller.filmId);
        }
        preparedStatement6.setString(2,"2 ряд 1 место");
        ResultSet resultSet6=preparedStatement6.executeQuery();
        while (resultSet6.next()){

            if(resultSet6.getString("available").equals("занято")){
                SecondRow1Seat.setDisable(true);


            }
        }
        PreparedStatement preparedStatement7=connection.prepareStatement("SELECT * FROM zal WHERE filmId = ? AND seat = ?");
        if (Controller.filmId == 0) {
            preparedStatement7.setInt(1, autorized.filmId);

        } else {
            preparedStatement7.setInt(1, Controller.filmId);
        }
        preparedStatement7.setString(2,"2 ряд 2 место");
        ResultSet resultSet7=preparedStatement7.executeQuery();
        while (resultSet7.next()){

            if(resultSet7.getString("available").equals("занято")){
                SecondRow2Seat.setDisable(true);


            }
        }
        PreparedStatement preparedStatement8=connection.prepareStatement("SELECT * FROM zal WHERE filmId = ? AND seat = ?");
        if (Controller.filmId == 0) {
            preparedStatement8.setInt(1, autorized.filmId);

        } else {
            preparedStatement8.setInt(1, Controller.filmId);
        }
        preparedStatement8.setString(2,"2 ряд 3 место");
        ResultSet resultSet8=preparedStatement8.executeQuery();
        while (resultSet8.next()){

            if(resultSet8.getString("available").equals("занято")){
                SecondRow3Seat.setDisable(true);


            }
        }
        PreparedStatement preparedStatement9=connection.prepareStatement("SELECT * FROM zal WHERE filmId = ? AND seat = ?");
        if (Controller.filmId == 0) {
            preparedStatement9.setInt(1, autorized.filmId);

        } else {
            preparedStatement9.setInt(1, Controller.filmId);
        }
        preparedStatement9.setString(2,"2 ряд 4 место");
        ResultSet resultSet9=preparedStatement9.executeQuery();
        while (resultSet9.next()){

            if(resultSet9.getString("available").equals("занято")){
                SecondRow4Seat.setDisable(true);


            }
        }
        PreparedStatement preparedStatement10=connection.prepareStatement("SELECT * FROM zal WHERE filmId = ? AND seat = ?");
        if (Controller.filmId == 0) {
            preparedStatement10.setInt(1, autorized.filmId);

        } else {
            preparedStatement10.setInt(1, Controller.filmId);
        }
        preparedStatement10.setString(2,"2 ряд 5 место");
        ResultSet resultSet10=preparedStatement10.executeQuery();
        while (resultSet10.next()){

            if(resultSet10.getString("available").equals("занято")){
                SecondRow5Seat.setDisable(true);


            }
        }
        PreparedStatement preparedStatement11=connection.prepareStatement("SELECT * FROM zal WHERE filmId = ? AND seat = ?");
        if (Controller.filmId == 0) {
            preparedStatement11.setInt(1, autorized.filmId);

        } else {
            preparedStatement11.setInt(1, Controller.filmId);
        }
        preparedStatement11.setString(2,"2 ряд 6 место");
        ResultSet resultSet11=preparedStatement11.executeQuery();
        while (resultSet11.next()){

            if(resultSet11.getString("available").equals("занято")){
                SecondRow6Seat.setDisable(true);


            }
        }
        PreparedStatement preparedStatement12=connection.prepareStatement("SELECT * FROM zal WHERE filmId = ? AND seat = ?");
        if (Controller.filmId == 0) {
            preparedStatement12.setInt(1, autorized.filmId);

        } else {
            preparedStatement12.setInt(1, Controller.filmId);
        }
        preparedStatement12.setString(2,"3 ряд 1 место");
        ResultSet resultSet12=preparedStatement12.executeQuery();
        while (resultSet12.next()){

            if(resultSet12.getString("available").equals("занято")){
                ThirdfRow1Seat.setDisable(true);


            }
        }
        PreparedStatement preparedStatement13=connection.prepareStatement("SELECT * FROM zal WHERE filmId = ? AND seat = ?");
        if (Controller.filmId == 0) {
            preparedStatement13.setInt(1, autorized.filmId);

        } else {
            preparedStatement13.setInt(1, Controller.filmId);
        }
        preparedStatement13.setString(2,"3 ряд 2 место");
        ResultSet resultSet13=preparedStatement13.executeQuery();
        while (resultSet13.next()){

            if(resultSet13.getString("available").equals("занято")){
                ThirdfRow2Seat.setDisable(true);


            }
        }
        PreparedStatement preparedStatement14=connection.prepareStatement("SELECT * FROM zal WHERE filmId = ? AND seat = ?");
        if (Controller.filmId == 0) {
            preparedStatement14.setInt(1, autorized.filmId);

        } else {
            preparedStatement14.setInt(1, Controller.filmId);
        }
        preparedStatement14.setString(2,"3 ряд 3 место");
        ResultSet resultSet14=preparedStatement14.executeQuery();
        while (resultSet14.next()){

            if(resultSet14.getString("available").equals("занято")){
                ThirdfRow3Seat.setDisable(true);


            }
        }
        PreparedStatement preparedStatement15=connection.prepareStatement("SELECT * FROM zal WHERE filmId = ? AND seat = ?");
        if (Controller.filmId == 0) {
            preparedStatement15.setInt(1, autorized.filmId);

        } else {
            preparedStatement15.setInt(1, Controller.filmId);
        }
        preparedStatement15.setString(2,"3 ряд 4 место");
        ResultSet resultSet15=preparedStatement15.executeQuery();
        while (resultSet15.next()){

            if(resultSet15.getString("available").equals("занято")){
                ThirdfRow4Seat.setDisable(true);


            }
        }
        PreparedStatement preparedStatement16=connection.prepareStatement("SELECT * FROM zal WHERE filmId = ? AND seat = ?");
        if (Controller.filmId == 0) {
            preparedStatement16.setInt(1, autorized.filmId);

        } else {
            preparedStatement16.setInt(1, Controller.filmId);
        }
        preparedStatement16.setString(2,"3 ряд 5 место");
        ResultSet resultSet16=preparedStatement16.executeQuery();
        while (resultSet16.next()){

            if(resultSet16.getString("available").equals("занято")){
                ThirdfRow5Seat.setDisable(true);


            }
        }
        PreparedStatement preparedStatement17=connection.prepareStatement("SELECT * FROM zal WHERE filmId = ? AND seat = ?");
        if (Controller.filmId == 0) {
            preparedStatement17.setInt(1, autorized.filmId);

        } else {
            preparedStatement17.setInt(1, Controller.filmId);
        }
        preparedStatement17.setString(2,"3 ряд 6 место");
        ResultSet resultSet17=preparedStatement17.executeQuery();
        while (resultSet17.next()){

            if(resultSet17.getString("available").equals("занято")){
                ThirdfRow6Seat.setDisable(true);


            }
        }
        PreparedStatement preparedStatement18=connection.prepareStatement("SELECT * FROM zal WHERE filmId = ? AND seat = ?");
        if (Controller.filmId == 0) {
            preparedStatement18.setInt(1, autorized.filmId);

        } else {
            preparedStatement18.setInt(1, Controller.filmId);
        }
        preparedStatement18.setString(2,"4 ряд 1 место");
        ResultSet resultSet18=preparedStatement18.executeQuery();
        while (resultSet18.next()){

            if(resultSet18.getString("available").equals("занято")){
                FourthRow1Seat.setDisable(true);


            }
        }
        PreparedStatement preparedStatement19=connection.prepareStatement("SELECT * FROM zal WHERE filmId = ? AND seat = ?");
        if (Controller.filmId == 0) {
            preparedStatement19.setInt(1, autorized.filmId);

        } else {
            preparedStatement19.setInt(1, Controller.filmId);
        }
        preparedStatement19.setString(2,"4 ряд 2 место");
        ResultSet resultSet19=preparedStatement19.executeQuery();
        while (resultSet19.next()){

            if(resultSet19.getString("available").equals("занято")){
                FourthRow2Seat.setDisable(true);


            }
        }
        PreparedStatement preparedStatement20=connection.prepareStatement("SELECT * FROM zal WHERE filmId = ? AND seat = ?");
        if (Controller.filmId == 0) {
            preparedStatement20.setInt(1, autorized.filmId);

        } else {
            preparedStatement20.setInt(1, Controller.filmId);
        }
        preparedStatement20.setString(2,"4 ряд 3 место");
        ResultSet resultSet20=preparedStatement20.executeQuery();
        while (resultSet20.next()){

            if(resultSet20.getString("available").equals("занято")){
                FourthRow3Seat.setDisable(true);


            }
        }
        PreparedStatement preparedStatement21=connection.prepareStatement("SELECT * FROM zal WHERE filmId = ? AND seat = ?");
        if (Controller.filmId == 0) {
            preparedStatement21.setInt(1, autorized.filmId);

        } else {
            preparedStatement21.setInt(1, Controller.filmId);
        }
        preparedStatement21.setString(2,"4 ряд 4 место");
        ResultSet resultSet21=preparedStatement21.executeQuery();
        while (resultSet21.next()){

            if(resultSet21.getString("available").equals("занято")){
                FourthRow4Seat.setDisable(true);


            }
        }
        PreparedStatement preparedStatement22=connection.prepareStatement("SELECT * FROM zal WHERE filmId = ? AND seat = ?");
        if (Controller.filmId == 0) {
            preparedStatement22.setInt(1, autorized.filmId);

        } else {
            preparedStatement22.setInt(1, Controller.filmId);
        }
        preparedStatement22.setString(2,"4 ряд 5 место");
        ResultSet resultSet22=preparedStatement22.executeQuery();
        while (resultSet22.next()){

            if(resultSet22.getString("available").equals("занято")){
                FourthRow5Seat.setDisable(true);


            }
        }
        PreparedStatement preparedStatement23=connection.prepareStatement("SELECT * FROM zal WHERE filmId = ? AND seat = ?");
        if (Controller.filmId == 0) {
            preparedStatement23.setInt(1, autorized.filmId);

        } else {
            preparedStatement23.setInt(1, Controller.filmId);
        }
        preparedStatement23.setString(2,"4 ряд 6 место");
        ResultSet resultSet23=preparedStatement23.executeQuery();
        while (resultSet23.next()){

            if(resultSet23.getString("available").equals("занято")){
                FourthRow6Seat.setDisable(true);


            }
        }


            }








    public void FirstRow1Seat(MouseEvent mouseEvent) {
        FirstRow1Seat.setStyle("-fx-background-color: white");
        FirstRow1Seat.setStyle("-fx-text-fill: black");
        FirstRow1Seat.setDisable(true);
        SelectedSeatsLabel.setText(SelectedSeatsLabel.getText()+" 1 ряд 1 место");
        PriceLabel.setText(PriceLabel.getText().split(" ")[0]
                +" "
                +PriceLabel.getText().split(" ")[1]
                +" "
                +(Integer.parseInt(PriceLabel.getText().split(" ")[2])+5));
        }




    public void FirstRow2Seat(MouseEvent mouseEvent) {
        FirstRow2Seat.setStyle("-fx-background-color: white");
        FirstRow2Seat.setStyle("-fx-text-fill: black");
        FirstRow2Seat.setDisable(true);
        SelectedSeatsLabel.setText(SelectedSeatsLabel.getText()+" 1 ряд 2 место");
        PriceLabel.setText(PriceLabel.getText().split(" ")[0]
                +" "
                +PriceLabel.getText().split(" ")[1]
                +" "
                +(Integer.parseInt(PriceLabel.getText().split(" ")[2])+5));

    }

    public void FirstRow3Seat(MouseEvent mouseEvent) {
        FirstRow3Seat.setStyle("-fx-background-color: white");
        FirstRow3Seat.setStyle("-fx-text-fill: black");
        FirstRow3Seat.setDisable(true);
        SelectedSeatsLabel.setText(SelectedSeatsLabel.getText()+" 1 ряд 3 место");
        PriceLabel.setText(PriceLabel.getText().split(" ")[0]
                +" "
                +PriceLabel.getText().split(" ")[1]
                +" "
                +(Integer.parseInt(PriceLabel.getText().split(" ")[2])+5));
    }

    public void FirstRow4Seat(MouseEvent mouseEvent) {
        FirstRow4Seat.setStyle("-fx-background-color: white");
        FirstRow4Seat.setStyle("-fx-text-fill: black");
        FirstRow4Seat.setDisable(true);
        SelectedSeatsLabel.setText(SelectedSeatsLabel.getText()+" 1 ряд 4 место");
        PriceLabel.setText(PriceLabel.getText().split(" ")[0]
                +" "
                +PriceLabel.getText().split(" ")[1]
                +" "
                +(Integer.parseInt(PriceLabel.getText().split(" ")[2])+5));
    }

    public void FirstRow5Seat(MouseEvent mouseEvent) {
        FirstRow5Seat.setStyle("-fx-background-color: white");
        FirstRow5Seat.setStyle("-fx-text-fill: black");
        FirstRow5Seat.setDisable(true);
        SelectedSeatsLabel.setText(SelectedSeatsLabel.getText()+" 1 ряд 5 место");
        PriceLabel.setText(PriceLabel.getText().split(" ")[0]
                +" "
                +PriceLabel.getText().split(" ")[1]
                +" "
                +(Integer.parseInt(PriceLabel.getText().split(" ")[2])+5));
    }

    public void FirstRow6Seat(MouseEvent mouseEvent) {
        FirstRow6Seat.setStyle("-fx-background-color: white");
        FirstRow6Seat.setStyle("-fx-text-fill: black");
        FirstRow6Seat.setDisable(true);
        SelectedSeatsLabel.setText(SelectedSeatsLabel.getText()+" 1 ряд 6 место");
        PriceLabel.setText(PriceLabel.getText().split(" ")[0]
                +" "
                +PriceLabel.getText().split(" ")[1]
                +" "
                +(Integer.parseInt(PriceLabel.getText().split(" ")[2])+5));
    }

    public void SecondRow1Seat(MouseEvent mouseEvent) {
        SecondRow1Seat.setStyle("-fx-background-color: white");
        SecondRow1Seat.setStyle("-fx-text-fill: black");
        SecondRow1Seat.setDisable(true);
        SelectedSeatsLabel.setText(SelectedSeatsLabel.getText()+" 2 ряд 1 место");
        PriceLabel.setText(PriceLabel.getText().split(" ")[0]
                +" "
                +PriceLabel.getText().split(" ")[1]
                +" "
                +(Integer.parseInt(PriceLabel.getText().split(" ")[2])+5));
    }

    public void SecondRow3Seat(MouseEvent mouseEvent) {
        SecondRow3Seat.setStyle("-fx-background-color: white");
        SecondRow3Seat.setStyle("-fx-text-fill: black");
        SecondRow3Seat.setDisable(true);
        SelectedSeatsLabel.setText(SelectedSeatsLabel.getText()+" 2 ряд 3 место");
        PriceLabel.setText(PriceLabel.getText().split(" ")[0]
                +" "
                +PriceLabel.getText().split(" ")[1]
                +" "
                +(Integer.parseInt(PriceLabel.getText().split(" ")[2])+5));
    }

    public void SecondRow4Seat(MouseEvent mouseEvent) {
        SecondRow4Seat.setStyle("-fx-background-color: white");
        SecondRow4Seat.setStyle("-fx-text-fill: black");
        SecondRow4Seat.setDisable(true);
        SelectedSeatsLabel.setText(SelectedSeatsLabel.getText()+" 2 ряд 4 место");
        PriceLabel.setText(PriceLabel.getText().split(" ")[0]
                +" "
                +PriceLabel.getText().split(" ")[1]
                +" "
                +(Integer.parseInt(PriceLabel.getText().split(" ")[2])+5));
    }

    public void SecondRow5Seat(MouseEvent mouseEvent) {
        SecondRow5Seat.setStyle("-fx-background-color: white");
        SecondRow5Seat.setStyle("-fx-text-fill: black");
        SecondRow5Seat.setDisable(true);
        SelectedSeatsLabel.setText(SelectedSeatsLabel.getText()+" 2 ряд 5 место");
        PriceLabel.setText(PriceLabel.getText().split(" ")[0]
                +" "
                +PriceLabel.getText().split(" ")[1]
                +" "
                +(Integer.parseInt(PriceLabel.getText().split(" ")[2])+5));
    }

    public void SecondRow6Seat(MouseEvent mouseEvent) {
        SecondRow6Seat.setStyle("-fx-background-color: white");
        SecondRow6Seat.setStyle("-fx-text-fill: black");
        SecondRow6Seat.setDisable(true);
        SelectedSeatsLabel.setText(SelectedSeatsLabel.getText()+" 2 ряд 6 место");
        PriceLabel.setText(PriceLabel.getText().split(" ")[0]
                +" "
                +PriceLabel.getText().split(" ")[1]
                +" "
                +(Integer.parseInt(PriceLabel.getText().split(" ")[2])+5));
    }

    public void ThirdfRow1Seat(MouseEvent mouseEvent) {
        ThirdfRow1Seat.setStyle("-fx-background-color: white");
        ThirdfRow1Seat.setStyle("-fx-text-fill: black");
        ThirdfRow1Seat.setDisable(true);
        SelectedSeatsLabel.setText(SelectedSeatsLabel.getText()+" 3 ряд 1 место");
        PriceLabel.setText(PriceLabel.getText().split(" ")[0]
                +" "
                +PriceLabel.getText().split(" ")[1]
                +" "
                +(Integer.parseInt(PriceLabel.getText().split(" ")[2])+5));
    }

    public void ThirdfRow2Seat(MouseEvent mouseEvent) {
        ThirdfRow2Seat.setStyle("-fx-background-color: white");
        ThirdfRow2Seat.setStyle("-fx-text-fill: black");
        ThirdfRow2Seat.setDisable(true);
        SelectedSeatsLabel.setText(SelectedSeatsLabel.getText()+" 3 ряд 2 место");
        PriceLabel.setText(PriceLabel.getText().split(" ")[0]
                +" "
                +PriceLabel.getText().split(" ")[1]
                +" "
                +(Integer.parseInt(PriceLabel.getText().split(" ")[2])+5));
    }

    public void ThirdfRow3Seat(MouseEvent mouseEvent) {
        ThirdfRow3Seat.setStyle("-fx-background-color: white");
        ThirdfRow3Seat.setStyle("-fx-text-fill: black");
        ThirdfRow3Seat.setDisable(true);
        SelectedSeatsLabel.setText(SelectedSeatsLabel.getText()+" 3 ряд 3 место");
        PriceLabel.setText(PriceLabel.getText().split(" ")[0]
                +" "
                +PriceLabel.getText().split(" ")[1]
                +" "
                +(Integer.parseInt(PriceLabel.getText().split(" ")[2])+5));
    }

    public void ThirdfRow4Seat(MouseEvent mouseEvent) {
        ThirdfRow4Seat.setStyle("-fx-background-color: white");
        ThirdfRow4Seat.setStyle("-fx-text-fill: black");
        ThirdfRow4Seat.setDisable(true);
        SelectedSeatsLabel.setText(SelectedSeatsLabel.getText()+" 3 ряд 4 место");
        PriceLabel.setText(PriceLabel.getText().split(" ")[0]
                +" "
                +PriceLabel.getText().split(" ")[1]
                +" "
                +(Integer.parseInt(PriceLabel.getText().split(" ")[2])+5));
    }

    public void ThirdfRow5Seat(MouseEvent mouseEvent) {
        ThirdfRow5Seat.setStyle("-fx-background-color: white");
        ThirdfRow5Seat.setStyle("-fx-text-fill: black");
        ThirdfRow5Seat.setDisable(true);
        SelectedSeatsLabel.setText(SelectedSeatsLabel.getText()+" 3 ряд 5 место");
        PriceLabel.setText(PriceLabel.getText().split(" ")[0]
                +" "
                +PriceLabel.getText().split(" ")[1]
                +" "
                +(Integer.parseInt(PriceLabel.getText().split(" ")[2])+5));
    }

    public void ThirdfRow6Seat(MouseEvent mouseEvent) {
        ThirdfRow6Seat.setStyle("-fx-background-color: white");
        ThirdfRow6Seat.setStyle("-fx-text-fill: black");
        ThirdfRow6Seat.setDisable(true);
        SelectedSeatsLabel.setText(SelectedSeatsLabel.getText()+" 3 ряд 6 место");
        PriceLabel.setText(PriceLabel.getText().split(" ")[0]
                +" "
                +PriceLabel.getText().split(" ")[1]
                +" "
                +(Integer.parseInt(PriceLabel.getText().split(" ")[2])+5));
    }

    public void FourthRow1Seat(MouseEvent mouseEvent) {
        FourthRow1Seat.setStyle("-fx-background-color: white");
        FourthRow1Seat.setStyle("-fx-text-fill: black");
        FourthRow1Seat.setDisable(true);
        SelectedSeatsLabel.setText(SelectedSeatsLabel.getText()+" 4 ряд 1 место");
        PriceLabel.setText(PriceLabel.getText().split(" ")[0]
                +" "
                +PriceLabel.getText().split(" ")[1]
                +" "
                +(Integer.parseInt(PriceLabel.getText().split(" ")[2])+5));
    }

    public void FourthRow2Seat(MouseEvent mouseEvent) {
        FourthRow2Seat.setStyle("-fx-background-color: white");
        FourthRow2Seat.setStyle("-fx-text-fill: black");
        FirstRow2Seat.setDisable(true);
        SelectedSeatsLabel.setText(SelectedSeatsLabel.getText()+" 4 ряд 2 место");
        PriceLabel.setText(PriceLabel.getText().split(" ")[0]
                +" "
                +PriceLabel.getText().split(" ")[1]
                +" "
                +(Integer.parseInt(PriceLabel.getText().split(" ")[2])+5));
    }

    public void FourthRow3Seat(MouseEvent mouseEvent) {
        FourthRow3Seat.setStyle("-fx-background-color: white");
        FourthRow3Seat.setStyle("-fx-text-fill: black");
        FourthRow3Seat.setDisable(true);
        SelectedSeatsLabel.setText(SelectedSeatsLabel.getText()+" 4 ряд 3 место");
        PriceLabel.setText(PriceLabel.getText().split(" ")[0]
                +" "
                +PriceLabel.getText().split(" ")[1]
                +" "
                +(Integer.parseInt(PriceLabel.getText().split(" ")[2])+5));
    }

    public void FourthRow4Seat(MouseEvent mouseEvent) {
        FourthRow4Seat.setStyle("-fx-background-color: white");
        FourthRow4Seat.setStyle("-fx-text-fill: black");
        FourthRow4Seat.setDisable(true);
        SelectedSeatsLabel.setText(SelectedSeatsLabel.getText()+" 4 ряд 4 место");
        PriceLabel.setText(PriceLabel.getText().split(" ")[0]
                +" "
                +PriceLabel.getText().split(" ")[1]
                +" "
                +(Integer.parseInt(PriceLabel.getText().split(" ")[2])+5));
    }

    public void FourthRow5Seat(MouseEvent mouseEvent) {
        FourthRow5Seat.setStyle("-fx-background-color: white");
        FourthRow5Seat.setStyle("-fx-text-fill: black");
        FourthRow5Seat.setDisable(true);
        SelectedSeatsLabel.setText(SelectedSeatsLabel.getText()+" 4 ряд 5 место");
        PriceLabel.setText(PriceLabel.getText().split(" ")[0]
                +" "
                +PriceLabel.getText().split(" ")[1]
                +" "
                +(Integer.parseInt(PriceLabel.getText().split(" ")[2])+5));
    }

    public void FourthRow6Seat(MouseEvent mouseEvent) {
        FourthRow6Seat.setStyle("-fx-background-color: white");
        FourthRow6Seat.setStyle("-fx-text-fill: black");
        FourthRow6Seat.setDisable(true);
        SelectedSeatsLabel.setText(SelectedSeatsLabel.getText()+" 4 ряд 6 место");
        PriceLabel.setText(PriceLabel.getText().split(" ")[0]
                +" "
                +PriceLabel.getText().split(" ")[1]
                +" "
                +(Integer.parseInt(PriceLabel.getText().split(" ")[2])+5));
    }

    public void buy(MouseEvent mouseEvent) throws SQLException, ClassNotFoundException {

        if (NameField.getText() == null) {
            NameField.setStyle("-fx-text-fill: red");
            NameField.setText("Введите имя");
        } else {

            if ( FirstRow1Seat.getStyle().equals("-fx-text-fill: black"))   {

                DataBaseHandler dataBaseHandler = new DataBaseHandler();
                Connection connection = dataBaseHandler.getDbConnection();
                PreparedStatement preparedStatement = connection.prepareStatement("UPDATE zal SET available = ? WHERE filmId = ? AND seat = ? ");
                preparedStatement.setString(1, "занято");
                preparedStatement.setInt(2, Controller.filmId);
                preparedStatement.setString(3, "1 ряд 1 место");
                preparedStatement.executeUpdate();
                PreparedStatement preparedStatement1 = connection.prepareStatement("INSERT INTO tickets (usename,film,seats)" + "values(?,?,?)");
                preparedStatement1.setString(1, NameField.getText());
                if (Controller.film==null) {
                    preparedStatement1.setString(2, autorized.film);

                } else {
                    preparedStatement1.setString(2, Controller.film);
                }
                preparedStatement1.setString(3, "1 ряд 1 место");
                preparedStatement1.executeUpdate();
            }
            if ( FirstRow2Seat.getStyle().equals("-fx-text-fill: black"))   {

                DataBaseHandler dataBaseHandler = new DataBaseHandler();
                Connection connection = dataBaseHandler.getDbConnection();
                PreparedStatement preparedStatement = connection.prepareStatement("UPDATE zal SET available = ? WHERE filmId = ? AND seat = ? ");
                preparedStatement.setString(1, "занято");
                preparedStatement.setInt(2, Controller.filmId);
                preparedStatement.setString(3, "1 ряд 2 место");
                preparedStatement.executeUpdate();
                PreparedStatement preparedStatement1 = connection.prepareStatement("INSERT INTO tickets (usename,film,seats)" + "values(?,?,?)");
                preparedStatement1.setString(1, NameField.getText());
                if (Controller.film==null) {
                    preparedStatement1.setString(2, autorized.film);

                } else {
                    preparedStatement1.setString(2, Controller.film);
                }
                preparedStatement1.setString(3, "1 ряд 2 место");
                preparedStatement1.executeUpdate();
            }
            if ( FirstRow3Seat.getStyle().equals("-fx-text-fill: black"))   {

                DataBaseHandler dataBaseHandler = new DataBaseHandler();
                Connection connection = dataBaseHandler.getDbConnection();
                PreparedStatement preparedStatement = connection.prepareStatement("UPDATE zal SET available = ? WHERE filmId = ? AND seat = ? ");
                preparedStatement.setString(1, "занято");
                preparedStatement.setInt(2, Controller.filmId);
                preparedStatement.setString(3, "1 ряд 3 место");
                preparedStatement.executeUpdate();
                PreparedStatement preparedStatement1 = connection.prepareStatement("INSERT INTO tickets (usename,film,seats)" + "values(?,?,?)");
                preparedStatement1.setString(1, NameField.getText());
                if (Controller.film==null) {
                    preparedStatement1.setString(2, autorized.film);

                } else {
                    preparedStatement1.setString(2, Controller.film);
                }
                preparedStatement1.setString(3, "1 ряд 3 место");
                preparedStatement1.executeUpdate();
            }
            if ( FirstRow4Seat.getStyle().equals("-fx-text-fill: black"))   {

                DataBaseHandler dataBaseHandler = new DataBaseHandler();
                Connection connection = dataBaseHandler.getDbConnection();
                PreparedStatement preparedStatement = connection.prepareStatement("UPDATE zal SET available = ? WHERE filmId = ? AND seat = ? ");
                preparedStatement.setString(1, "занято");
                preparedStatement.setInt(2, Controller.filmId);
                preparedStatement.setString(3, "1 ряд 4 место");
                preparedStatement.executeUpdate();
                PreparedStatement preparedStatement1 = connection.prepareStatement("INSERT INTO tickets (usename,film,seats)" + "values(?,?,?)");
                preparedStatement1.setString(1, NameField.getText());
                if (Controller.film==null) {
                    preparedStatement1.setString(2, autorized.film);

                } else {
                    preparedStatement1.setString(2, Controller.film);
                }
                preparedStatement1.setString(3, "1 ряд 4 место");
                preparedStatement1.executeUpdate();
            }
            if ( FirstRow5Seat.getStyle().equals("-fx-text-fill: black"))   {

                DataBaseHandler dataBaseHandler = new DataBaseHandler();
                Connection connection = dataBaseHandler.getDbConnection();
                PreparedStatement preparedStatement = connection.prepareStatement("UPDATE zal SET available = ? WHERE filmId = ? AND seat = ? ");
                preparedStatement.setString(1, "занято");
                preparedStatement.setInt(2, Controller.filmId);
                preparedStatement.setString(3, "1 ряд 5 место");
                preparedStatement.executeUpdate();
                PreparedStatement preparedStatement1 = connection.prepareStatement("INSERT INTO tickets (usename,film,seats)" + "values(?,?,?)");
                preparedStatement1.setString(1, NameField.getText());
                if (Controller.film==null) {
                    preparedStatement1.setString(2, autorized.film);

                } else {
                    preparedStatement1.setString(2, Controller.film);
                }
                preparedStatement1.setString(3, "1 ряд 5 место");
                preparedStatement1.executeUpdate();
            }
            if ( FirstRow6Seat.getStyle().equals("-fx-text-fill: black"))   {

                DataBaseHandler dataBaseHandler = new DataBaseHandler();
                Connection connection = dataBaseHandler.getDbConnection();
                PreparedStatement preparedStatement = connection.prepareStatement("UPDATE zal SET available = ? WHERE filmId = ? AND seat = ? ");
                preparedStatement.setString(1, "занято");
                preparedStatement.setInt(2, Controller.filmId);
                preparedStatement.setString(3, "1 ряд 6 место");
                preparedStatement.executeUpdate();
                PreparedStatement preparedStatement1 = connection.prepareStatement("INSERT INTO tickets (usename,film,seats)" + "values(?,?,?)");
                preparedStatement1.setString(1, NameField.getText());
                if (Controller.film==null) {
                    preparedStatement1.setString(2, autorized.film);

                } else {
                    preparedStatement1.setString(2, Controller.film);
                }
                preparedStatement1.setString(3, "1 ряд 6 место");
                preparedStatement1.executeUpdate();
            }
            if ( SecondRow1Seat.getStyle().equals("-fx-text-fill: black"))   {

                DataBaseHandler dataBaseHandler = new DataBaseHandler();
                Connection connection = dataBaseHandler.getDbConnection();
                PreparedStatement preparedStatement = connection.prepareStatement("UPDATE zal SET available = ? WHERE filmId = ? AND seat = ? ");
                preparedStatement.setString(1, "занято");
                preparedStatement.setInt(2, Controller.filmId);
                preparedStatement.setString(3, "2 ряд 1 место");
                preparedStatement.executeUpdate();
                PreparedStatement preparedStatement1 = connection.prepareStatement("INSERT INTO tickets (usename,film,seats)" + "values(?,?,?)");
                preparedStatement1.setString(1, NameField.getText());
                if (Controller.film==null) {
                    preparedStatement1.setString(2, autorized.film);

                } else {
                    preparedStatement1.setString(2, Controller.film);
                }
                preparedStatement1.setString(3, "2 ряд 1 место");
                preparedStatement1.executeUpdate();
            }
            if ( SecondRow2Seat.getStyle().equals("-fx-text-fill: black"))   {

                DataBaseHandler dataBaseHandler = new DataBaseHandler();
                Connection connection = dataBaseHandler.getDbConnection();
                PreparedStatement preparedStatement = connection.prepareStatement("UPDATE zal SET available = ? WHERE filmId = ? AND seat = ? ");
                preparedStatement.setString(1, "занято");
                preparedStatement.setInt(2, Controller.filmId);
                preparedStatement.setString(3, "2 ряд 2 место");
                preparedStatement.executeUpdate();
                PreparedStatement preparedStatement1 = connection.prepareStatement("INSERT INTO tickets (usename,film,seats)" + "values(?,?,?)");
                preparedStatement1.setString(1, NameField.getText());
                if (Controller.film==null) {
                    preparedStatement1.setString(2, autorized.film);

                } else {
                    preparedStatement1.setString(2, Controller.film);
                }
                preparedStatement1.setString(3, "2 ряд 2 место");
                preparedStatement1.executeUpdate();
            }
            if ( SecondRow3Seat.getStyle().equals("-fx-text-fill: black"))   {

                DataBaseHandler dataBaseHandler = new DataBaseHandler();
                Connection connection = dataBaseHandler.getDbConnection();
                PreparedStatement preparedStatement = connection.prepareStatement("UPDATE zal SET available = ? WHERE filmId = ? AND seat = ? ");
                preparedStatement.setString(1, "занято");
                preparedStatement.setInt(2, Controller.filmId);
                preparedStatement.setString(3, "2 ряд 3 место");
                preparedStatement.executeUpdate();
                PreparedStatement preparedStatement1 = connection.prepareStatement("INSERT INTO tickets (usename,film,seats)" + "values(?,?,?)");
                preparedStatement1.setString(1, NameField.getText());
                if (Controller.film==null) {
                    preparedStatement1.setString(2, autorized.film);

                } else {
                    preparedStatement1.setString(2, Controller.film);
                }
                preparedStatement1.setString(3, "2 ряд 3 место");
                preparedStatement1.executeUpdate();
            }
            if ( SecondRow4Seat.getStyle().equals("-fx-text-fill: black"))   {

                DataBaseHandler dataBaseHandler = new DataBaseHandler();
                Connection connection = dataBaseHandler.getDbConnection();
                PreparedStatement preparedStatement = connection.prepareStatement("UPDATE zal SET available = ? WHERE filmId = ? AND seat = ? ");
                preparedStatement.setString(1, "занято");
                preparedStatement.setInt(2, Controller.filmId);
                preparedStatement.setString(3, "2 ряд 4 место");
                preparedStatement.executeUpdate();
                PreparedStatement preparedStatement1 = connection.prepareStatement("INSERT INTO tickets (usename,film,seats)" + "values(?,?,?)");
                preparedStatement1.setString(1, NameField.getText());
                if (Controller.film==null) {
                    preparedStatement1.setString(2, autorized.film);

                } else {
                    preparedStatement1.setString(2, Controller.film);
                }
                preparedStatement1.setString(3, "2 ряд 4 место");
                preparedStatement1.executeUpdate();
            }
            if ( SecondRow5Seat.getStyle().equals("-fx-text-fill: black"))   {

                DataBaseHandler dataBaseHandler = new DataBaseHandler();
                Connection connection = dataBaseHandler.getDbConnection();
                PreparedStatement preparedStatement = connection.prepareStatement("UPDATE zal SET available = ? WHERE filmId = ? AND seat = ? ");
                preparedStatement.setString(1, "занято");
                preparedStatement.setInt(2, Controller.filmId);
                preparedStatement.setString(3, "2 ряд 5 место");
                preparedStatement.executeUpdate();
                PreparedStatement preparedStatement1 = connection.prepareStatement("INSERT INTO tickets (usename,film,seats)" + "values(?,?,?)");
                preparedStatement1.setString(1, NameField.getText());
                if (Controller.film==null) {
                    preparedStatement1.setString(2, autorized.film);

                } else {
                    preparedStatement1.setString(2, Controller.film);
                }
                preparedStatement1.setString(3, "2 ряд 5 место");
                preparedStatement1.executeUpdate();
            }
            if ( SecondRow6Seat.getStyle().equals("-fx-text-fill: black"))   {

                DataBaseHandler dataBaseHandler = new DataBaseHandler();
                Connection connection = dataBaseHandler.getDbConnection();
                PreparedStatement preparedStatement = connection.prepareStatement("UPDATE zal SET available = ? WHERE filmId = ? AND seat = ? ");
                preparedStatement.setString(1, "занято");
                preparedStatement.setInt(2, Controller.filmId);
                preparedStatement.setString(3, "2 ряд 6 место");
                preparedStatement.executeUpdate();
                PreparedStatement preparedStatement1 = connection.prepareStatement("INSERT INTO tickets (usename,film,seats)" + "values(?,?,?)");
                preparedStatement1.setString(1, NameField.getText());
                if (Controller.film==null) {
                    preparedStatement1.setString(2, autorized.film);

                } else {
                    preparedStatement1.setString(2, Controller.film);
                }
                preparedStatement1.setString(3, "2 ряд 6 место");
                preparedStatement1.executeUpdate();
            }
            if ( ThirdfRow1Seat.getStyle().equals("-fx-text-fill: black"))   {

                DataBaseHandler dataBaseHandler = new DataBaseHandler();
                Connection connection = dataBaseHandler.getDbConnection();
                PreparedStatement preparedStatement = connection.prepareStatement("UPDATE zal SET available = ? WHERE filmId = ? AND seat = ? ");
                preparedStatement.setString(1, "занято");
                preparedStatement.setInt(2, Controller.filmId);
                preparedStatement.setString(3, "3 ряд 1 место");
                preparedStatement.executeUpdate();
                PreparedStatement preparedStatement1 = connection.prepareStatement("INSERT INTO tickets (usename,film,seats)" + "values(?,?,?)");
                preparedStatement1.setString(1, NameField.getText());
                if (Controller.film==null) {
                    preparedStatement1.setString(2, autorized.film);

                } else {
                    preparedStatement1.setString(2, Controller.film);
                }
                preparedStatement1.setString(3, "3 ряд 1 место");
                preparedStatement1.executeUpdate();
            }
            if ( ThirdfRow2Seat.getStyle().equals("-fx-text-fill: black"))   {

                DataBaseHandler dataBaseHandler = new DataBaseHandler();
                Connection connection = dataBaseHandler.getDbConnection();
                PreparedStatement preparedStatement = connection.prepareStatement("UPDATE zal SET available = ? WHERE filmId = ? AND seat = ? ");
                preparedStatement.setString(1, "занято");
                preparedStatement.setInt(2, Controller.filmId);
                preparedStatement.setString(3, "3 ряд 2 место");
                preparedStatement.executeUpdate();
                PreparedStatement preparedStatement1 = connection.prepareStatement("INSERT INTO tickets (usename,film,seats)" + "values(?,?,?)");
                preparedStatement1.setString(1, NameField.getText());
                if (Controller.film==null) {
                    preparedStatement1.setString(2, autorized.film);

                } else {
                    preparedStatement1.setString(2, Controller.film);
                }
                preparedStatement1.setString(3, "3 ряд 2 место");
                preparedStatement1.executeUpdate();
            }
            if ( ThirdfRow3Seat.getStyle().equals("-fx-text-fill: black"))   {

                DataBaseHandler dataBaseHandler = new DataBaseHandler();
                Connection connection = dataBaseHandler.getDbConnection();
                PreparedStatement preparedStatement = connection.prepareStatement("UPDATE zal SET available = ? WHERE filmId = ? AND seat = ? ");
                preparedStatement.setString(1, "занято");
                preparedStatement.setInt(2, Controller.filmId);
                preparedStatement.setString(3, "3 ряд 3 место");
                preparedStatement.executeUpdate();
                PreparedStatement preparedStatement1 = connection.prepareStatement("INSERT INTO tickets (usename,film,seats)" + "values(?,?,?)");
                preparedStatement1.setString(1, NameField.getText());
                if (Controller.film==null) {
                    preparedStatement1.setString(2, autorized.film);

                } else {
                    preparedStatement1.setString(2, Controller.film);
                }
                preparedStatement1.setString(3, "3 ряд 3 место");
                preparedStatement1.executeUpdate();
            }
            if ( ThirdfRow4Seat.getStyle().equals("-fx-text-fill: black"))   {

                DataBaseHandler dataBaseHandler = new DataBaseHandler();
                Connection connection = dataBaseHandler.getDbConnection();
                PreparedStatement preparedStatement = connection.prepareStatement("UPDATE zal SET available = ? WHERE filmId = ? AND seat = ? ");
                preparedStatement.setString(1, "занято");
                preparedStatement.setInt(2, Controller.filmId);
                preparedStatement.setString(3, "3 ряд 4 место");
                preparedStatement.executeUpdate();
                PreparedStatement preparedStatement1 = connection.prepareStatement("INSERT INTO tickets (usename,film,seats)" + "values(?,?,?)");
                preparedStatement1.setString(1, NameField.getText());
                if (Controller.film==null) {
                    preparedStatement1.setString(2, autorized.film);

                } else {
                    preparedStatement1.setString(2, Controller.film);
                }
                preparedStatement1.setString(3, "3 ряд 4 место");
                preparedStatement1.executeUpdate();
            }
            if ( ThirdfRow5Seat.getStyle().equals("-fx-text-fill: black"))   {

                DataBaseHandler dataBaseHandler = new DataBaseHandler();
                Connection connection = dataBaseHandler.getDbConnection();
                PreparedStatement preparedStatement = connection.prepareStatement("UPDATE zal SET available = ? WHERE filmId = ? AND seat = ? ");
                preparedStatement.setString(1, "занято");
                preparedStatement.setInt(2, Controller.filmId);
                preparedStatement.setString(3, "3 ряд 5 место");
                preparedStatement.executeUpdate();
                PreparedStatement preparedStatement1 = connection.prepareStatement("INSERT INTO tickets (usename,film,seats)" + "values(?,?,?)");
                preparedStatement1.setString(1, NameField.getText());
                if (Controller.film==null) {
                    preparedStatement1.setString(2, autorized.film);

                } else {
                    preparedStatement1.setString(2, Controller.film);
                }
                preparedStatement1.setString(3, "3 ряд 5 место");
                preparedStatement1.executeUpdate();
            }
            if ( ThirdfRow6Seat.getStyle().equals("-fx-text-fill: black"))   {

                DataBaseHandler dataBaseHandler = new DataBaseHandler();
                Connection connection = dataBaseHandler.getDbConnection();
                PreparedStatement preparedStatement = connection.prepareStatement("UPDATE zal SET available = ? WHERE filmId = ? AND seat = ? ");
                preparedStatement.setString(1, "занято");
                preparedStatement.setInt(2, Controller.filmId);
                preparedStatement.setString(3, "3 ряд 6 место");
                preparedStatement.executeUpdate();
                PreparedStatement preparedStatement1 = connection.prepareStatement("INSERT INTO tickets (usename,film,seats)" + "values(?,?,?)");
                preparedStatement1.setString(1, NameField.getText());
                if (Controller.film==null) {
                    preparedStatement1.setString(2, autorized.film);

                } else {
                    preparedStatement1.setString(2, Controller.film);
                }
                preparedStatement1.setString(3, "3 ряд 6 место");
                preparedStatement1.executeUpdate();
            }
            if ( FourthRow1Seat.getStyle().equals("-fx-text-fill: black"))   {

                DataBaseHandler dataBaseHandler = new DataBaseHandler();
                Connection connection = dataBaseHandler.getDbConnection();
                PreparedStatement preparedStatement = connection.prepareStatement("UPDATE zal SET available = ? WHERE filmId = ? AND seat = ? ");
                preparedStatement.setString(1, "занято");
                preparedStatement.setInt(2, Controller.filmId);
                preparedStatement.setString(3, "4 ряд 1 место");
                preparedStatement.executeUpdate();
                PreparedStatement preparedStatement1 = connection.prepareStatement("INSERT INTO tickets (usename,film,seats)" + "values(?,?,?)");
                preparedStatement1.setString(1, NameField.getText());
                if (Controller.film==null) {
                    preparedStatement1.setString(2, autorized.film);

                } else {
                    preparedStatement1.setString(2, Controller.film);
                }
                preparedStatement1.setString(3, "4 ряд 1 место");
                preparedStatement1.executeUpdate();
            }
            if ( FourthRow2Seat.getStyle().equals("-fx-text-fill: black"))   {

                DataBaseHandler dataBaseHandler = new DataBaseHandler();
                Connection connection = dataBaseHandler.getDbConnection();
                PreparedStatement preparedStatement = connection.prepareStatement("UPDATE zal SET available = ? WHERE filmId = ? AND seat = ? ");
                preparedStatement.setString(1, "занято");
                preparedStatement.setInt(2, Controller.filmId);
                preparedStatement.setString(3, "4 ряд 2 место");
                preparedStatement.executeUpdate();
                PreparedStatement preparedStatement1 = connection.prepareStatement("INSERT INTO tickets (usename,film,seats)" + "values(?,?,?)");
                preparedStatement1.setString(1, NameField.getText());
                if (Controller.film==null) {
                    preparedStatement1.setString(2, autorized.film);

                } else {
                    preparedStatement1.setString(2, Controller.film);
                }
                preparedStatement1.setString(3, "4 ряд 2 место");
                preparedStatement1.executeUpdate();
            }
            if ( FourthRow3Seat.getStyle().equals("-fx-text-fill: black"))   {

                DataBaseHandler dataBaseHandler = new DataBaseHandler();
                Connection connection = dataBaseHandler.getDbConnection();
                PreparedStatement preparedStatement = connection.prepareStatement("UPDATE zal SET available = ? WHERE filmId = ? AND seat = ? ");
                preparedStatement.setString(1, "занято");
                preparedStatement.setInt(2, Controller.filmId);
                preparedStatement.setString(3, "4 ряд 3 место");
                preparedStatement.executeUpdate();
                PreparedStatement preparedStatement1 = connection.prepareStatement("INSERT INTO tickets (usename,film,seats)" + "values(?,?,?)");
                preparedStatement1.setString(1, NameField.getText());
                if (Controller.film==null) {
                    preparedStatement1.setString(2, autorized.film);

                } else {
                    preparedStatement1.setString(2, Controller.film);
                }
                preparedStatement1.setString(3, "4 ряд 3 место");
                preparedStatement1.executeUpdate();
            }
            if ( FourthRow4Seat.getStyle().equals("-fx-text-fill: black"))   {

                DataBaseHandler dataBaseHandler = new DataBaseHandler();
                Connection connection = dataBaseHandler.getDbConnection();
                PreparedStatement preparedStatement = connection.prepareStatement("UPDATE zal SET available = ? WHERE filmId = ? AND seat = ? ");
                preparedStatement.setString(1, "занято");
                preparedStatement.setInt(2, Controller.filmId);
                preparedStatement.setString(3, "4 ряд 4 место");
                preparedStatement.executeUpdate();
                PreparedStatement preparedStatement1 = connection.prepareStatement("INSERT INTO tickets (usename,film,seats)" + "values(?,?,?)");
                preparedStatement1.setString(1, NameField.getText());
                if (Controller.film==null) {
                    preparedStatement1.setString(2, autorized.film);

                } else {
                    preparedStatement1.setString(2, Controller.film);
                }
                preparedStatement1.setString(3, "4 ряд 4 место");
                preparedStatement1.executeUpdate();
            }
            if ( FourthRow5Seat.getStyle().equals("-fx-text-fill: black"))   {

                DataBaseHandler dataBaseHandler = new DataBaseHandler();
                Connection connection = dataBaseHandler.getDbConnection();
                PreparedStatement preparedStatement = connection.prepareStatement("UPDATE zal SET available = ? WHERE filmId = ? AND seat = ? ");
                preparedStatement.setString(1, "занято");
                preparedStatement.setInt(2, Controller.filmId);
                preparedStatement.setString(3, "4 ряд 5 место");
                preparedStatement.executeUpdate();
                PreparedStatement preparedStatement1 = connection.prepareStatement("INSERT INTO tickets (usename,film,seats)" + "values(?,?,?)");
                preparedStatement1.setString(1, NameField.getText());
                if (Controller.film==null) {
                    preparedStatement1.setString(2, autorized.film);

                } else {
                    preparedStatement1.setString(2, Controller.film);
                }
                preparedStatement1.setString(3, "4 ряд 5 место");
                preparedStatement1.executeUpdate();
            }
            if ( FourthRow6Seat.getStyle().equals("-fx-text-fill: black"))   {

                DataBaseHandler dataBaseHandler = new DataBaseHandler();
                Connection connection = dataBaseHandler.getDbConnection();
                PreparedStatement preparedStatement = connection.prepareStatement("UPDATE zal SET available = ? WHERE filmId = ? AND seat = ? ");
                preparedStatement.setString(1, "занято");
                preparedStatement.setInt(2, Controller.filmId);
                preparedStatement.setString(3, "4 ряд 6 место");
                preparedStatement.executeUpdate();
                PreparedStatement preparedStatement1 = connection.prepareStatement("INSERT INTO tickets (usename,film,seats)" + "values(?,?,?)");
                preparedStatement1.setString(1, NameField.getText());
                if (Controller.film==null) {
                    preparedStatement1.setString(2, autorized.film);

                } else {
                    preparedStatement1.setString(2, Controller.film);
                }
                preparedStatement1.setString(3, "4 ряд 6 место");
                preparedStatement1.executeUpdate();
            }
            BuyButton.setDisable(true);
        }

    }

    public void SecondRow2Seat(MouseEvent mouseEvent) {
        SecondRow2Seat.setStyle("-fx-background-color: white");
        SecondRow2Seat.setStyle("-fx-text-fill: black");
SecondRow2Seat.setDisable(true);
        SelectedSeatsLabel.setText(SelectedSeatsLabel.getText()+" 2 ряд 2 место");
        PriceLabel.setText(PriceLabel.getText().split(" ")[0]
                +" "
                +PriceLabel.getText().split(" ")[1]
                +" "
                +(Integer.parseInt(PriceLabel.getText().split(" ")[2])+5));
    }

    public void refresh(MouseEvent mouseEvent) {
        refreshButton.getScene().getWindow().hide();
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
