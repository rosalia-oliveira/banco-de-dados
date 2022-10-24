package com.crud.storage.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Setter
@Entity // identifico a classe como uma entidade e autorizo o banco de dados a criar a entidade caso ela não exista.
@Table(name = "user") // para personalizar o nome da tabela de forma diferente do nome da classe, por padrão será o mesmo da classe.
public class SystemUser {

    @Id // indica a PK da entidade
    @GeneratedValue(strategy = GenerationType.IDENTITY) // indica a geração automática da numeração deste campo
    private Long id;

    @Column(length = 50, nullable = false) // define as regras para inclusão deste campo na tabela
    private String name;

    @Column(length = 100, nullable = false) // define as regras para inclusão deste campo na tabela
    private String lastname;

    @Column(name = "e_mail", length = 150, unique = true)
    private String email;
}

