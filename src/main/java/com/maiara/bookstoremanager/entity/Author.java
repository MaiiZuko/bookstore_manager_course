package com.maiara.bookstoremanager.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class Author {

    @Id
    //Cada vez que ele fizer uma inserção em um banco de dados automaticamente vai ter uma chave encriptada para nós
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //Banco não vai permitir tabela como nula e o campo precisa ser unico
    @Column(nullable = false, unique = true)
    private String name;

    // Valor não pode ser vazio
    @Column(nullable = false)
    private Integer age;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
    
}
