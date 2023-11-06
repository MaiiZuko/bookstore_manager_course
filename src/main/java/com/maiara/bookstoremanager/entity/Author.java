package com.maiara.bookstoremanager.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
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
}
