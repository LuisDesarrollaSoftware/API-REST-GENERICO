package com.example.apirestcurso.dominio.services;

import com.example.apirestcurso.dominio.entities.Autor;
import com.example.apirestcurso.dominio.repositories.AutorRepository;
import com.example.apirestcurso.dominio.repositories.BaseRepository;
import com.example.apirestcurso.dominio.services.Interfaces.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutorServiceImpl extends BaseServiceImpl<Autor, Long> implements AutorService {

    @Autowired
    private AutorRepository autorRepository;

    public AutorServiceImpl(BaseRepository<Autor, Long> repository) {
        super(repository);
    }

}
