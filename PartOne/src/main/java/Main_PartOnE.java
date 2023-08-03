import entity.Book;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.FactoryConfiguration;

public class Main_PartOnE {
    public static void main(String[] args) {
        Session session= FactoryConfiguration.getInstance().getSession();
        Transaction transaction= session.beginTransaction();

        //1. create a new book
        Book book = new Book();
        book.setISBN("9780545069670");
        book.setAuthno("J. K. Rowling");
        book.setTitle("Harry Potter and the Philosopher's Stone");
        book.setEdition("1");
        book.setCategory("fantasy literature");
        book.setPrice(2750.00);

        session.persist(book);
        transaction.commit();
        session.close();
    }
}
