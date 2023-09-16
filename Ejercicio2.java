/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package labpooisem5;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author Alumno
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        double num;
        double promedioNums;
        double sumNums = 0.0;
        int contador = 0;
        
        
        
        try{
        while(true){
            System.out.print("Ingrese un número (Si no, ingresa -1 para terminar): ");
            num = in.nextInt();
            sumNums += num;
            contador++;
            if (num > 0){
                continue;
            }else{
                break;
            }

        }
        
        promedioNums = sumNums/contador;
                
        System.out.println("La suma de los numeros es : " + sumNums);
        System.out.println("El promedio de los numeros es : " + promedioNums);

        }catch(InputMismatchException e){
            System.out.print("No introdujo un número");
        }
    }
    
}
