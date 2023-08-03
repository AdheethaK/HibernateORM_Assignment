import entity.Book;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.FactoryConfiguration;

public class Main_PartOnE {
    public static void main(String[] args) {
        Session session= FactoryConfiguration.getInstance().getSession();
        Transaction transaction= session.beginTransaction();
        /*
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

        //retrieve a book by its ID from the database
        Book book = null;
        book = (Book) session.get(Book.class, "9780545069670");
        System.out.println(book);

        //updating an existing book
        Book book = new Book();
        book.setISBN("9780545069670");
        session.update(book);

        Book book1 = null;
        book1 = (Book) session.get(Book.class, "9780545069670");
        System.out.println(book1);

         */

        //deleting an existing book
        Book book = new Book();
        book.setISBN("9780545069670");
        session.delete(book);

        Book book1 = null;
        book1 = (Book) session.get(Book.class, "9780545069670");
        System.out.println(book1);
    }
}
