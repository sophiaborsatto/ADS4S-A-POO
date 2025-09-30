package com.unicesumar.FirstCrud.repository;

import com.unicesumar.FirstCrud.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
}
