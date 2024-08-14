package com.book_Author.AuthorManagement.controller;

import com.book_Author.AuthorManagement.entity.Author;
import com.book_Author.AuthorManagement.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AuthorController {

    @Autowired
    private AuthorRepository authorRepository;

    @GetMapping("/authors")
    public List<Author> getAllAuthors() {
        return authorRepository.findAll();
    }

    @GetMapping("/authors/{id}")
    public Author getAuthorById(@PathVariable Long id) {
        return authorRepository.findById(id);
    }
}
