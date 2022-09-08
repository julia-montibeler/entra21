package com.entra21.primeiroprojetospring.view.service;

import com.entra21.primeiroprojetospring.model.dto.AvaliacaoListagemDTO;
import com.entra21.primeiroprojetospring.model.dto.DvdListagemDTO;
import com.entra21.primeiroprojetospring.model.dto.FranquiaListagemDTO;
import com.entra21.primeiroprojetospring.model.entity.AvaliacaoEntity;
import com.entra21.primeiroprojetospring.model.entity.FranquiaEntity;
import com.entra21.primeiroprojetospring.model.entity.GeneroEntity;
import com.entra21.primeiroprojetospring.view.repository.DvdRepository;
import com.entra21.primeiroprojetospring.view.repository.FranquiaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class DvdService {
    @Autowired
    private DvdRepository dvdRepository;

    public List<DvdListagemDTO> getAll() {
        return dvdRepository.findAll().stream().map(dvd -> {
            return new DvdListagemDTO(dvd.getDiretor(), dvd.getDuracao(), dvd.getAnoLancamento(), dvd.getItemId(), dvd.getTitulo(), dvd.getValorVenda(), dvd.getValorLocacao(), dvd.getEmprestado(), dvd.getFranquia(), dvd.getAvaliacoes(), dvd.getGeneros());
        }).collect(Collectors.toList());
    }
}
