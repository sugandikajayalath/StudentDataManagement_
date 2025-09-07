//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.sql.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        String url ="jdbc:mysql://localhost:3306/sdm";
        String user ="root";
        String password="root" ;

        String query ="SELECT * FROM students";

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection=DriverManager.getConnection(url,user,password);
            Statement statement =connection.createStatement();
            statement.executeUpdate(query);




        }catch (Exception e){
            System.out.println(e);

        }


    }
}