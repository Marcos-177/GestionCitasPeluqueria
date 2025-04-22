package com.peluqueria;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase encargada de gestionar las citas de la peluquería
 * Permite añadir, eliminar y consultar citas, así como registrar clientes y peluqueros
 */
public class GestorCitas {
    private List<Cita> citas = new ArrayList<>();
    private List<Cliente> clientes = new ArrayList<>();
    private List<Peluquero> peluqueros = new ArrayList<>();

    /**
     * Añade una nueva cita si está disponible
     *
     * @param cita Cita a añadir
     * @return true si la cita fue añadida correctamente, false en caso contrario
     */
    public boolean añadirCita(Cita cita) {
        if (cita.verificarDisponibilidad()) {
            citas.add(cita);
            return true;
        }
        return false;
    }

    /**
     * Elimina una cita existente
     *
     * @param cita Cita a eliminar
     */
    public void eliminarCita(Cita cita) {
        citas.remove(cita);
    }

    /**
     * Obtiene todas las citas programadas para un día específico
     *
     * @param fecha Fecha para la cual se desean obtener las citas
     * @return Lista de citas para ese día
     */
    public List<Cita> obtenerCitasPorDia(LocalDate fecha) {
        List<Cita> citasDia = new ArrayList<>();
        for (Cita c : citas) {
            if (c.getFecha().equals(fecha)) {
                citasDia.add(c);
            }
        }
        return citasDia;
    }

    /**
     * Registra un nuevo cliente en el sistema
     *
     * @param cliente Cliente a registrar
     */
    public void registrarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    /**
     * Registra un nuevo peluquero en el sistema
     *
     * @param peluquero Peluquero a registrar
     */
    public void registrarPeluquero(Peluquero peluquero) {
        peluqueros.add(peluquero);
    }

    /**
     * Obtiene la lista de clientes registrados
     *
     * @return Lista de clientes
     */
    public List<Cliente> getClientes() {
        return clientes;
    }

    /**
     * Obtiene la lista de peluqueros registrados
     *
     * @return Lista de peluqueros
     */
    public List<Peluquero> getPeluqueros() {
        return peluqueros;
    }

    public List<Cita> buscarCitasPorPeluquero(Peluquero peluquero) {
        List<Cita> citasPeluquero = new ArrayList<>();
        for (Cita cita : citas) {
            if (cita.getPeluquero().equals(peluquero)) {
                citasPeluquero.add(cita);
            }
        }
        return citasPeluquero;
    }
}
