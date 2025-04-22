package com.peluqueria.steps;

import com.peluqueria.*;
import io.cucumber.java.en.*;
import java.time.*;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class BuscarCitasSteps {
    private GestorCitas gestor = new GestorCitas();
    private Peluquero peluquero;
    private List<Cita> citasEncontradas;

    @Given("Existe un peluquero registrado {string} con teléfono {string}")
    public void registrarPeluquero(String nombre, String telefono) {
        peluquero = new Peluquero(1, nombre, telefono);
        gestor.registrarPeluquero(peluquero);
    }

    @Given("Existe una cita para {string} con {string} el {string} a las {string}")
    public void añadirCita(String nombreCliente, String nombrePeluquero, String fecha, String hora) {
        Cliente cliente = new Cliente(1, nombreCliente, "123456789");
        gestor.registrarCliente(cliente);
        Cita cita = new Cita(
                LocalDate.parse(fecha),
                LocalTime.parse(hora),
                cliente,
                peluquero
        );
        gestor.añadirCita(cita);
    }

    @When("Busco las citas del peluquero {string}")
    public void buscarCitasPorPeluquero(String nombrePeluquero) {
        citasEncontradas = gestor.buscarCitasPorPeluquero(peluquero);
    }

    @Then("Debo obtener {int} citas")
    public void verificarCantidadCitas(int cantidad) {
        assertEquals(cantidad, citasEncontradas.size());
    }

    @Then("La primera cita debe ser para {string}")
    public void verificarPrimeraCita(String nombreCliente) {
        assertEquals(nombreCliente, citasEncontradas.get(0).getCliente().getNombre());
    }
}