package com.example.apirestcurso.infrasctructure.controllers;

import com.example.apirestcurso.dominio.entities.Persona;
import com.example.apirestcurso.dominio.services.PersonaServiceImpl;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/personas")
public class PersonaController extends BaseControllerImpl<Persona,PersonaServiceImpl>{




}
