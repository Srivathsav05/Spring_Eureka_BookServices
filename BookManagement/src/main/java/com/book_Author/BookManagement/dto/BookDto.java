package com.book_Author.BookManagement.dto;

import com.book_Author.BookManagement.entity.Author;
import jakarta.validation.constraints.NotBlank;

public record BookDto(
        Long id,
        @NotBlank(message = "Title Not Should be Empty")
        String title,
        Author author
) {
}
