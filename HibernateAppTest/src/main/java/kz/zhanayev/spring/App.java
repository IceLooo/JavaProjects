package kz.zhanayev.spring;
import kz.zhanayev.spring.model.Item;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import kz.zhanayev.spring.model.Person;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.Collections;
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
                .addAnnotatedClass(Person.class).addAnnotatedClass(Item.class);


        SessionFactory sessionFactory = sources.buildMetadata().
                buildSessionFactory();


        Session session = sessionFactory.getCurrentSession();

        try {

             session.beginTransaction();

//            Person person = new Person("Riko", 20);
//            Item newItem = new Item("MacBook Pro 13", person);
//
//            person.setItems(new ArrayList<>(Collections.singletonList(newItem)));
//
//            session.save(person);
//            session.save(newItem);
//
//            session.getTransaction().commit();


//            Person person = session.get(Person.class, 3);
//
//            List<Item> items = person.getItems();
//            for (Item item : items)
//                session.remove(item);
//
//
//            person.getItems().clear();
//////////////////////////////////////////////////////////////////////////////////////
//            Person person = session.get(Person.class, 3);
//            Item item = session.get(Item.class, 1);
//
//            item.setOwner(person);
//            person.getItems().add(item);
//////////////////////////////////////////////////////////////////////////////////////


//            session.remove(person);
//            person.getItems().forEach(i -> i.setOwner(null));






            Person person = new Person("Test cascadind", 40);

            person.addItem(new Item("Item 1"));
            person.addItem(new Item("Item 2"));
            person.addItem(new Item("Item 3"));


            session.save(person);






            session.getTransaction().commit();


        }finally {
            sessionFactory.close();
        }


    }
}
