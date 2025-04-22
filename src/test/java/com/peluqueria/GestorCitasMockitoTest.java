package com.peluqueria;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;


@ExtendWith(MockitoExtension.class)
public class GestorCitasMockitoTest {

    @Test
    public void testAñadirCitaConMock() {
        // 1. Crear mock de Cita
        Cita citaMock = mock(Cita.class);

        // 2. Configurar el mock
        when(citaMock.verificarDisponibilidad()).thenReturn(true);

        // 3. Probar el GestorCitas
        GestorCitas gestor = new GestorCitas();
        boolean resultado = gestor.añadirCita(citaMock);

        // 4. Verificaciones
        assertTrue(resultado);
        assertEquals(1, gestor.obtenerCitasPorDia(LocalDate.now()).size());

        verify(citaMock, times(1)).verificarDisponibilidad();
    }
}