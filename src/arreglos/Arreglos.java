/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;
import java.util.*;
/**
 *
 * @author Vera AA
 */
public class Arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner t = new Scanner(System.in);
    int valor = 0;
    int [] arreglo = new int [10];
    for (int i = 0; i<arreglo.length; i++){
        System.out.println("Introducir valor"+(i+1));
        valor = t.nextInt();
        arreglo[i] = valor;
    }
    for (int i:arreglo){
        System.out.println(i+ " ");
    }
    }
}
         