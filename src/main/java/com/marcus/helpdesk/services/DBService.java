package com.marcus.helpdesk.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marcus.helpdesk.domain.Chamado;
import com.marcus.helpdesk.domain.Cliente;
import com.marcus.helpdesk.domain.Tecnico;
import com.marcus.helpdesk.domain.enums.Perfil;
import com.marcus.helpdesk.domain.enums.Prioridade;
import com.marcus.helpdesk.domain.enums.Status;
import com.marcus.helpdesk.repository.ChamadoRepository;
import com.marcus.helpdesk.repository.ClienteRepository;
import com.marcus.helpdesk.repository.TecnicoRepository;

@Service
public class DBService {

	@Autowired
	private TecnicoRepository tecnicoRepository;

	@Autowired
	private ClienteRepository clienteRepository;

	@Autowired
	private ChamadoRepository chamadoRepository;

	public void instanciaDB() {

		Tecnico tec1 = new Tecnico(null, "Marcus", "12345678910", "marcus@email.com", "123456");
		tec1.addPerfil(Perfil.ADMIN);

		Cliente cli1 = new Cliente(null, "Linus Torvalds", "9876543215", "linus@email.com", "234234");

		Chamado cha1 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 01", "Primeiro Chamado", tec1,
				cli1);

		tecnicoRepository.saveAll(Arrays.asList(tec1));
		clienteRepository.saveAll(Arrays.asList(cli1));
		chamadoRepository.saveAll(Arrays.asList(cha1));
	}
}
