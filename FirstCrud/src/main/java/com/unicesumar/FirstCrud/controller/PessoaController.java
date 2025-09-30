package com.unicesumar.FirstCrud.controller;

import com.unicesumar.FirstCrud.model.Pessoa;
import com.unicesumar.FirstCrud.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/pessoa")
public class PessoaController {
    @Autowired
    private PessoaService pessoaService;

    @GetMapping
    public List<Pessoa> findAll(){
        return pessoaService.listar();
    }

    @PostMapping
    public Pessoa criar(@RequestBody Pessoa pessoa){
        return pessoaService.criarPessoa(pessoa);
    }

    @GetMapping("/{id}")
    private ResponseEntity<Pessoa> buscarPessoaPorId(@PathVariable Long id){
        return ResponseEntity.ok(pessoaService.buscarPorId(id));
    }

    @DeleteMapping("/{id}")
    public void deletarPessoa(@PathVariable Long id){
        pessoaService.deletarPessoa(id);
    }
}