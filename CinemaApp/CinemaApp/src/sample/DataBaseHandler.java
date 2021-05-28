package sample;

import java.sql.*;
import java.sql.ResultSet;

public class DataBaseHandler extends Configs{
    Connection dbConnection;
    public Connection getDbConnection()
            throws ClassNotFoundException, SQLException{
String connectionString="jdbc:mysql://"+dbHost+":"+dbPort+"/"+dbName;
Class.forName("com.mysql.cj.jdbc.Driver");
dbConnection=DriverManager.getConnection(connectionString, dbUser,dbPass);
return dbConnection;
    }
    public void signUpUser(User user){
        String insert="INSERT INTO "+Const.USER_TABLE+"("+Const.USER_EMAIL+","+Const.USER_USERNAME+","+Const.USER_PASSWORD+")"+
                "VALUES(?,?,?)";
        try {


        PreparedStatement prSt=getDbConnection().prepareStatement(insert);
        prSt.setString(1,user.getEmail());
        prSt.setString(2,user.getUserName());
        prSt.setString(3,user.getPassword());

            prSt.executeUpdate();
        } catch (SQLException | ClassNotFoundException throwable) {
            System.out.println("Данный пользователь уже зарегистрирован");
        }


    }
    public ResultSet getUser(User user){
        ResultSet resultSet=null;

        String select="SELECT * FROM "+Const.USER_TABLE+" Where "+Const.USER_USERNAME+" =? AND "+ Const.USER_PASSWORD+" =?";
        try {


            PreparedStatement prSt=getDbConnection().prepareStatement(select);

            prSt.setString(1,user.getUserName());
            prSt.setString(2,user.getPassword());

           resultSet= prSt.executeQuery();
        } catch (SQLException | ClassNotFoundException throwable) {
            throwable.printStackTrace();
        }
        return resultSet;
    }
}
