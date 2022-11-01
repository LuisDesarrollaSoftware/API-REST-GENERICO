package com.example.apirestcurso.dominio.services;

import com.example.apirestcurso.dominio.entities.Autor;
import com.example.apirestcurso.dominio.repositories.BaseRepository;
import com.example.apirestcurso.dominio.repositories.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutorService extends BaseServiceImpl<Autor,Long> {

    @Autowired
    private AutorRepository autorRepository;

    public AutorService(BaseRepository<Autor,Long> repository) {
       super(repository);
    }

}