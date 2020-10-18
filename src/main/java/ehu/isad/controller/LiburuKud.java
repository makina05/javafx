package ehu.isad.controller;

import ehu.isad.Liburuak;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.text.Text;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class LiburuKud implements Initializable {
    private Liburuak main;
    @FXML
    private ComboBox<String> comboboxLib;

    @FXML
    private Text txtLib;

    @FXML
    private Button btnLib;

    @FXML
    void onClick(ActionEvent event) throws IOException {
        String isbn = this.getIsbn(comboboxLib.getValue());
        main.xeheErakutsi(isbn);
    }
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        comboboxLib.getItems().add(0,"R for Data Sceince");
        comboboxLib.getItems().add(1,"Fluent Python");
        comboboxLib.getItems().add(2,"Data Algorithms");
    }
    public void setMainApp(Liburuak main) {
        this.main = main;
    }
    private String getIsbn(String lb){
        String isbn = "";
        if (lb == "R for Data Sceince"){
            isbn = "1491910399";
        }else if (lb == "Fluent Python"){
            isbn = "1491946008";
        }else if (lb == "Data Algorithms"){
            isbn = "9781491906187";
        }
        return isbn;
    }


}
