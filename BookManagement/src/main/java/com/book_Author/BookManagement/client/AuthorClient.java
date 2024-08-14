package com.book_Author.BookManagement.client;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.book_Author.BookManagement.entity.Author;

@FeignClient(name = "AuthorManagement", url = "http://localhost:8200")
public interface AuthorClient {

    @GetMapping("/authors/{id}")
    public Author getAuthorById(@PathVariable("id") Long id);
}
