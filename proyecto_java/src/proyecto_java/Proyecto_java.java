/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_java;

import java.util.Scanner;

/**
 *
 * @author Nolasco
 */
public class Proyecto_java {

   public static void main(String[] args) {
    
   Scanner leer = new Scanner(System.in);
   double numero1, numero2, M;
    
        System.out.println("----MULTIPLICACION-----");
        
        System.out.println("Digite su primer valor");
        numero1 = leer.nextDouble();
        
         System.out.println("Digite su segundo valor");
        numero2 = leer.nextDouble();
        
        M = numero1 * numero2;
        
        System.out.println("-----------------------");
        System.out.println("Resultado" + M);
        System.out.println("-----------------------");
        
   
   }
    
}
