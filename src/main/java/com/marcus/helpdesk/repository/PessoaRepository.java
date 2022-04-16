package com.marcus.helpdesk.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcus.helpdesk.domain.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer>{
	

}
