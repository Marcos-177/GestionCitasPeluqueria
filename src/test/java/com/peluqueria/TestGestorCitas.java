package com.peluqueria;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.time.LocalTime;

public class TestGestorCitas {

    @Test
    public void testAñadirCitaSinConflicto() {
        GestorCitas gestor = new GestorCitas();
        Cliente cliente = new Cliente(1, "Ana", "555-1234");
        Peluquero peluquero = new Peluquero(1, "Juan", "555-5678");
        Cita cita = new Cita(LocalDate.now(), LocalTime.of(10, 0), cliente, peluquero);

        assertTrue(gestor.añadirCita(cita));
    }

 /*   @Test
    public void testAñadirCitaConConflicto() {
        GestorCitas gestor = new GestorCitas();
        Cliente cliente = new Cliente(1, "Ana", "555-1234");
        Peluquero peluquero = new Peluquero(1, "Juan", "555-5678");
        Cita cita1 = new Cita(LocalDate.now(), LocalTime.of(10, 0), cliente, peluquero);
        Cita cita2 = new Cita(LocalDate.now(), LocalTime.of(10, 0), cliente, peluquero);

        gestor.añadirCita(cita1);
        assertFalse(gestor.añadirCita(cita2)); // Debe fallar
    }*/



}