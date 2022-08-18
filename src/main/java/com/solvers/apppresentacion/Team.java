package com.solvers.apppresentacion;

public class Team {

    public static void main(String[] args) {
        System.out.println("Este es el equipo de trabajo Solvers");
        System.out.println();

        Teammate James = new Teammate("James Córdoba", 41, "Profesor", "Hacer música");
        Teammate Jenifer = new Teammate("Jenifer Vasquez Hernandez", 38, "Analista de calidad", "Leer");

        System.out.println(James.getNombreApellido() + ", " + James.getEdad() + "años. ");
        System.out.println("Ocupación: " + James.getOcupacion() + "\nHobby: " + James.getHobby() + "\n----------------------- \n");

        System.out.println(Jenifer.getNombreApellido() + ", " + Jenifer.getEdad() + "años. ");
        System.out.println("Ocupación: " + Jenifer.getOcupacion() + "\nHobby: " + Jenifer.getHobby() + "\n----------------------- \n");

    }
}