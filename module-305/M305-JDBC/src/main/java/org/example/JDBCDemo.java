package org.example;
import java.sql.*;
import java.util.Scanner;

public class JDBCDemo {
    public static void main(String[] args) throws ClassNotFoundException {
        String dburl = "jdbc:mysql://localhost:3306/classic_models";
        String user = "root";
        String password = "SQLCC33..";
        System.out.println("-------- MySQL JDBC Connection Demo ------------");

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the first name of the employee you want to search for:  ");
        String input = scanner.nextLine();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(dburl, user, password);
            String SelectSQL = "Select * FROM employees where firstname = ? ";

            //Statement stmt = connection.createStatement();
            PreparedStatement stmt = connection.prepareStatement(SelectSQL);
            stmt.setString(1, input);
//            stmt.setString(2, lastnameInput);

            ResultSet result =  stmt.executeQuery();
            while(result.next())
            {
                String EmployeeID  = result.getString("id");
                String fname = result.getString("firstname");
                String lname  = result.getString("lastname");
                String email  = result.getString("email");
                String jtitle  = result.getString("job_title");
                System.out.println(EmployeeID +" | " + fname + "|"+ lname + "|"+ email + "|"+ jtitle );
            }
            connection.close();
        }
        catch(SQLException e) {
            e.printStackTrace();
        }
    }
}


