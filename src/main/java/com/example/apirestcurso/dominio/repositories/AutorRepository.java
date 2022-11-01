package com.example.apirestcurso.dominio.repositories;

import com.example.apirestcurso.dominio.entities.Autor;
import com.example.apirestcurso.dominio.entities.Persona;
import org.springframework.stereotype.Repository;

@Repository
public interface AutorRepository extends BaseRepository<Autor,Long> {
}
