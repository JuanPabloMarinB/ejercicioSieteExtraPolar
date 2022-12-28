package Servicios;

import Entidades.SanaKlos;

import java.util.Scanner;

public class SanaKlosServicios {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    SanaKlos s1 = new SanaKlos();
    public SanaKlos crearSaludo(){

        System.out.println("Ingresa tu nombre");
        s1.setNombre(sc.next().toUpperCase());

        generarSaludo();

        return s1;

    }

    public void generarSaludo(){

        s1.setSaludo("JO JO JO, FELIZ NAVIDAD " + s1.getNombre() + " :D");

        System.out.println(s1.getSaludo());
        System.out.println("Hasta la próxima");

    }

}
