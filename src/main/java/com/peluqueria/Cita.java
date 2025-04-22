package com.peluqueria;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 * Representa una cita agendada en la peluquería
 * Contiene información sobre la fecha, hora, cliente y peluquero asignado
 */
public class Cita {
    private LocalDate fecha;
    private LocalTime hora;
    private Cliente cliente;
    private Peluquero peluquero;

    /**
     * Crea una nueva cita
     *
     * @param fecha     Fecha de la cita
     * @param hora      Hora de la cita
     * @param cliente   Cliente que solicita la cita
     * @param peluquero Peluquero asignado a la cita
     */
    public Cita(LocalDate fecha, LocalTime hora, Cliente cliente, Peluquero peluquero) {
        this.fecha = fecha;
        this.hora = hora;
        this.cliente = cliente;
        this.peluquero = peluquero;
    }

    /**
     * Verifica si la cita está disponible
     * actualmente metodo provisional que siempre devuelve true
     *
     * @return true si la cita está disponible, false en caso contrario
     */
    public boolean verificarDisponibilidad() {
        // Lógica provisional
        return true;
    }

    /**
     * Obtiene la fecha de la cita
     *
     * @return Fecha de la cita
     */
    public LocalDate getFecha() {
        return fecha;
    }

    /**
     * Obtiene la hora de la cita
     *
     * @return Hora de la cita
     */
    public LocalTime getHora() {
        return hora;
    }

    /**
     * Obtiene el cliente que reservó la cita
     *
     * @return Cliente de la cita
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * Obtiene el peluquero asignado a la cita
     *
     * @return Peluquero de la cita
     */
    public Peluquero getPeluquero() {
        return peluquero;
    }

    @Override
    public String toString() {
        return "Fecha: " + fecha + ", Hora: " + hora + ", Cliente: " + cliente.getNombre() + ", Peluquero: " + peluquero.getNombre();
    }
}
