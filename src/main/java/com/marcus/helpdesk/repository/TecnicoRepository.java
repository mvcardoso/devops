package com.marcus.helpdesk.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcus.helpdesk.domain.Tecnico;

public interface TecnicoRepository extends JpaRepository<Tecnico, Integer>{
	

}
