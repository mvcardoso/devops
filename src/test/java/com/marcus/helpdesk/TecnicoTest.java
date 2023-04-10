package com.marcus.helpdesk;

import com.marcus.helpdesk.domain.Tecnico;
import com.marcus.helpdesk.domain.dtos.TecnicoDTO;
import com.marcus.helpdesk.repository.TecnicoRepository;
import com.marcus.helpdesk.services.DBService;
import com.marcus.helpdesk.services.TecnicoService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;


import java.time.LocalDate;

public class TecnicoTest {

    @Mock
    TecnicoService service;
    TecnicoRepository repository;

    @Mock
    private DBService dbService;

    @Before
    public void beforeEach() {
        MockitoAnnotations.openMocks(this);
        this.dbService = new DBService();
    }

    @Test
    public void createTecnico(){
       TecnicoDTO objDto = new TecnicoDTO();
       objDto.setId(01);
       objDto.setNome("Teste");
       objDto.setCpf("000.000.000-00");
       objDto.setEmail("teste@mail.com");
       objDto.setDataCriacao(LocalDate.now());
       service.create(objDto);
    }

}
