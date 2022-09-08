package com.entra21.primeiroprojetospring.model.dto;

import com.entra21.primeiroprojetospring.model.entity.AvaliacaoEntity;
import com.entra21.primeiroprojetospring.model.entity.FranquiaEntity;
import com.entra21.primeiroprojetospring.model.entity.GeneroEntity;
import lombok.Data;

import javax.persistence.Column;
import java.util.Set;

@Data
public class LivroListagemDTO {
    private String autor;
    private Integer qtdePaginas;
    private Integer anoPublicacao;
    private Integer edicao;

    private Long itemId;
    private String titulo;
    private Double valorVenda;
    private Double valorLocacao;
    private Boolean emprestado;
    private FranquiaEntity franquia;
    private Set<AvaliacaoEntity> avaliacoes;
    private Set<GeneroEntity> generos;

    public LivroListagemDTO(String autor, Integer qtdePaginas, Integer anoPublicacao, Integer edicao, Long itemId, String titulo, Double valorVenda, Double valorLocacao, Boolean emprestado, FranquiaEntity franquia, Set<AvaliacaoEntity> avaliacoes, Set<GeneroEntity> generos) {
        this.autor = autor;
        this.qtdePaginas = qtdePaginas;
        this.anoPublicacao = anoPublicacao;
        this.edicao = edicao;
        this.itemId = itemId;
        this.titulo = titulo;
        this.valorVenda = valorVenda;
        this.valorLocacao = valorLocacao;
        this.emprestado = emprestado;
        this.franquia = franquia;
        this.avaliacoes = avaliacoes;
        this.generos = generos;
    }
}
