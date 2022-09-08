package com.entra21.primeiroprojetospring.view.service;

import com.entra21.primeiroprojetospring.model.dto.LivroListagemDTO;
import com.entra21.primeiroprojetospring.view.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class LivroService {
    @Autowired
    private LivroRepository livroRepository;

    public List<LivroListagemDTO> getAll() {
        return livroRepository.findAll().stream().map(livro -> {
            return new LivroListagemDTO(livro.getAutor(), livro.getQtdePaginas(), livro.getAnoPublicacao(), livro.getEdicao(), livro.getItemId(), livro.getTitulo(), livro.getValorVenda(), livro.getValorLocacao(), livro.getEmprestado(), livro.getFranquia(), livro.getAvaliacoes(), livro.getGeneros());
        }).collect(Collectors.toList());
    }
}
