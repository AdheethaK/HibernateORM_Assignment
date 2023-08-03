package util;

import entity.Book;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FactoryConfiguration {
    private static util.FactoryConfiguration factoryConfiguration;
    private SessionFactory sessionFactory;

    public FactoryConfiguration() {
        Configuration configuration=new Configuration().configure()
                .addAnnotatedClass(Book.class);

        sessionFactory=configuration.buildSessionFactory();
    }
    public static util.FactoryConfiguration getInstance(){
        return (factoryConfiguration==null) ?
                factoryConfiguration=new util.FactoryConfiguration():factoryConfiguration;
    }
    public Session getSession(){
        return sessionFactory.openSession();
    }
}
