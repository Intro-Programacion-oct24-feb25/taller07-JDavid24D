/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema04;

/**
 *
 * @author jorge
 */
public class Problema04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int denominador = 3;
        int limite = 7;
        int contador = 1;
        double resultado = 0.0;
        
         while (contador < limite) {
            if (contador % 2 == 0) {

                System.out.println("+ 1/" + denominador + " ");
                resultado +=  1.0 / denominador;

            } else {

                System.out.print("- 1/" + denominador + " ");
                resultado -=  1.0 / denominador;
            }

            denominador = denominador + 2;
            contador = contador + 1;
        }

        System.out.println("\nResultado de serie: " + resultado);
        
                
    }
    
}
