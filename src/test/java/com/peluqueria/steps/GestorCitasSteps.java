package com.peluqueria.steps;

import com.peluqueria.*;
import io.cucumber.java.en.*;

import java.time.LocalDate;
import java.time.LocalTime;
import static org.junit.jupiter.api.Assertions.*;

public class GestorCitasSteps {
    private GestorCitas gestor = new GestorCitas();
    private Cliente cliente;
    private Peluquero peluquero;
    private boolean resultado;

    @Given("Un cliente registrado {string} con teléfono {string}")
    public void registrarCliente(String nombre, String telefono) {
        cliente = new Cliente(1, nombre, telefono);
        gestor.registrarCliente(cliente);
    }

    @Given("Un peluquero registrado {string} con teléfono {string}")
    public void registrarPeluquero(String nombre, String telefono) {
        peluquero = new Peluquero(1, nombre, telefono);
        gestor.registrarPeluquero(peluquero);
    }

    @When("Añado una cita para {string} con {string} el {string} a las {string}")
    public void añadirCita(String nombreCliente, String nombrePeluquero, String fecha, String hora) {
        Cita cita = new Cita(
                LocalDate.parse(fecha),
                LocalTime.parse(hora),
                cliente,
                peluquero
        );
        resultado = gestor.añadirCita(cita);
    }

    @Then("La cita se añade correctamente")
    public void verificarCitaAñadida() {
        assertTrue(resultado);
    }

    @Then("El sistema muestra {int} cita para el día {string}")
    public void verificarCitasDia(int cantidad, String fecha) {
        assertEquals(cantidad, gestor.obtenerCitasPorDia(LocalDate.parse(fecha)).size());
    }
}