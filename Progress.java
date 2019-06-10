/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progress;
import java.util.Scanner;
/**
 *
 * @author Printer
 */
public class Progress {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n=0;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите натуральное число: ");
        try{
            n=in.nextInt();
        }
        catch(Exception e){
            System.out.println("Введено неверное значение.");
            System.out.println(e.getMessage());
        } 
        if (n>0) {
            double sum=0;
            for (int i=1; i<=n; i++){
                sum+=1/(double)i; 
            }
            System.out.println("Sum is "+sum);
        }
        else {
            System.out.println("Неверное значение: "+n);
        }
        in.close();
    }
    
}
