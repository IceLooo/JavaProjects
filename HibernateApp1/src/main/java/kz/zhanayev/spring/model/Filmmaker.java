package kz.zhanayev.spring.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Filmmaker")
public class Filmmaker {

    @Id
    @Column(name = "filmmaker_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int filmmakerId;


    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private String age;

    @OneToMany(mappedBy = "filmmaker")
    private List<Movie> movies;


    public Filmmaker() {}

    public Filmmaker(int filmmakerId, String name, String age) {
        this.filmmakerId = filmmakerId;
        this.name = name;
        this.age = age;
    }

    public int getFilmmakerId() {
        return filmmakerId;
    }

    public void setFilmmakerId(int filmmakerId) {
        this.filmmakerId = filmmakerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }



    @Override
    public String toString() {
        return "Filmmaker{" +
                "id=" + filmmakerId +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
