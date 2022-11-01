package com.example.apirestcurso.dominio.services;

import com.example.apirestcurso.dominio.entities.Persona;
import com.example.apirestcurso.dominio.repositories.BaseRepository;
import com.example.apirestcurso.dominio.repositories.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class PersonaService extends BaseServiceImpl<Persona,Long> {

    @Autowired
    private PersonaRepository personaRepository;

    public PersonaService(BaseRepository<Persona,Long> repository) {
       super(repository);
    }

}
