package com.maiara.bookstoremanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.maiara.bookstoremanager.dto.MessageResponseDTO;
import com.maiara.bookstoremanager.entity.Book;
import com.maiara.bookstoremanager.repository.BookRepository;

@Service
//Classe de regra de negócios
// Tem a responsabilidade de fazer livros
public class BookService {
    
    private BookRepository bookRepository;

    //Autowired para fazer a injeção de dependencia de um atributo da classe repository para dentro dessa classe
    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    //Cadastro de livro
    //DTO método de transferência de dados

    public MessageResponseDTO create(Book book) { 
        Book savedBook = bookRepository.save(book);
        return MessageResponseDTO.builder()
            .message("Book created with ID " + savedBook.getId())
            .build();

    }
}
