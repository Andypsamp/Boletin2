//introducir datos por teclado//
package boletin0.pkg3;

import java.util.Scanner;


public class Boletin03 {

   
    public static void main(String[] args) {
        float base,altura;
        System.out.println("base : ");
        Scanner dato = new Scanner(System.in);
         base=dato.nextFloat();
         System.out.println("altura : ");
         altura=dato.nextFloat();
         System.out.println("area del triangulo de base=" + base + "altura=" + altura + "area=" + (base*altura)/2);
        
    }
    
}
