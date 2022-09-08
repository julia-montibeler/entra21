package com.entra21.primeiroprojetospring.model.dto;

import com.entra21.primeiroprojetospring.model.entity.AvaliacaoEntity;
import com.entra21.primeiroprojetospring.model.entity.FranquiaEntity;
import com.entra21.primeiroprojetospring.model.entity.GeneroEntity;
import lombok.Data;

import javax.persistence.Column;
import java.time.LocalTime;
import java.util.Set;

@Data
public class DvdListagemDTO{
    private String diretor;
    private LocalTime duracao;
    private Integer anoLancamento;

    private Long itemId;
    private String titulo;
    private Double valorVenda;
    private Double valorLocacao;
    private Boolean emprestado;
    private FranquiaEntity franquia;
    private Set<AvaliacaoEntity> avaliacoes;
    private Set<GeneroEntity> generos;

    public DvdListagemDTO(String diretor, LocalTime duracao, Integer anoLancamento, Long itemId, String titulo, Double valorVenda, Double valorLocacao, Boolean emprestado, FranquiaEntity franquia, Set<AvaliacaoEntity> avaliacoes, Set<GeneroEntity> generos) {
        this.diretor = diretor;
        this.duracao = duracao;
        this.anoLancamento = anoLancamento;
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
