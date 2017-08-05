/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem1;

import java.util.Scanner;

/**
 *
 * @author Bryan Lopez Avila
 */
public class Problem1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int test, number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de test: ");
        test = sc.nextInt();
        
        for (int i = 1; i <= test; i++) {
            System.out.println("Ingrese el número: ");
            number = sc.nextInt();
            
            Problem1 p1 = new Problem1();
            System.out.println("bits es: " + p1.setBits(number));
        }
    }
    
    /*
    * Función encargada de la operación bit a bit
    */
    public int setBits(int number){
        int count = 0;
        
        while(number != 0){
            number &= (number - 1);
            count++;
        }
        
        return count;
    }
}
