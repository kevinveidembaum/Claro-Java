package org.example;

public class Main {
    public static void main(String[] args) {

        ContaTerminal conta = new ContaTerminal();

        conta.registrarConta();
        String string = conta.toString();
        System.out.println(string);
    }
}