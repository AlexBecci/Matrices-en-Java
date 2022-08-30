package test;

public class TestArreglos {

    public static void main(String[] args) {
        
        int edades[] = new int[3];
        System.out.println("edades = " + edades);
        
        //Accediendo a un elemento del array el indice 0
        edades[0]= 10;
        System.out.println("Edades 0: "+ edades[0]);
        //Accediendo a un elemento del array el indice 1
        edades[1]= 20;
        System.out.println("Edades 1: "+ edades[1]);
        //Accediendo a un elemento del array el indice 2
        edades[2]= 30;
        System.out.println("Edades 2: "+ edades[2]);
        
        //edades[3] = 5;//Error en tiempo de ejecucion ya que el array tiene 3 elementos y el indice 3 queda fuera del mismo
        
        for(int i = 0; i<edades.length;i++)
        {
            System.out.println("Edades elementos: " + i + ": "+edades[i]);
        }
        
        
    }

}
