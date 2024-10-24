package kz.zhanayev.spring;
import kz.zhanayev.spring.model.Filmmaker;
import kz.zhanayev.spring.model.Movie;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                .applySettings(new Configuration().getProperties()) // Загружаем конфигурацию из файла
                .build();

        MetadataSources sources = new MetadataSources(registry)
                .addAnnotatedClass(Filmmaker.class).addAnnotatedClass(Movie.class);


        SessionFactory sessionFactory = sources.buildMetadata().
                buildSessionFactory();


        Session session = sessionFactory.getCurrentSession();



        try {

            session.beginTransaction();


//            Filmmaker filmmaker = session.get(Filmmaker.class, 1);
//            System.out.println(filmmaker);
//
//
//            List<Movie> movies = filmmaker.getMovies();
//
//            System.out.println(movies);

//            Movie movie = session.get(Movie.class, 1);
//            System.out.println(movie);
//
//            Filmmaker filmmaker = movie.getFilmmaker();
//            System.out.println(filmmaker);

            Filmmaker filmmaker = session.get(Filmmaker.class, 4);
            Movie newMovie = new Movie("Kasyta",1989, filmmaker);
            filmmaker.getMovies().add(newMovie);
            session.save(newMovie);


            session.getTransaction().commit();


        }finally {
            sessionFactory.close();
        }

    }
}
