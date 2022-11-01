package com.example.apirestcurso.dominio.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name="domicilio")
public class Domicilio extends Base{

    @Column(name = "calle")
    private String calle;
    @Column(name = "numero")
    private String numero;

    @ManyToOne(optional = false)
    @JoinColumn(name = "fk_localidad")
    private Localidad localidad;

}
