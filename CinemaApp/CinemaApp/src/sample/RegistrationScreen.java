package sample;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class RegistrationScreen {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField EmailFieldRegistrationScreen;

    @FXML
    private PasswordField PasswordFieldRegistationScreen;

    @FXML
    private Button RegistationButtonRegistrationScreen;

    @FXML
    private TextField UsernameFieldRegistrationScreen;

    @FXML
    private PasswordField ConfirmPasswordFieldRegistationScreen;

    @FXML
    private Button backButtonRegistration;

    @FXML
    private Label invalid;

    @FXML
    void initialize() {
        backButtonRegistration.setOnAction(actionEvent -> {
            backButtonRegistration.getScene().getWindow().hide();
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/sample/sample.fxml"));
            try {
                loader.load();
            } catch (IOException e) {

            }
            Parent root4 = loader.getRoot();
            Stage stage4 = new Stage();
            stage4.setResizable(false);
            stage4.setScene(new Scene(root4));

            stage4.show();

        });

    }

    private void RegisterNewUser() {
        DataBaseHandler dbHandler=new DataBaseHandler();

        String email=EmailFieldRegistrationScreen.getText();
        String userName=UsernameFieldRegistrationScreen.getText();
        String password=PasswordFieldRegistationScreen.getText();


        User user =new User(email,userName,password);

        dbHandler.signUpUser(user);
    }

    public void register(MouseEvent mouseEvent) {
        if ((UsernameFieldRegistrationScreen.getText().length()>=7)&&
                (Objects.equals(PasswordFieldRegistationScreen.getText(), ConfirmPasswordFieldRegistationScreen.getText()))
                &&(EmailFieldRegistrationScreen.getText().contains("@"))) {

            RegisterNewUser();
            RegistationButtonRegistrationScreen.getScene().getWindow().hide();
            FXMLLoader loader1 = new FXMLLoader();
            loader1.setLocation(getClass().getResource("/sample/SignUpPage.fxml"));
            try {
                loader1.load();
            } catch (IOException e) {

            }
            Parent root5 = loader1.getRoot();
            Stage stage5 = new Stage();
            stage5.setResizable(false);
            stage5.setScene(new Scene(root5));

            stage5.show();


        }else{
            invalid.setText("Invalid Values");
        }
    }
}

