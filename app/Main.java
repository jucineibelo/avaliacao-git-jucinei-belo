package app;

import service.Calculadora;

public class Main {
    public static void main(String[] args) {
        System.out.println("Avaliação Git com Java");

        Calculadora calculadora = new Calculadora();
        calculadora.setNumero1(5.3);
        calculadora.setNumero2(10.1);
        System.out.println("multiplicação: " + calculadora.multiplicacao());
        System.out.println("soma: " + calculadora.soma());

    }
}
