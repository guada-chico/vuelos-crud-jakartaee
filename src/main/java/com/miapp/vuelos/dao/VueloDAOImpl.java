package com.miapp.vuelos.dao;

import com.miapp.vuelos.model.Vuelo;
import jakarta.enterprise.context.RequestScoped;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

import java.util.List;

@RequestScoped
public class VueloDAOImpl implements VueloDAO {

    @PersistenceContext(unitName = "vuelosPU")
    private EntityManager em;

    @Override
    public Vuelo findById(Integer id) {
        return em.find(Vuelo.class, id);
    }

    @Override
    public List<Vuelo> findAll() {
    String jpql = "SELECT v FROM Vuelo v " +
              "JOIN FETCH v.avion a " +
              "JOIN FETCH v.compania c " +
              "JOIN FETCH v.origen o " +
              "JOIN FETCH v.destino d " +
              "LEFT JOIN FETCH v.puerta p " +
              "LEFT JOIN FETCH p.terminal t " +
              "ORDER BY v.dia ASC, v.hora ASC";
                  
    return em.createQuery(jpql, Vuelo.class).getResultList();
    }
}
