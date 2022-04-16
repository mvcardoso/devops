package com.marcus.helpdesk;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.marcus.helpdesk.domain.Chamado;
import com.marcus.helpdesk.domain.Cliente;
import com.marcus.helpdesk.domain.Tecnico;
import com.marcus.helpdesk.domain.enums.Perfil;
import com.marcus.helpdesk.domain.enums.Prioridade;
import com.marcus.helpdesk.domain.enums.Status;
import com.marcus.helpdesk.repository.ChamadoRepository;
import com.marcus.helpdesk.repository.ClienteRepository;
import com.marcus.helpdesk.repository.TecnicoRepository;

@SpringBootApplication
public class HelpdeskApplication {
	

	public static void main(String[] args) {
		SpringApplication.run(HelpdeskApplication.class, args);
	}


}
