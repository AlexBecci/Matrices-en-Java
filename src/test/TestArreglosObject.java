package test;

import domain.Persona;

public class TestArreglosObject {

    public static void main(String[] args) {

        Persona personas[] = new Persona[2];

        personas[0] = new Persona("Alex");

        personas[1] = new Persona("Lourdes");

        //    System.out.println("personas 0 = " + personas[0]);
        //   System.out.println("personas 1 = " + personas[1]);   
        for (int i = 0; i < personas.length; i++) {
            System.out.println("personas " + i + "=" + personas[i]);
        }

        //Sintaxis resumida 
        String frutas[] = {"Manzana", "Banana", "Uva", "Naranja", "Pera"};
        for (int i = 0; i < frutas.length; i++) {
            System.out.println("Frutas = " + frutas[i]);
        }
        
        //Prueba de sintaxis con tipo Object
        Persona jefe = new Persona("JEFE");
        Persona prueba = new Persona("Limpieza");

        Persona empleados[] = {jefe, prueba};
        for (int i = 0; i < empleados.length; i++) {
            System.out.println("Empleados = " + empleados[i]);
        }

    }
}
