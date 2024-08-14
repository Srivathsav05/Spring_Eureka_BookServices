package com.book_Author.BookManagement.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
//import org.springframework.data.annotation.Id;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
//@Document(collection = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
   private Long id;
   private String title;
   private Long authorId;
}
