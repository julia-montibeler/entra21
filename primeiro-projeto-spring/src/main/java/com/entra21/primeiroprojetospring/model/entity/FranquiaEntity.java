package com.entra21.primeiroprojetospring.model.entity;
import lombok.Data;

import javax.persistence.*;

@Data //Lombok gera getters e setters
@Entity
@Table(name = "franquia")
public class FranquiaEntity {
    @Column(name = "id")
    @Id // chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY) //deixa a geração de id para o banco de dados
    private Long id;

    @Column(name = "nome", nullable = false)
    private String nome;
}
