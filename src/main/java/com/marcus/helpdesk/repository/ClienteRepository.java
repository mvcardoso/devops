package com.marcus.helpdesk.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcus.helpdesk.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{
	

}
