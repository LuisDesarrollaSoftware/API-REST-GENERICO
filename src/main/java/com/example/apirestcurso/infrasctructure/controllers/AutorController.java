package com.example.apirestcurso.infrasctructure.controllers;

import com.example.apirestcurso.dominio.entities.Autor;
import com.example.apirestcurso.dominio.entities.Persona;
import com.example.apirestcurso.dominio.services.AutorServiceImpl;
import com.example.apirestcurso.dominio.services.PersonaServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/autores")
public class AutorController extends BaseControllerImpl<Autor, AutorServiceImpl>{




}
