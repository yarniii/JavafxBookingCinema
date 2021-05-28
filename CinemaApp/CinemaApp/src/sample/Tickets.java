package sample;

public class Tickets {
    private String username;
    private String film;
    private String seat;

    public Tickets(String username, String film, String seat) {
        this.username = username;
        this.film = film;
        this.seat = seat;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFilm() {
        return film;
    }

    public void setFilm(String film) {
        this.film = film;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }
}
