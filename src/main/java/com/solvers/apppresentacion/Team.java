package com.solvers.apppresentacion;

public class Team {

    public static void main(String[] args) {
        System.out.println("Este es el equipo de trabajo Solvers");
        System.out.println();

        Teammate James = new Teammate("James Córdoba", 41, "Profesor", "Hacer música");

        System.out.println(James.getNombreApellido() + ", " + James.getEdad() + "años. ");
        System.out.println("Ocupación: " + James.getOcupacion() + "\nHobby: " + James.getHobby() + "\n----------------------- \n");


    }

}