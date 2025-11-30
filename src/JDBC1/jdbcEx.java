package JDBC1;

import java.sql.*;

public class jdbcEx {


    //TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

        public static void main(String[] args) {
            String url = "jdbc:mysql://localhost:3306/userdb";
            String un = "root";
            String pwd = "vaishu";
            Connection connection;
            try {
                connection = DriverManager.getConnection(url, un, pwd);

                Statement statement = connection.createStatement();
//            int executed = statement.executeUpdate("INSERT INTO user VALUES(2,'ABC')");
//            ResultSet resultSet = statement.getResultSet();

                ResultSet resultSet1 = statement.executeQuery("SELECT * FROM user");
                ResultSet resultSet = statement.getResultSet();

                while(resultSet.next()){
                    System.out.println("id="+resultSet.getInt(1)+" "+"name="+resultSet.getString(2));
                }
                // System.out.println(resultSet);

                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }




        }
    }

