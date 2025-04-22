package com.peluqueria;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        GestorCitas gestor = new GestorCitas();

        // Ejemplo de registro
        Cliente cliente1 = new Cliente(1, "Ana", "123456789");
        Peluquero peluquero1 = new Peluquero(1, "Juan", "987654321");
        Cita cita = new Cita(LocalDate.now(), LocalTime.of(10, 0), cliente1, peluquero1);
        List<Cita> listaCitas;

        gestor.registrarCliente(cliente1);
        gestor.registrarPeluquero(peluquero1);
        gestor.añadirCita(cita);
        listaCitas = gestor.obtenerCitasPorDia(LocalDate.now());
        for (Cita c : listaCitas) {
            System.out.println("Cita: " + c);
        }

    }
}