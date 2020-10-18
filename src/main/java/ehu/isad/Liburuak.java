package ehu.isad;

import ehu.isad.controller.LiburuKud;
import ehu.isad.controller.XehetasunakKud;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

import static javafx.application.Application.launch;

public class Liburuak extends Application {
    private Parent kautotuUI;
    private Parent mainUI;

    private Stage stage;
    private Scene scene1;
    private Scene scene2;

    private LiburuKud kautotuKud;
    private XehetasunakKud mainKud;

    private void pantailakKargatu() throws IOException {

        FXMLLoader loaderKautotu = new FXMLLoader(getClass().getResource("/Liburuak.fxml"));
        kautotuUI = (Parent) loaderKautotu.load();
        kautotuKud = loaderKautotu.getController();
        kautotuKud.setMainApp(this);
        scene1 = new Scene(kautotuUI);

        FXMLLoader loaderMain = new FXMLLoader(getClass().getResource("/Xehetasuank.fxml"));
        mainUI = (Parent) loaderMain.load();
        mainKud = loaderMain.getController();
        mainKud.setMainApp(this);
        scene2 = new Scene(mainUI);
    }

    public void start(Stage primaryStage) throws Exception {

        stage = primaryStage;
        pantailakKargatu();

        stage.setTitle("OpenLib aplikazioa");
        stage.setScene(scene1);
        stage.show();
    }


    public void mainErakutsi() {
        stage.setScene(new Scene(kautotuUI));
        stage.show();
    }

    public void xeheErakutsi(String isbn) throws IOException {
        Book lib = new Book();
        lib = lib.getBook(isbn);
        mainKud.dat(lib);
        stage.setScene(scene2);
        stage.show();
    }
}
