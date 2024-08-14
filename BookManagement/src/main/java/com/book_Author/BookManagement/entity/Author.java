package com.book_Author.BookManagement.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.websocket.server.ServerEndpoint;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Author {
    @Id
    private Long id;
    private String name;

}
