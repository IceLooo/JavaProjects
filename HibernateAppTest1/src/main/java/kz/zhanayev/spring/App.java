package kz.zhanayev.spring;

import kz.zhanayev.spring.model.Passport;
import kz.zhanayev.spring.model.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

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
                .addAnnotatedClass(Person.class).addAnnotatedClass(Passport.class);


        SessionFactory sessionFactory = sources.buildMetadata().
                buildSessionFactory();


        Session session = sessionFactory.getCurrentSession();


        try {
            session.beginTransaction();


            Person person = session.get(Person.class, 1);
            session.remove(person);



            session.getTransaction().commit();


        }finally {
            sessionFactory.close();
        }

    }
}
