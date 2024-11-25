/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema1;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author jorge
 */
public class Problema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        String nombre;
        String posicion;
        String cadena = "";
        String salida;
        String cadenaEdades = "";
        
        int edad;
        int contador = 0;
        int edades = 0;
        
        double estatura;
        double estaturas = 0;
        double promE;
        double promEs;
                
        boolean bandera = true;
        
        
        while (bandera){
            System.out.println("Ingrese el nombre del jugador");
            nombre = entrada.nextLine();
            
            System.out.println("Ingrese la posicion del jugador");
            posicion = entrada.nextLine();
            
            System.out.println("Ingrese la edad del jugador");
            edad = entrada.nextInt();
            
            System.out.println("Ingrese la estatura del jugador");
            estatura = entrada.nextDouble();
            
            contador = contador + 1;
            
            cadena = String.format("%s%d %s -%s-, edad:%d, estatura %.2f\n",
                    cadena, contador, nombre, posicion, edad, estatura);
            
            edades = edades + edad;
            estaturas = estaturas + estatura;
            entrada.nextLine();
            
            System.out.println("Ingrese ´SI´ si deseas continuar, "
                    + "caso contrario ingrese ´NO´");
            salida = entrada.nextLine();
            cadenaEdades = String.format("%s\n%s",cadenaEdades, edad);
            
            if(salida.equals("NO")) {
                bandera = false;
                
            }
            
                        
        }
        promE = edades / contador;
            promEs = estaturas / contador;
            
            System.out.printf("Listado de Jugadores\n%sListado de Edades"
                    + "%s\nPromedio de edades: %.1f\nPromedio de estaturas: %.1f\n",
                    cadena, cadenaEdades, promE, promEs);

       
        // TODO code application logic here
    }
    
}
