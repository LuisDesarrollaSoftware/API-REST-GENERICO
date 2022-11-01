package com.example.apirestcurso.dominio.services;

import com.example.apirestcurso.dominio.entities.Persona;
import com.example.apirestcurso.dominio.repositories.BaseRepository;
import com.example.apirestcurso.dominio.repositories.PersonaRepository;
import com.example.apirestcurso.dominio.services.Interfaces.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaServiceImpl extends BaseServiceImpl<Persona,Long> implements PersonaService {

    @Autowired
    private PersonaRepository personaRepository;

    public PersonaServiceImpl(BaseRepository<Persona,Long> repository) {
       super(repository);
    }

}
