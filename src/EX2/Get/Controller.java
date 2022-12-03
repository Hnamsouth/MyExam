package EX2.Get;

import EX2.Connector.Connector;
import EX2.EntityViewStyle.Book;
import EX2.EntityViewStyle.SetView;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;

import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.Scanner;

import static EX2.Show.Controller.Books;


public class Controller implements Initializable {
    public TextField txtBookName,txtBookID,txtPrice,txtAuthor;
    public ObservableList<Book> listBook= FXCollections.observableArrayList();

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void Add(ActionEvent actionEvent) {
        if(!txtBookID.getText().isEmpty() || !txtBookName.getText().isEmpty() ||!txtAuthor.getText().isEmpty() || txtPrice.getText().matches("[0-9]*[0-9].[0-9]")){
            listBook.add(new Book(
                    txtBookID.getText(),
                    txtBookName.getText(),
                    txtAuthor.getText(),
                    Double.valueOf(txtPrice.getText())
            ));
        }else{
            Alert al= new Alert(Alert.AlertType.WARNING);
            al.setContentText("Missing data");
            al.show();
        }

    }
    String data="";
    Connector cnn;
    public void Save(ActionEvent actionEvent) throws IOException,SQLException {
        cnn= Connector.getInstance();
        listBook.forEach(e->{
            String sql=String.format("INSERT INTO `book`(`id`, `name`, `author`, `price`) VALUES ('%s','%s','%s',%f)",e.getID(),e.getName(),e.getAuthor(),e.getPrice());
            try {
                if(cnn.queryUD(sql)!=1){
                    throw new RuntimeException("insert book failed");
                }
            } catch (SQLException ex) {throw new RuntimeException(ex); }
        });
    }

    public void Show(ActionEvent actionEvent) throws IOException, SQLException {
        cnn= Connector.getInstance();
        String sql= "select * from Book";
        ResultSet rs=cnn.queryRS(sql);
        while (rs.next()) {
            Books.add(new Book(
                    rs.getString("id"),
                    rs.getString("name"),
                    rs.getString("author"),
                    rs.getDouble("price")
            ));
        }
        SetView.setViewShow();
    }



}
