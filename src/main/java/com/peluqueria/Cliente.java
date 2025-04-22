package com.peluqueria;

/**
 * Representa un cliente de la peluquería.
 * Almacena información básica como ID, nombre y teléfono.
 */
public class Cliente {
    private int id;
    private String nombre;
    private String telefono;

    /**
     * Constructor para crear un cliente
     * @param id Identificador único del cliente
     * @param nombre Nombre completo del cliente
     * @param telefono Teléfono de contacto
     */
    public Cliente(int id, String nombre, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    /** @return ID del cliente */
    public int getId() { return id; }

    /** @return Nombre del cliente */
    public String getNombre() { return nombre; }

    /** @return Teléfono del cliente */
    public String getTelefono() { return telefono; }
}