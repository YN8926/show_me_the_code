package hz.simplejee.jdbc;

import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.sql.*;
import java.util.Properties;

/**
 * Created by 辉辉大侠 on 25/10/2016.
 */
public class HelloMain {
    private String url;
    private String driverClass;
    private String username;
    private String password;

    @Before
    public void setUp() throws IOException {
        Properties props = new Properties();
        props.load(HelloMain.class.getResourceAsStream("/application.properties"));
        url = props.getProperty("jdbc.url");
        driverClass = props.getProperty("jdbc.driverClass");
        username = props.getProperty("jdbc.username");
        password = props.getProperty("jdbc.password");

    }

    @Test
    public void testGetMySQLVersion() throws SQLException, ClassNotFoundException {
        Class.forName(driverClass);
        Connection conn = DriverManager.getConnection(url, username, password);
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("select version()");
        while (rs.next()) {
            System.out.println(rs.getString(1));
        }
        rs.close();
        stmt.close();
        conn.close();
    }
}
