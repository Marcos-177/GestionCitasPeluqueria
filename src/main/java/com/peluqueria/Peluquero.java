package com.peluqueria;

/**
 * Representa a un peluquero
 * Contiene información básica como su ID, nombre y teléfono de contacto
 */
public class Peluquero {
    private int id;
    private String nombre;
    private String telefono;

    /**
     * Crea una nueva instancia de Peluquero
     *
     * @param id       Identificador único del peluquero
     * @param nombre   Nombre del peluquero
     * @param telefono Teléfono de contacto del peluquero
     */
    public Peluquero(int id, String nombre, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    /**
     * Obtiene el nombre del peluquero
     *
     * @return Nombre del peluquero
     */
    public String getNombre() {
        return nombre;
    }
}
