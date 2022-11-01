package com.example.apirestcurso.dominio.repositories;

import com.example.apirestcurso.dominio.entities.Localidad;
import com.example.apirestcurso.dominio.entities.Persona;
import org.springframework.stereotype.Repository;

@Repository
public interface LocalidadRepository extends BaseRepository<Localidad,Long> {
}
