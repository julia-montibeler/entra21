package com.entra21.primeiroprojetospring.controller;

import com.entra21.primeiroprojetospring.model.dto.LivroListagemDTO;
import com.entra21.primeiroprojetospring.model.entity.LivroEntity;
import com.entra21.primeiroprojetospring.view.repository.LivroRepository;
import com.entra21.primeiroprojetospring.view.service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/livros")
public class LivroRestController {
    @Autowired
    private LivroService livroService;

    @Autowired
    private LivroRepository livroRepository;

    @GetMapping
    public List<LivroListagemDTO> getlivros() {
        return livroService.getAll();
    }

    @PostMapping
    public void addlivro(@RequestBody LivroEntity livro) {
        livroRepository.save(livro);
    }

    @GetMapping("/{id}")
    public ResponseEntity<LivroEntity> getlivro(@PathVariable(name = "id") Long id) {
        Optional<LivroEntity> livro = livroRepository.findById(id);
        if (livro.isPresent()) {
            return ResponseEntity.ok(livro.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public void deletelivro(@PathVariable(name = "id") Long id) {
        livroRepository.deleteById(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<LivroEntity> updatelivro(@PathVariable(name = "id") Long id, @RequestBody String novoTitulo) {
        Optional<LivroEntity> livro = livroRepository.findById(id);
        if(livro.isPresent()) {
            livro.get().setTitulo(novoTitulo);
            return ResponseEntity.ok(livroRepository.save(livro.get()));
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
