package com.miapp.vuelos.model;

import jakarta.persistence.*;

@Entity
@Table(name = "aviones")
public class Avion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_avi")
    private Integer id;
    
    @Column(name = "mat_avi")
    private String matricula;
    
    @Column(name = "fab_avi")
    private String fabricante;
    
    @Column(name = "mod_avi")
    private String modelo;
    
    public Avion (){
    }
    
    public Avion (Integer id, String matricula, String fabricante, String modelo) {
        this.id = id;
        this.matricula = matricula;
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
