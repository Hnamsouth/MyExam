package EX2.Show;

import EX2.EntityViewStyle.Book;
import EX2.EntityViewStyle.SetView;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.GridPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.stream.Collectors;

public class Controller  implements Initializable{


    public TableColumn<Book,String> colID,colName,colAuthor;
    public TableColumn<Book,Double>  colPrice;
    public TableView<Book> tableV;
    public  static  ObservableList<Book> Books= FXCollections.observableArrayList();

    public void BackGet() throws IOException {
        SetView.setViewGet();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        colID.setCellValueFactory(new PropertyValueFactory<>("ID"));
        colName.setCellValueFactory(new PropertyValueFactory<>("Name"));
        colAuthor.setCellValueFactory(new PropertyValueFactory<>("Author"));
        colPrice.setCellValueFactory(new PropertyValueFactory<>("Price"));

        tableV.setItems(Books);
    }
}
