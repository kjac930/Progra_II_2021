package Entities;

import java.util.Scanner;

public class course {
    
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese numero: ");
        int num1 =sc.nextInt();
        System.out.println("Ingrese numero: ");
        int num2 = sc.nextInt();
        int resultado = num1 + num2;
        System.out.println("El resultado es: " + resultado);  



    }
}
