package com.example.apirestcurso.dominio.services;


import com.example.apirestcurso.dominio.entities.Localidad;
import com.example.apirestcurso.dominio.repositories.AutorRepository;
import com.example.apirestcurso.dominio.repositories.BaseRepository;
import com.example.apirestcurso.dominio.repositories.LocalidadRepository;
import com.example.apirestcurso.dominio.services.Interfaces.LocalidadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocalidadServiceImpl extends BaseServiceImpl<Localidad, Long> implements LocalidadService {

    @Autowired
    private LocalidadRepository localidadRepository;

    public LocalidadServiceImpl(BaseRepository<Localidad, Long> repository) {
        super(repository);
    }

}
