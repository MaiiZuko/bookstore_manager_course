package com.maiara.bookstoremanager.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maiara.bookstoremanager.dto.BookDTO;
import com.maiara.bookstoremanager.dto.MessageResponseDTO;
import com.maiara.bookstoremanager.entity.Book;
import com.maiara.bookstoremanager.repository.BookRepository;
import com.maiara.bookstoremanager.service.BookService;

//Responsável somente para receber as requisições http
//Essa classe para o spring vai representar um controller API Rest
@RestController
//Indicando o endpoint onde vamos fazer o acesso a esse controle
@RequestMapping("/api/v1/books")
public class BookController {
    
    private BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping //Estamos marcando uma operação do tipo post que dentro do modelo arquitetural REST significa que esse método junto com o parâmetro passado na requisição de um livro
    public MessageResponseDTO create(@RequestBody @Valid BookDTO bookDTO) { //Post acessado pela api/v1/books ele precisa ser passado com um corpo de um livro
        return bookService.create(bookDTO);

    }

    @GetMapping("/{id}")
    public BookDTO findById(@PathVariable Long id) {
        return bookService.findById(id);
    }
    
}
