package org.example;

public class FizzBuzz {
    private int numero;


    public FizzBuzz(int numero) {
        this.numero = numero;
    }



    public int getNumero() {
        return numero;
    }


    public void ehDivisivelpor3e5 () {
        int contaFizzBuzz = 0;
        int contaFizz = 0;
        int contaBuzz = 0;

        int i;
        for (i = 1; i <= numero; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
                       contaFizzBuzz++;
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
                contaFizz++;

            } else if (i % 5 == 0) {
                System.out.println("Buzz");
                contaBuzz++;

            } else {
                System.out.println(i);
            }

        }
        int numerosSemAlteracao = i - contaBuzz - contaFizzBuzz - contaFizz -1;
        int total = numero;
        System.out.println("\nContagem:");
        System.out.println("\nFizz: " + contaFizz);
        System.out.println("Buzz: " + contaBuzz);
        System.out.println("FizzBuzz: " + contaFizzBuzz);
        System.out.println("Numero 'normais': " + numerosSemAlteracao);
        System.out.println("Total': " + total);

    }

}
