/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablamultiplicar;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class TABLAMULTIPLICAR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner obtenernumero = new Scanner(System.in);
       int numero, i,j;
        System.out.println("INDICA LA TABLA DE MULTIPLICAR =");
        numero=obtenernumero.nextInt();
        
        for(j=1; j<=10; j++){
            System.out.println(numero + " X " + j + " = " + numero*j);
        }
        System.out.println();
    }
    
}
