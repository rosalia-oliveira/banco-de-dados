package com.crud.storage.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Getter
@NoArgsConstructor
@Setter
@Table(name = "book")
@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 50, nullable = false)
    private String title;

    @ManyToOne
    @JoinColumn(name = "subject_id")
    @JsonIgnoreProperties("books")
    private Subject subject;

    @ManyToMany(mappedBy = "books")
    @JsonIgnoreProperties("books")
    private Set<Author> authors; // Set assemelha-se a lista porem nao traz as repetições
}
