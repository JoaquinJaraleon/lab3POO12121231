/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ivann
 */
public class Ejercicio3DoWhile {
    public static void main(String[] args) {
         
        int i = 0;
do {
    int x = 2 * i - 10;
    if (x < 0)
        x = (-1) * x;
    System.out.println(x + " ");
    i++;
} while (i < 10);
        }
            
        
    }

