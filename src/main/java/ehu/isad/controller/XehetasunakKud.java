package ehu.isad.controller;

import ehu.isad.Book;
import ehu.isad.Liburuak;
import ehu.isad.utils.Sarea;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

import java.io.IOException;

public class XehetasunakKud {
    private Liburuak main;

    public void setMainApp(Liburuak main) {
        this.main = main;
    }

    @FXML
    private Button btnAtzera;

    @FXML
    private Text txt1;

    @FXML
    private Text txt2;

    @FXML
    private Text txt3;

    @FXML
    private ImageView imageViewArgazki;

    @FXML
    void onClick(ActionEvent event) {
        main.mainErakutsi();
    }

    public void dat(Book lib) throws IOException {
        txt1.setText(lib.getDetails().getTitle());
        txt2.setText(lib.getDetails().getPublishers());
        txt3.setText(lib.getDetails().getNumber_of_pages());
        imageViewArgazki.setImage(new Sarea().createImage(lib.getThumbnail_url()));
    }
}
