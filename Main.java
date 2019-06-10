/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import java.util.Scanner;
/**
 *
 * @author Printer
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        int n = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        try {
            n = in.nextInt();
        } catch (Exception e) {
            System.out.println("Введено неверное значение.");
            System.out.println(e.getMessage());
        }
        if (n < 0) {
            n *= -1;
        }
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n = n / 10;
        }
        System.out.println("Сумма цифр: " + sum);
        in.close();
    }
   
}
