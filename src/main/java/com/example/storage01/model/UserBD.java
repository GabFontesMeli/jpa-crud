package com.example.storage01.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity // indica que esta classe será uma entidade do banco de dados
@Table(name = "tb_user") // indica o nome da tabela no banco de dados
public class UserBD {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // gera o id automaticamente no BD 1, 2, 3, 4...
    private long cod;

    @Column(length = 150, nullable = false) // define um tamanho máximo de 150 caracteres e não pode ser nulo
    private String name;

    @Column(name = "e_mail", length = 100, nullable = false, unique = true) // define um nome, tamanho máximo de 100 caracteres, não pode ser nulo e deve ser único
    private String email;
}
