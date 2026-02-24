package com.miapp.vuelos.dao;

import com.miapp.vuelos.model.Vuelo;

import java.util.List;

public interface VueloDAO {

    Vuelo findById(Integer id);

    List<Vuelo> findAll();
}