package com.unicesumar.FirstCrud.service;

import com.unicesumar.FirstCrud.controller.PessoaController;
import com.unicesumar.FirstCrud.model.Pessoa;
import com.unicesumar.FirstCrud.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaService {
    @Autowired
    private PessoaRepository pessoaRepository;

    public List<Pessoa> listar(){
        return pessoaRepository.findAll();
    }

    public Pessoa criarPessoa(Pessoa pessoa){
        return pessoaRepository.save(pessoa);
    }

    public Pessoa buscarPorId(Long id){
        return pessoaRepository.findById(id).
                orElseThrow(() -> new RuntimeException("Pessoa não encontrada."));
    }

    public void deletarPessoa(Long id){
        pessoaRepository.deleteById(id);
    }
}