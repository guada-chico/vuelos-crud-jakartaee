package com.miapp.vuelos.model;

import jakarta.persistence.*;

@Entity
@Table(name = "companias")
public class Compania {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_com")
    private Integer id;
    
    @Column(name = "nom_com")
    private String nombre;
    
    public Compania (){
    }
    
    public Compania (Integer id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
