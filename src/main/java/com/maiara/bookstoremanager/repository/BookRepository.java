package com.maiara.bookstoremanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maiara.bookstoremanager.entity.Book;

//Funcionalidade de cadastro de livros
public interface BookRepository extends JpaRepository<Book, Long> {
    
}
