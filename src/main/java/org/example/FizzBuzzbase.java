package org.example;


public abstract class FizzBuzzbase {
    protected int numero;


    public FizzBuzzbase(int numero) {
        this.numero = numero;
    }


    public abstract void ehDivisivelpor3e5();


    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
