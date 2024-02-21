package com_acme;

import java.util.Scanner;

public class Mensaje {
    public String solicitaDatos(String mensaje){
        System.out.println(mensaje);
        Scanner teclado = new Scanner(System.in);
        return teclado.nextLine();
    }

    public void saludar(String nombre){
        System.out.println("Hola %s, bienvenido a Java \n" + nombre);
    }
}
