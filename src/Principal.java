/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kevin Ortiz
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int aiDatosOrigen[] = new int[5];
        aiDatosOrigen[0]= 10;
        aiDatosOrigen[1]= 20;
        aiDatosOrigen[2]= 30;
        aiDatosOrigen[3]= 40;
        aiDatosOrigen[4]= 50;
        
        //MI "COPIA" DEL ARREGLO
        int aiCopia[];
        aiCopia =  aiDatosOrigen;
        //IMPRIMIR COPIA
        System.out.println("REIMPRIMO LA COPIA");
        for (int i : aiCopia) {
            System.out.println(i);
        }
        //MODIFICO AIDATOSORIGEN
        aiDatosOrigen[2] = 99999;
        //IMPRIMIR COPIA
          System.out.println("REIMPRIMO LA COPIA");
        for (int i : aiCopia) {
            System.out.println(i);
        }
        System.out.println(aiDatosOrigen);
        System.out.println(aiCopia);
        
        
        
    }
    
}
