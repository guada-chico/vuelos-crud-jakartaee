package com.miapp.vuelos.model;

import jakarta.persistence.*;

@Entity
@Table(name = "puertas")
public class Puerta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pue")
    private Integer id;
    
    @Column(name = "num_pue")
    private String numero;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_ter")
    private Terminal terminal;
    
    public Puerta (){
    }
    
    public Puerta (Integer id, String numero, Terminal terminal) {
        this.id = id;
        this.numero = numero;
        this.terminal = terminal;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Terminal getTerminal() {
        return terminal;
    }

    public void setTerminal(Terminal terminal) {
        this.terminal = terminal;
    }
    
    
}
