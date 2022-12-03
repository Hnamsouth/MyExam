package EX2.Connector;

import javafx.scene.image.Image;

import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.*;
import java.util.ArrayList;

public class Connector {
//    set private để ko thể
    private Connection cnn;
    private static Connector instance;
    String strmysql="jdbc:mysql://localhost:3306/eproject",user="root",pw="";
//     String strmysql="jdbc:mysql://pokabi.tech:3306/javaproject",user="south",pw="AFMhn17397";
    public Connector(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            this.cnn = DriverManager.getConnection(strmysql,user,pw);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static Connector getInstance(){
         return instance==null?new Connector():instance;
    }
    public Statement createSTM() throws SQLException {
        return cnn.createStatement();
    }

    public ResultSet queryRS(String sql){
        try {
            return createSTM().executeQuery(sql);
        }catch (Exception e) {
            return null;
        }
    }
    public int queryUD(String sql) throws SQLException {
        return createSTM().executeUpdate(sql);
    }
    public boolean queryBL(String sql) throws SQLException {
            return createSTM().execute(sql);
    }
    public  PreparedStatement CreatePPSTM(String sql) throws SQLException {
        return cnn.prepareStatement(sql);
    }








}
