package ehu.isad;


import java.util.Arrays;

public class Details {
    String[] publishers;
    Integer number_of_pages;
    String title;

    @Override
    public String toString() {
        return "Details{" +
                "publishers=" + Arrays.toString(publishers) +
                ", number_of_pages=" + number_of_pages +
                ", title='" + title + '\'' +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getNumber_of_pages() {
        return String.valueOf(number_of_pages);
    }

    public String getPublishers() {
        return publishers[0];
    }
}