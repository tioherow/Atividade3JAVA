package org.example;

import java.util.Scanner;

public class Executavel {
    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
       System.out.println("Digite um numero: ");
        int numero = sc.nextInt();



        FizzBuzz fizzBuzz = new FizzBuzz(numero);
        fizzBuzz.ehDivisivelpor3e5();


    }
}
