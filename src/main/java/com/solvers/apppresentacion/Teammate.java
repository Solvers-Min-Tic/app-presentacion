package com.solvers.apppresentacion;

public class Teammate {
    private final String nombreApellido;
    private final int edad;
    private final String ocupacion;
    private final String hobby;

    public Teammate(String nombreApellido, int edad, String ocupacion, String hobby) {
        this.nombreApellido = nombreApellido;
        this.edad = edad;
        this.ocupacion = ocupacion;
        this.hobby = hobby;
    }

    public String getNombreApellido() {
        return nombreApellido;
    }

    public int getEdad() {
        return edad;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public String getHobby() {
        return hobby;
    }
}
