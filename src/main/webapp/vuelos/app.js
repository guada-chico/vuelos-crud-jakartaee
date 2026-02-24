const API_URL = window.location.origin + 
    window.location.pathname.substring(0, window.location.pathname.indexOf('/vuelos/')) + 
    '/api/vuelos';

document.addEventListener('DOMContentLoaded', () => {
    const tablaBody = document.getElementById('tabla-vuelos');

    cargarVuelos();

    async function cargarVuelos() {
        try {
            const respuesta = await fetch(API_URL);
            if (!respuesta.ok) {
                throw new Error('Error al cargar los vuelos');
            }
            const vuelos = await respuesta.json();
            pintarTabla(vuelos);
        } catch (error) {
            console.error(error);
            alert('No se pudieron cargar los vuelos');
        }
    }

    function pintarTabla(vuelos) {
        tablaBody.innerHTML = '';

        vuelos.forEach(vuelo => {
            const tr = document.createElement('tr');

            const tdFecha = document.createElement('td');
            const tdHora = document.createElement('td');
            const tdVuelo = document.createElement('td');
            const tdMatricula = document.createElement('td');
            const tdFabricante = document.createElement('td');
            const tdModelo = document.createElement('td');
            const tdCompania = document.createElement('td');
            const tdOrigen = document.createElement('td');
            const tdDestino = document.createElement('td');
            const tdTerminal = document.createElement('td');
            const tdPuerta = document.createElement('td');

            tdFecha.textContent = vuelo.fecha;
            tdHora.textContent = vuelo.hora;
            tdVuelo.textContent = vuelo.numeroVuelo; 
            tdMatricula.textContent = vuelo.matriculaAvion;
            tdFabricante.textContent = vuelo.fabricanteAvion;
            tdModelo.textContent = vuelo.modeloAvion;
            tdCompania.textContent = vuelo.nombreCompania;
            tdOrigen.textContent = vuelo.origen;
            tdDestino.textContent = vuelo.destino;
            tdTerminal.textContent = vuelo.terminal || '-';
            tdPuerta.textContent = vuelo.puerta || '-';
            
            tr.appendChild(tdFecha);
            tr.appendChild(tdHora);
            tr.appendChild(tdVuelo);
            tr.appendChild(tdMatricula);
            tr.appendChild(tdFabricante);
            tr.appendChild(tdModelo);
            tr.appendChild(tdCompania);
            tr.appendChild(tdOrigen);
            tr.appendChild(tdDestino);
            tr.appendChild(tdTerminal);
            tr.appendChild(tdPuerta);
            
            tablaBody.appendChild(tr);
        });
    }
});



