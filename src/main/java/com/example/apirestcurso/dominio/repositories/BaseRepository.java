package com.example.apirestcurso.dominio.repositories;

import com.example.apirestcurso.dominio.entities.Base;
import com.example.apirestcurso.dominio.entities.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;

import java.io.Serializable;


@NoRepositoryBean
public interface BaseRepository <E extends Base, ID extends Serializable> extends JpaRepository<E,ID> {
}
