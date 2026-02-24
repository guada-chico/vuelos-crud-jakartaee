package com.miapp.vuelos.dto;

public class VueloDTO {
    private String fecha;
    private String hora;
    private String numeroVuelo;
    private String matriculaAvion;
    private String fabricanteAvion;
    private String modeloAvion;
    private String nombreCompania;
    private String origen;
    private String destino;
    private String terminal;
    private String puerta;

    public VueloDTO() {}

    public VueloDTO(String fecha, String hora, String numeroVuelo, String matriculaAvion, String fabricanteAvion, 
                    String modeloAvion, String nombreCompania, String origen, String destino, String terminal, String puerta) {
        this.fecha = fecha;
        this.hora = hora;
        this.numeroVuelo = numeroVuelo;
        this.matriculaAvion = matriculaAvion;
        this.fabricanteAvion = fabricanteAvion;
        this.modeloAvion = modeloAvion;
        this.nombreCompania = nombreCompania;
        this.origen = origen;
        this.destino = destino;
        this.terminal = terminal;
        this.puerta = puerta;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getNumeroVuelo() {
        return numeroVuelo;
    }

    public void setNumeroVuelo(String numeroVuelo) {
        this.numeroVuelo = numeroVuelo;
    }

    public String getMatriculaAvion() {
        return matriculaAvion;
    }

    public void setMatriculaAvion(String matriculaAvion) {
        this.matriculaAvion = matriculaAvion;
    }

    public String getFabricanteAvion() {
        return fabricanteAvion;
    }

    public void setFabricanteAvion(String fabricanteAvion) {
        this.fabricanteAvion = fabricanteAvion;
    }

    public String getModeloAvion() {
        return modeloAvion;
    }

    public void setModeloAvion(String modeloAvion) {
        this.modeloAvion = modeloAvion;
    }

    public String getNombreCompania() {
        return nombreCompania;
    }

    public void setNombreCompania(String nombreCompania) {
        this.nombreCompania = nombreCompania;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getTerminal() {
        return terminal;
    }

    public void setTerminal(String terminal) {
        this.terminal = terminal;
    }

    public String getPuerta() {
        return puerta;
    }

    public void setPuerta(String puerta) {
        this.puerta = puerta;
    }
}