import entity.Author;
import entity.Book;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.FactoryConfiguration;

import java.util.ArrayList;

public class Main_OneToMany {
    public static void main(String[] args) {
        Session session= FactoryConfiguration.getInstance().getSession();
        Transaction transaction= session.beginTransaction();

        Author author = new Author();
        author.setId("A001");
        author.setName("J.K. Rowling");

        ArrayList<Book> books=new ArrayList<>();

        Book book1 = new Book();
        book1.setISBN("978-1-4088-5565-2");
        book1.setTitle("Harry Potter and the Philosopher’s Stone");
        book1.setPrice(2750.00);
        books.add(book1);

        Book book2 = new Book();
        book2.setISBN("978-1-4088-5568-3");
        book2.setTitle("Harry Potter and the Goblet of Fire");
        book2.setPrice(3995.00);
        books.add(book2);

        Book book3 = new Book();
        book3.setISBN("978-1-4088-5567-6");
        book3.setTitle("Harry Potter and the Prisoner of Azkaban");
        book3.setPrice(2995.00);
        books.add(book3);

        Book book4 = new Book();
        book4.setISBN("9780545010221");
        book4.setTitle("Harry Potter and the Deathly Hallows");
        book4.setPrice(3995.00);
        books.add(book4);

        for (Book book: books){
            book.setAuthor(author);
        }
        author.setBooks(books);

        session.persist(author);
        for (Book book: books){
            session.persist(book);
        }

        transaction.commit();
        session.close();
    }
}
