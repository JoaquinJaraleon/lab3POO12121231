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
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int num;
        
        System.out.print("Ingrese el número : ");
        try{
            
        num = in.nextInt();
        
        for (int i = 1 ; i <= 10 ; i++){
            System.out.println(num + " x " + i + " = " + num*i);  
        }

        }catch(InputMismatchException e){
            System.out.print("No introdujo un número");
        }
        
       
        
        
    }
    
}
