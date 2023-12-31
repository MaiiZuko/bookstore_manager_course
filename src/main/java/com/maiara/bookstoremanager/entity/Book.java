package com.maiara.bookstoremanager.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String name;

    @Column(nullable = false)
    private Integer pages;

    @Column(nullable = false)
    private Integer chapters;

    @Column(nullable = false)
    private String isbn;

    @Column(name = "publisher_name", nullable = false, unique = true)
    private String publisherName;

    //Vamos mapear um para um - um livro sempre vai ter um autor e um autor varios livros
    // Qual a estratégia para ele pegar o relacionamento - é uma FetchType.LAZY -> para ele fazer a consulta de um livro de seus autores ele precisa fazer uma consulta fazendo um join para retornar esse dado
    //Lazy utiliza performace para nós. Toda vez que nós inserimos um livro automaticamente ele recebe um autor cascade para fazer a inserção - atualização através de merge ou removermos
    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    //Qual coluna no nosso banco de dados vai fazer o relacionamento - chave estrangeira para a tabela do autor
    @JoinColumn(name = "author_id")
    private Author author;
}
