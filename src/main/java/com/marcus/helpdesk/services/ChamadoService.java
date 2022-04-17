package com.marcus.helpdesk.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marcus.helpdesk.domain.Chamado;
import com.marcus.helpdesk.repository.ChamadoRepository;
import com.marcus.helpdesk.services.exceptions.ObjectnotFoundException;

@Service
public class ChamadoService {

	@Autowired
	private ChamadoRepository repository;
	
	public Chamado findById(Integer id) {
		Optional<Chamado> obj = repository.findById(id);
		return obj.orElseThrow(()-> new ObjectnotFoundException("Objeto não encontrado. ID: "+ id));
	}

	public List<Chamado> findAll() {
		return repository.findAll();
	}
}
