package Bank.management.system;



import java.sql.*;

public class Con {
    Connection connection;
    Statement statement;
    public Con(){
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankSystem", "root", "rachna@2021");
            statement = connection.createStatement();

        }

        catch (Exception e){
            e.printStackTrace();

        }
    }

}
