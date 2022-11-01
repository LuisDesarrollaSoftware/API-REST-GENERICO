package com.example.apirestcurso.infrasctructure.controllers;

import com.example.apirestcurso.dominio.entities.Localidad;
import com.example.apirestcurso.dominio.entities.Persona;
import com.example.apirestcurso.dominio.services.LocalidadServiceImpl;
import com.example.apirestcurso.dominio.services.PersonaServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/localidades")
public class LocalidadController extends BaseControllerImpl<Localidad, LocalidadServiceImpl>{
}
