package hz.simplejee.unittest.dbunit.hello;

import org.dbunit.DatabaseUnitException;
import org.dbunit.database.DatabaseConnection;
import org.dbunit.database.IDatabaseConnection;
import org.dbunit.database.QueryDataSet;
import org.dbunit.dataset.DataSetException;
import org.dbunit.dataset.xml.FlatXmlDataSet;
import org.dbunit.operation.DatabaseOperation;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by wanghui on 22/12/2016.
 */

public class MyTest {
    @Before
    public void setUp() {
        IDatabaseConnection conn = null;
        try {
            Class.forName("org.gjt.mm.mysql.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/demo?useSSL=false", "root", "");
            conn = new DatabaseConnection(connection);
            QueryDataSet queryDataSet = new QueryDataSet(conn);
            queryDataSet.addTable("user");
            File file = File.createTempFile("user_bak", ".xml");
            FlatXmlDataSet.write(queryDataSet, new FileOutputStream(file));

            FlatXmlDataSet dataSet = new FlatXmlDataSet(MyTest.class.getResourceAsStream("user_data.xml"));
            DatabaseOperation.CLEAN_INSERT.execute(conn, dataSet);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (DataSetException e) {
            e.printStackTrace();
        } catch (DatabaseUnitException e) {
            e.printStackTrace();
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Test
    public void test(){

    }
}
