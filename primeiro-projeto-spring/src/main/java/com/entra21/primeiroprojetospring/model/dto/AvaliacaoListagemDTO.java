package com.entra21.primeiroprojetospring.model.dto;

import com.entra21.primeiroprojetospring.model.entity.ItemEntity;
import lombok.Data;

@Data
public class AvaliacaoListagemDTO {
    private Long id;
    private String nomeAvaliador;
    private Double nota;
    private String comentario;
    private ItemEntity item;

    public AvaliacaoListagemDTO(Long id, String nomeAvaliador, Double nota, String comentario, ItemEntity item) {
        this.id = id;
        this.nomeAvaliador = nomeAvaliador;
        this.nota = nota;
        this.comentario = comentario;
        this.item = item;
    }
}
