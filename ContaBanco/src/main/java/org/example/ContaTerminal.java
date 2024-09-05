package org.example;
import java.util.Scanner;

public class ContaTerminal {
    public int numeroConta;
    public String agencia;
    public String nome;
    public float saldo;

    public void registrarConta(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá bem vindo ao Banco X!");
        System.out.println("Para o cadastro digite o número da conta: ");
        numeroConta = scanner.nextInt();

        scanner.nextLine();

        System.out.println("A agência: ");
        agencia = scanner.next();

        System.out.println("Seu primeiro nome: ");
        nome = scanner.next();

        System.out.println("Informe o saldo inicial: ");
        saldo = scanner.nextFloat();

        System.out.println("Obrigado, só isso já basta!");
    }

    @Override
    public String toString() {
        return "\nConta Corrente\n" +
                "Nome: " + nome + "\n" +
                "Agência: " + agencia + "\n" +
                "Número da Conta: " + numeroConta + "\n" +
                "Saldo: R$ " + String.format("%.2f", saldo);
    }
}
