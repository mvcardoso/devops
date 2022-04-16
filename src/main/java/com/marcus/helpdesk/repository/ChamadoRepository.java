package com.marcus.helpdesk.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcus.helpdesk.domain.Chamado;

public interface ChamadoRepository extends JpaRepository<Chamado, Integer>{
	

}
