package com.miapp.vuelos.web;

import com.miapp.vuelos.dto.VueloDTO;
import com.miapp.vuelos.model.Vuelo;
import com.miapp.vuelos.service.VueloService;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.List;
import java.util.stream.Collectors;

@Path("/vuelos")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)

public class VueloResource {

    @Inject
    private VueloService servicio;

    @GET
    public List<VueloDTO> listar() {
        return servicio.listarTodos()
                .stream()
                .map(this::toDTO)
                .collect(Collectors.toList());
    }

    @GET
    @Path("/{id}")
    public VueloDTO obtener(@PathParam("id") Integer id) {
        Vuelo v = servicio.buscarPorId(id);
        if (v == null) {
            throw new NotFoundException("Vuelo no encontrado");
        }
        return toDTO(v);
    }

    private VueloDTO toDTO(Vuelo v) {
        return new VueloDTO(
            v.getDia().toString(),
            v.getHora().toString(),
            v.getNumeroVuelo(),
            v.getAvion().getMatricula(),
            v.getAvion().getFabricante(),
            v.getAvion().getModelo(),
            v.getCompania().getNombre(),
            v.getOrigen().getNombre(),
            v.getDestino().getNombre(),
            v.getPuerta() != null ? v.getPuerta().getTerminal().getNombre() : "-",
            v.getPuerta() != null ? v.getPuerta().getNumero() : "-"
        ); 
    }
}

