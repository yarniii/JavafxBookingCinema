package sample;

import java.io.IOException;
import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

import com.mysql.cj.protocol.Resultset;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class SIgnUpScreen {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField usernameFieldSigUp;

    @FXML
    private PasswordField PasswordFieldSignUP;

    @FXML
    private Button SignUPButtonSignScreen;
    @FXML
    private Button backButtonSign;
    public static String userNameText,loginPassword;

    @FXML
    void initialize() {



        backButtonSign.setOnAction(actionEvent -> {
            backButtonSign.getScene().getWindow().hide();
            FXMLLoader loader=new FXMLLoader();
            loader.setLocation(getClass().getResource("/sample/sample.fxml"));
            try {
                loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }
            Parent root3=loader.getRoot();
            Stage stage3=new Stage();
            stage3.setResizable(false);
            stage3.setScene(new Scene(root3));
            stage3.show();
        });
        SignUPButtonSignScreen.setOnAction(event -> {
           userNameText=usernameFieldSigUp.getText();
          loginPassword=PasswordFieldSignUP.getText();

            if(!userNameText.equals("")&&!loginPassword.equals("")){
                loginUser(userNameText,loginPassword);


            }
            else {
                System.out.println("Login or password is empty");
            }

        });


    }



    private void loginUser(String userNameText, String loginPassword) {
        DataBaseHandler dbHandler=new DataBaseHandler();
        User user=new User();
        user.setUserName(userNameText);
        user.setPassword(loginPassword);
        ResultSet result=dbHandler.getUser(user);

        int counter=0;
        try {


            while (result.next()) {
                counter++;
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
       if (counter>=1){
            System.out.println("Success");
            SignUPButtonSignScreen.getScene().getWindow().hide();
           FXMLLoader loader=new FXMLLoader();
           loader.setLocation(getClass().getResource("/sample/autorized.fxml"));
           try {
               loader.load();
           } catch (IOException e) {
               e.printStackTrace();
           }
           Parent root4=loader.getRoot();
           Stage stage4=new Stage();
           stage4.setResizable(false);
           stage4.setScene(new Scene(root4));
           stage4.show();
        }
    }
}
