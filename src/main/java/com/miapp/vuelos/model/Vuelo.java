package com.miapp.vuelos.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "vuelos")
public class Vuelo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_vue")
    private Integer id;
    
    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn (name = "id_avi")
    private Avion avion;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_com")
    private Compania compania;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_pue")
    private Puerta puerta; 

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn (name = "ori_vue")
    private Aeropuerto origen;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn (name = "des_vue")
    private Aeropuerto destino;

    @Column(name = "hor_vue")
    private LocalTime hora;

    @Column(name = "dia_vue")
    private LocalDate dia;

    @Column(name = "num_vue")
    private String numeroVuelo;


    public Vuelo() {
    }

    public Vuelo(Avion avion, Compania compania, Puerta puerta, Aeropuerto origen, Aeropuerto destino, LocalTime hora, LocalDate dia, String numeroVuelo) {
        this.avion = avion;
        this.compania = compania;
        this.puerta = puerta;
        this.origen = origen;
        this.destino = destino;
        this.hora = hora;
        this.dia = dia;
        this.numeroVuelo = numeroVuelo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Avion getAvion() {
        return avion;
    }

    public void setAvion(Avion avion) {
        this.avion = avion;
    }

    public Compania getCompania() {
        return compania;
    }

    public void setCompania(Compania compania) {
        this.compania = compania;
    }

    public Puerta getPuerta() {
        return puerta;
    }

    public void setPuerta(Puerta puerta) {
        this.puerta = puerta;
    }

    public Aeropuerto getOrigen() {
        return origen;
    }

    public void setOrigen(Aeropuerto origen) {
        this.origen = origen;
    }

    public Aeropuerto getDestino() {
        return destino;
    }

    public void setDestino(Aeropuerto destino) {
        this.destino = destino;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public LocalDate getDia() {
        return dia;
    }

    public void setDia(LocalDate dia) {
        this.dia = dia;
    }

    public String getNumeroVuelo() {
        return numeroVuelo;
    }

    public void setNumeroVuelo(String numeroVuelo) {
        this.numeroVuelo = numeroVuelo;
    }

    
}
