package com.empresa.gestion.model;

public class Persona {
    // Atributos de la clase Persona
    // Encapsulación 
    // Solo accedidos por la clase
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    } 
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) { // Void es que no retorna nada
        this.nombre = nombre;
    }

    }

