/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema02;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author jorge
 */
public class Problema02 {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int numero = 2;
        int incremento = 4;
        int limite = 10;
        int contador = 1;

        System.out.println("Serie numérica:");
        while (contador <= limite) {
            System.out.println(numero);

            numero = numero + incremento;
            incremento = incremento + 2;
            contador = contador + 1;
        }
    

    }
    
}
