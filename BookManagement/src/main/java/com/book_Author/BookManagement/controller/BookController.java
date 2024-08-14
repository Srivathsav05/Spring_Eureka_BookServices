package com.book_Author.BookManagement.controller;

import com.book_Author.BookManagement.client.AuthorClient;
import com.book_Author.BookManagement.dto.BookDto;
import com.book_Author.BookManagement.entity.Author;
import com.book_Author.BookManagement.entity.Book;
import com.book_Author.BookManagement.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
@RestController
public class BookController {
    private final BookRepository bookRepository;
    private final AuthorClient authorClient;

    public BookController(BookRepository bookRepository, AuthorClient authorClient) {
        this.bookRepository = bookRepository;
        this.authorClient = authorClient;
    }

    @GetMapping("/books")
    public List<BookDto> getAllBooks() {
        List<Book> books = bookRepository.findAll();
        List<BookDto> bookDtos = new ArrayList<>();
        for(Book book : books)
        {
            BookDto bookDto = new BookDto(book.getId(),book.getTitle(),authorClient.getAuthorById(book.getId()));
            bookDtos.add(bookDto);
        }

        return bookDtos;
    }

    @GetMapping("/books/{id}")
    public BookDto getBookById(@PathVariable Long id) {
//        Author author= authorClient.getAuthorById(id);
        Book b=bookRepository.findById(id);
        BookDto dto=new BookDto(b.getId(),b.getTitle(), authorClient.getAuthorById(b.getId()));
        return dto;
    }
}
