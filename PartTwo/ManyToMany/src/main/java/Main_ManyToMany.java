import entity.Author;
import entity.Book;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.FactoryConfiguration;

import java.util.ArrayList;
import java.util.List;

public class Main_ManyToMany {
    public static void main(String[] args) {
        Session session= FactoryConfiguration.getInstance().getSession();
        Transaction transaction= session.beginTransaction();

        Book book_1=new Book();
        book_1.setISBN("978-1-4088-5568-3");
        book_1.setTitle("Java Persistence With Hibernate");
        book_1.setPrice(2500.00);
        List<Author> authors_book_1=new ArrayList<>();

        Book book_2=new Book();
        book_2.setISBN("978-1-4088-5565-2");
        book_2.setTitle("The Modernized Nimzovich Defense");
        book_2.setPrice(3000.00);
        List<Author> authors_book_2=new ArrayList<>();

        Author author_1=new Author();
        author_1.setId("A001");
        author_1.setName("Christian Bauer");
        List<Book> books_author_1=new ArrayList<>();

        Author author_2=new Author();
        author_2.setId("A002");
        author_2.setName("Gavin King");
        List<Book> books_author_2=new ArrayList<>();

        //add to books_author_1
        books_author_1.add(book_1);
        books_author_1.add(book_2);
        author_1.setBooks(books_author_1);

        //add to books_author_2
        books_author_2.add(book_1);
        author_2.setBooks(books_author_2);

        //add to authors_book_1
        authors_book_1.add(author_1);
        authors_book_1.add(author_2);
        book_1.setAuthors(authors_book_1);

        //add to authors_book_2
        authors_book_2.add(author_1);
        book_2.setAuthors(authors_book_2);

        session.persist(book_1);
        session.persist(book_2);
        session.persist(author_1);
        session.persist(author_2);

        transaction.commit();
        session.close();
    }
}
