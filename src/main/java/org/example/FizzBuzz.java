package org.example;

public class FizzBuzz extends FizzBuzzbase {


    public FizzBuzz(int numero) {
        super(numero);
    }



    @Override
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
        System.out.println("\nFizz: " + contaFizz +" vezes repetidas ");
        System.out.println("Buzz: " + contaBuzz+" vezes repetidas ");
        System.out.println("FizzBuzz: " + contaFizzBuzz+" vezes repetidas ");
        System.out.println("Numero 'normais': " + numerosSemAlteracao+" vezes repetidas ");
        System.out.println("Total': " + total);

    }

}
