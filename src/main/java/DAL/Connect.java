package DAL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect implements IConnect {

    private String databaseURL = "jdbc:mysql://ec2-52-30-211-3.eu-west-1.compute.amazonaws.com/s160601?user=s160601&password=ax1hqY3DBtPNqRcsvMGAy";
    private Connection connection;

    public void createConnection() throws SQLException {
        try {
            connection = DriverManager.getConnection(databaseURL);
        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        return connection;
    }

    public void closeConnection() throws SQLException {
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
