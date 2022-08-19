package com.solvers.apppresentacion;

public class Team {


    public static void main(String[] args) {
        System.out.println("++++++++++++++++++++++++++++++++++++++++");
        System.out.println("* Este es el Equipo de Trabajo Solvers *");
        System.out.println("++++++++++++++++++++++++++++++++++++++++");
        System.out.println();

        Teammate James = new Teammate("James Córdoba", 41, "Profesor", "Hacer música");
        Teammate Jenifer = new Teammate("Jenifer Vasquez Hernandez", 38, "Analista de calidad", "Leer");
        Teammate Rafa = new Teammate("Rafael Ahumada", 39, "Ing Sistemas", "Cantar");
        Teammate Rafa = new Teammate("Giovanny Mejia Valdes", 48, "Ing Sistemas", "Musica");

        System.out.println(James.getNombreApellido() + ", " + James.getEdad() + "años. ");
        System.out.println("Ocupación: " + James.getOcupacion() + "\nHobby: " + James.getHobby() + "\n----------------------- \n");
        System.out.println();
        System.out.println(Jenifer.getNombreApellido() + ", " + Jenifer.getEdad() + "años. ");
        System.out.println("Ocupación: " + Jenifer.getOcupacion() + "\nHobby: " + Jenifer.getHobby() + "\n----------------------- \n");
        System.out.println();
        System.out.println(Rafa.getNombreApellido() + ", " + Rafa.getEdad() + "años. ");
        System.out.println("Ocupación: " + Rafa.getOcupacion() + "\nHobby: " + Rafa.getHobby() + "\n----------------------- \n");
        System.out.println();
        System.out.println(Giovanny.getNombreApellido() + ", " + Giovanny.getEdad() + "años. ");
        System.out.println("Ocupación: " + Giovanny.getOcupacion() + "\nHobby: " + Giovanny.getHobby() + "\n----------------------- \n");

    }
}