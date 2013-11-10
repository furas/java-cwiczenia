/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;
        
/**
 *
 * @author furas@tlen.pl
 */
public class Calkowanie {

    public static double calkowanie_tapezowe(double a, double b, double c, double x1, double x2) {
        
        double dokladnosc = 0.00001;

        double wynik = 0;

        for(double x = x1+dokladnosc ; x < x2 ; x += dokladnosc) {
            wynik += a*x*x + b*x + c;
        }

        wynik += ((a*x1*x1 + b*x1 + c) + (a*x1*x1 + b*x1 + c)) / 2;

        wynik *= dokladnosc;
        
        return wynik;
    }
           
    public static double calkowanie(double a, double b, double c, double x1, double x2) {
        return (a*x2*x2*x2/3 + b*x2*x2/2 + c*x2) - (a*x1*x1*x1/3 + b*x1*x1/2 + c*x1);
    }
            
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Scanner sc = new Scanner(System.in);
         
         double a = sc.nextDouble();
         double b = sc.nextDouble();
         double c = sc.nextDouble();
         
         double x1 = sc.nextDouble();
         double x2 = sc.nextDouble();
         
         //System.out.printf("%.4f\n", calkowanie_tapezowe(a, b, c, x1, x2));
         System.out.printf("%.4f\n", calkowanie(a, b, c, x1, x2));
    }
}
