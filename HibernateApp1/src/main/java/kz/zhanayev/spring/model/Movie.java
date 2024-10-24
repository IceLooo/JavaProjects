package kz.zhanayev.spring.model;

import jakarta.persistence.*;


@Entity
@Table(name = "Movie")

public class Movie {

    @Id
    @Column(name = "movie_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int movieId;

    @Column(name = "name")
    private String movieName;

    @Column(name = "year_of_production")
    private int yearOfProduction;


    @ManyToOne
    @JoinColumn(name = "filmmaker_id", referencedColumnName = "filmmaker_id")
    private Filmmaker filmmaker;



    public Movie() {}

    public Movie(String movieName, int yearOfProduction, Filmmaker filmmaker) {
        this.movieName = movieName;
        this.yearOfProduction = yearOfProduction;
        this.filmmaker = filmmaker;
    }

    public int getMovieIdId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + movieId +
                ", movieName='" + movieName + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }

    public Filmmaker getFilmmaker() {
        return filmmaker;
    }

    public void setFilmmaker(Filmmaker filmmaker) {
        this.filmmaker = filmmaker;
    }
}
