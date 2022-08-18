package com.solvers.apppresentacion;

public class Teammate {
    private final String nombreApellido;
    private final int edad;
    private final String ocupacion;
    private final String hobby;

    // public Teammate() {}

    public Teammate(String nombreApellido, int edad, String ocupacion, String hobby) {
        this.nombreApellido = nombreApellido;
        this.edad = edad;
        this.ocupacion = ocupacion;
        this.hobby = hobby;
    }

    public String getNombreApellido() {
        return nombreApellido;
    }

    /* public void setNombreApellido(String nombreApellido) {
        this.nombreApellido = nombreApellido;
     } */

    public int getEdad() {
        return edad;
    }

    /*public void setEdad(int edad) {
        this.edad = edad;
    } */

    public String getOcupacion() {
        return ocupacion;
    }

    /* public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    } */

    public String getHobby() {
        return hobby;
    }

    /* public void setHobby(String hobby) {
        this.hobby = hobby;
    } */
}
