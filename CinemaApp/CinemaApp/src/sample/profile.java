package sample;

import java.io.IOException;
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
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class profile {
    static public String user;
    public ListView<String> TicketList;
    public Button backButton;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label emailLabel;

    @FXML
    private Label UserNameLabel;

    @FXML
    void initialize() throws SQLException, ClassNotFoundException {
        UserNameLabel.setText(UserNameLabel.getText() + " " + SIgnUpScreen.userNameText
        );

        DataBaseHandler dataBaseHandler = new DataBaseHandler();
        PreparedStatement preparedStatement = dataBaseHandler.getDbConnection().prepareStatement("SELECT * FROM USERS WHERE username = ?");
        preparedStatement.setString(1, SIgnUpScreen.userNameText);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            emailLabel.setText(emailLabel.getText() + " " + resultSet.getString("email"));
        }
setTicketList();
    }

    void setTicketList() throws SQLException, ClassNotFoundException {
        DataBaseHandler dataBaseHandler = new DataBaseHandler();
        Connection connection = dataBaseHandler.getDbConnection();
        PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM tickets Where usename = ?");
        preparedStatement.setString(1, SIgnUpScreen.userNameText);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            String film = resultSet.getString("film");
            String tickets = resultSet.getString("seats");
            TicketList.getItems().add(film + " " + tickets);
        }
    }

    public void back(MouseEvent mouseEvent) {
        backButton.getScene().getWindow().hide();
        FXMLLoader loader=new FXMLLoader();
        loader.setLocation(getClass().getResource("/sample/autorized.fxml"));
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

