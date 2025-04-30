package br.com.fiap.tests;

import br.com.fiap.enums.Quantidade;
import br.com.fiap.models.Produto;
import br.com.fiap.models.Fabricante;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do fabricante:");
        String nomeFabricante = scanner.nextLine();

        Fabricante fabricante = new Fabricante();
        fabricante.nome = nomeFabricante;

        System.out.println("Digite o nome do produto:");
        String nomeProduto = scanner.nextLine();

        System.out.println("Digite o preço do produto:");
        double precoProduto = scanner.nextDouble();

        System.out.println("Escolha a quantidade (1 a 10):");
        int quantidadeEscolhida = scanner.nextInt();

        System.out.println("Garantia estendida? (true/false):");
        boolean garantiaExtendida = scanner.nextBoolean();

        // Criando objeto Produto
        Produto produto = new Produto(
                nomeProduto,
                fabricante,
                precoProduto,
                Quantidade.values()[quantidadeEscolhida - 1],
                garantiaExtendida
        );

        // Exibindo informações do Produto
        System.out.println("\nResumo do produto:");
        System.out.println("Nome do produto: " + produto.getNomeProduto());
        System.out.println("Fabricante: " + produto.getFabricanteProduto().nome);
        System.out.println("Valor total: R$ " + produto.calcularValorTotal());

        scanner.close();
    }
}