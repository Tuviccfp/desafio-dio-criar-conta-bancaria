package org.desafio;

import org.desafio.entities.Conta;

import java.util.Scanner;

public class Program {
    public static void mainFunction(Scanner scanner) {
        System.out.println("Registre uma nova conta: \n");
        System.out.print("Digite a agência: ");
        int agencia = scanner.nextInt();
        System.out.print("Digite a conta: ");
        String numConta = scanner.next();
        System.out.println("Digite o nome do conta: ");
        String nomeCliente = scanner.next();

        Conta newConta = new Conta(agencia, nomeCliente, numConta);
        System.out.println("Deseja adicionar um novo saldo na conta?");
        scanner.nextLine();
        boolean adicionarNovoSaldo = scanner.nextBoolean();
        if (adicionarNovoSaldo) {
            System.out.print("Informe o valor a ser adicionado: ");
            float newValor = scanner.nextFloat();
            newConta.adicionarSaldo(newValor);
            System.out.println("Exibindo os novos dados atualizados...");
            System.out.println(newConta.toString());
        } else {
            System.out.println("Nenhum valor será adicionado.. Exibindo os dados da conta...");
            System.out.println(newConta.toString());
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        mainFunction(scanner);

        scanner.close();
    }
}