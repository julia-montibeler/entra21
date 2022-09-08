package com.entra21.primeiroprojetospring.view.service;

import com.entra21.primeiroprojetospring.model.dto.AvaliacaoListagemDTO;
import com.entra21.primeiroprojetospring.model.dto.FranquiaListagemDTO;
import com.entra21.primeiroprojetospring.view.repository.AvaliacaoRepository;
import com.entra21.primeiroprojetospring.view.repository.FranquiaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AvaliacaoService {
    @Autowired
    private AvaliacaoRepository avaliacaoRepository;

    public List<AvaliacaoListagemDTO> getAll() {
        return avaliacaoRepository.findAll().stream().map(fr -> {
            return new AvaliacaoListagemDTO(fr.getId(),fr.getNomeAvaliador(),fr.getNota(),fr.getComentario(),fr.getItem());
        }).collect(Collectors.toList());
    }
}
