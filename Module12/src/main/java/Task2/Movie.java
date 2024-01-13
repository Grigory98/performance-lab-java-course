package Task2;

import java.util.Date;

public class Movie {
    public int id;

    public String title;

    public String genre;

    public Date release;

    public int director;

    public Movie(int id, String title, String genre, Date release, int director) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.release = release;
        this.director = director;
    }
}
