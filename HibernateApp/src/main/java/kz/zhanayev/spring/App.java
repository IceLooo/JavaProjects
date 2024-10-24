package kz.zhanayev.spring;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import kz.zhanayev.spring.model.Person;
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
                .addAnnotatedClass(Person.class);


        SessionFactory sessionFactory = sources.buildMetadata().
                buildSessionFactory();


        Session session = sessionFactory.getCurrentSession();

        try {
            session.beginTransaction();

//            Person person1 = new Person("Test1", 25);
//            Person person2 = new Person("Test2", 35);
//            Person person3 = new Person("Test3", 40);
//            Person person4 = new Person("Test4", 50);
//            Person person5 = new Person("Test5", 55);
//            session.save(person1);
//            session.save(person2);
//            session.save(person3);
//            session.save(person4);
//            session.save(person5);


            session.createQuery("delete from Person where age > 50").executeUpdate();



            session.getTransaction().commit();

        }finally {
            sessionFactory.close();
        }


    }
}
