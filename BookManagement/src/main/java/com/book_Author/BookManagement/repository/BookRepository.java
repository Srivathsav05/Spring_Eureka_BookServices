package com.book_Author.BookManagement.repository;

import com.book_Author.BookManagement.entity.Book;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class BookRepository {
    List<Book> books = new ArrayList<>();
    public BookRepository() {
        books.add(new Book(1L, "1984", 1L));
        books.add(new Book(2L, "Harry Potter", 2L));
        books.add(new Book(3L, "To Kill a Mockingbird", 3L));
        books.add(new Book(4L, "The Lord of the Rings", 4L));
        books.add(new Book(5L, "Pride and Prejudice", 5L));
    }

    public List<Book> findAll() {
        return this.books;
    }

    public Book findById(Long id) {
        for(Book book : books)
        {
            if(book.getId().equals(id))
            {
                return book;
            }
        }
        return null;
    }
}
