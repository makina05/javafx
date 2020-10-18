package ehu.isad;

import ehu.isad.utils.Sarea;
import com.google.gson.Gson;
import javafx.scene.control.Dialog;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class Book {
    String isbn;
    String title;

    String info_url;
    String bib_key;
    String preview_url;
    String thumbnail_url;
    Details details;

    public Details getDetails(){
        return details;
    }

    public String getThumbnail_url() {
        return thumbnail_url;
    }

    public Book(){}
    public Book(String isbn, String title) {
        this.isbn = isbn;
        this.title = title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn='" + isbn + '\'' +
                ", title='" + title + '\'' +
                ", info_url='" + info_url + '\'' +
                ", bib_key='" + bib_key + '\'' +
                ", preview_url='" + preview_url + '\'' +
                ", thumbnail_url='" + thumbnail_url + '\'' +
                ", details=" + details +
                '}';
    }


    public Book getBook(String isbn) throws IOException {

        Sarea sarea = new Sarea();
        String line = sarea.URLReader(isbn);

        Gson gson = new Gson();
        Book book = gson.fromJson(line, Book.class);
        book.isbn = isbn;
        return book;
    }

}