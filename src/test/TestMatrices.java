package test;

import domain.Persona;

public class TestMatrices {

    public static void main(String[] args) {
        //El primer [] maneja los renglones.
        //El segundo [] maneja las columnas

        //Declarando una matriz
        int edades[][] = new int[3][2];
        System.out.println("edades = " + edades);

        edades[0][0] = 5;
        edades[0][1] = 7;
        edades[1][0] = 12;
        edades[1][1] = 3;
        edades[2][0] = 200;
        edades[2][1] = 140;

        //Mostrando por pantalla
        System.out.println("edades 0-0 = " + edades[0][0]);
        System.out.println("edades 0-1 = " + edades[0][1]);
        System.out.println("edades 1-0 = " + edades[1][0]);
        System.out.println("edades 1-1 = " + edades[1][1]);
        System.out.println("edades 2-0 = " + edades[2][0]);
        System.out.println("edades 2-1 = " + edades[2][1]);

        //Mostrando por pantalla mediante for
        System.out.println("MEDIANTE FOR ANIDADO");
        //Iterando un for anidado
        imprimirConInt(edades);

        System.out.println("\n\nCiclo For anidado de array frutas");
        String frutas[][] = {{"Naranja", "Limon"}, {"Fresa", "Zarzamora", "Mora"}};

        imprimir(frutas);

        Persona personas[][] = new Persona[2][3];
        personas[0][0] = new Persona("Alex");
        personas[0][1] = new Persona("Lourdes");
        personas[0][2] = new Persona("Maximiliano");
        personas[1][0] = new Persona("Messi");
        personas[1][1] = new Persona("Bastian");
        personas[1][2] = new Persona("Santiqui");

        imprimir(personas);
    }

    //Utilizando un metodo para ahorrar lineas de codigo
    public static void imprimir(Object matriz[][]) {
        for (int ren = 0; ren < matriz.length; ren++) {
            for (int col = 0; col < matriz[ren].length; col++) {
                System.out.println("matriz " + ren + "-" + col + ": " + matriz[ren][col]);
            }
        }
    }

    public static void imprimirConInt(int matriz[][]) {
        for (int ren = 0; ren < matriz.length; ren++) {
            for (int col = 0; col < matriz[ren].length; col++) {
                System.out.println("matriz " + ren + "-" + col + ": " + matriz[ren][col]);
            }
        }
    }
}
