package com.entra21.primeiroprojetospring.view.service;

import com.entra21.primeiroprojetospring.model.dto.FranquiaListagemDTO;
import com.entra21.primeiroprojetospring.model.dto.GeneroListagemDTO;
import com.entra21.primeiroprojetospring.view.repository.FranquiaRepository;
import com.entra21.primeiroprojetospring.view.repository.GeneroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class GeneroService {
    @Autowired
    private GeneroRepository generoRepository;

    public List<GeneroListagemDTO> getAll() {
        return generoRepository.findAll().stream().map(fr -> {
            GeneroListagemDTO dto = new GeneroListagemDTO();
            dto.setId(fr.getId());
            dto.setNome(fr.getNome());
            return dto;
        }).collect(Collectors.toList());
    }
}
