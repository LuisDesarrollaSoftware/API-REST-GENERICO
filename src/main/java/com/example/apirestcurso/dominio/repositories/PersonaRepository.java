package com.example.apirestcurso.dominio.repositories;

import com.example.apirestcurso.dominio.entities.Persona;
import org.springframework.beans.factory.annotation.Qualifier;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends BaseRepository<Persona,Long> {
}
