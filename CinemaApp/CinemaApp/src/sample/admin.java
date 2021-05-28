package sample;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

public class admin {
private final ObservableList ticks= FXCollections.observableArrayList();
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableView<Tickets> tickets;

    @FXML
    private TableColumn<Tickets, String> username;

    @FXML
    private TableColumn<Tickets, String> film;

    @FXML
    private TableColumn<Tickets, String> seat;

    @FXML
    private Button cancel;

    @FXML
    private Button ButtonTheatres;

    @FXML
    private Button ButtonMovies;
    private ObservableList<Tickets> selectedTickets;

    @FXML
    void cancel(MouseEvent event) throws SQLException, ClassNotFoundException {
        for (Tickets res:selectedTickets){
DataBaseHandler dataBaseHandler=new DataBaseHandler();
PreparedStatement preparedStatement=dataBaseHandler.getDbConnection().prepareStatement("DELETE FROM tickets WHERE username = ?, film = ?, seats = ?");
preparedStatement.setString(1,res.getUsername());
preparedStatement.setString(2, res.getFilm());
preparedStatement.setString(3,res.getSeat());
preparedStatement.executeUpdate();
PreparedStatement preparedStatement1=dataBaseHandler.getDbConnection().prepareStatement("SELECT * FROM films WHERE film = ?");
preparedStatement1.setString(1,res.getFilm());
ResultSet resultSet=preparedStatement1.executeQuery();
while (resultSet.next()){
    PreparedStatement preparedStatement2=dataBaseHandler.getDbConnection().prepareStatement("UPDATE zal SET available=занято WHERE filmId = ? AND seat = ? ");
    preparedStatement2.setInt(1,resultSet.getInt("idFilm"));
    preparedStatement2.setString(2, res.getSeat());
    preparedStatement2.executeUpdate();
}
        }
        ArrayList<Tickets> rows=new ArrayList<>(selectedTickets);
        rows.forEach(row->tickets.getItems().remove(row));
    }

    @FXML
    void initialize() {


    }
    void addtickets() throws SQLException, ClassNotFoundException {
        DataBaseHandler dataBaseHandler=new DataBaseHandler();
        Connection connection=dataBaseHandler.getDbConnection();
        PreparedStatement preparedStatement=connection.prepareStatement("SELECT * FROM tickets");
        ResultSet resultSet=preparedStatement.executeQuery();
        while (resultSet.next()){
            ticks.add(new Tickets(resultSet.getString("username"),resultSet.getString("film"),resultSet.getString("seats")));

        }

    }
    void getTickets(){
        username.setCellValueFactory(new PropertyValueFactory<Tickets, String>("username"));
        film.setCellValueFactory(new PropertyValueFactory<Tickets, String>("film"));
        seat.setCellValueFactory(new PropertyValueFactory<Tickets, String>("seats"));

        tickets.setItems(ticks);
        TableView.TableViewSelectionModel<Tickets> selectionModel=tickets.getSelectionModel();
        selectionModel.setSelectionMode(SelectionMode.MULTIPLE);
         selectedTickets = selectionModel.getSelectedItems();

    }
}
