import entity.Author;
import entity.Book;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.FactoryConfiguration;

public class Main_PartTwo {
    public static void main(String[] args) {
        //One-to-One
        Author author=new Author();
        author.setId("A001");
        author.setName("J.K. Rowling");

        Book book = new Book();
        book.setISBN("978-1-4088-5565-2");
        book.setTitle("Harry Potter and the Philosopher’s Stone");
        book.setPrice(2750.00);
        book.setAuthor(author);

        Session session= FactoryConfiguration.getInstance().getSession();
        Transaction transaction= session.beginTransaction();

        session.persist(author);
        session.persist(book);

        transaction.commit();
        session.close();
    }
}
