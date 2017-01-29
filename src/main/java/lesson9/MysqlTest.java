package lesson9;

import java.sql.*;

/**
 * Created by asv on 28.01.17.
 */
public class MysqlTest {
    public static final String LOGIN = "root";
    public static final String PASSWORD = "150";
    private static String MYSQL_HOST = "jdbc:mysql://localhost:3306/jpa";

    public static void main(String[] args) {

        try {
            Connection connection = DriverManager.getConnection(MYSQL_HOST, LOGIN, PASSWORD);

            Statement stmt = connection.createStatement();

            String insertSql =  "INSERT INTO jpa.customer (first_name, last_name) " +
                                "VALUES ('First Name', 'Last Name');";

            String selectSql = "SELECT * FROM jpa.customer;";

            stmt.executeUpdate(insertSql);

            ResultSet rs = stmt.executeQuery(selectSql);

            while(rs.next()){
                //Retrieve by column name
                int id  = rs.getInt("id");
                String first = rs.getString("first_name");
                String last = rs.getString("last_name");

                //Display values
                System.out.print("ID: " + id);
                System.out.print(", First: " + first);
                System.out.println(", Last: " + last);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
