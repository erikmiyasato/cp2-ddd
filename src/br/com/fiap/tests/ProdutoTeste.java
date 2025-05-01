// Erik Naoki Miyasato RM: 565771
// João Henrrique Batista Leal RM: 564361
// Categoria: Televisão e Eletrônicos

package br.com.fiap.tests;

import java.util.Scanner;

import br.com.fiap.models.Produto;
import br.com.fiap.models.ProdutoConcreto;
import br.com.fiap.models.Televisao;
import br.com.fiap.models.Camera;
import br.com.fiap.enums.QuantidadeProdutoEnum;
import br.com.fiap.enums.VariedadeProdutoEnum;
import br.com.fiap.enums.TipoPainelEnum;

public class ProdutoTeste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Produto produto = cadastrarProduto(scanner);

        boolean encerrarPrograma = false;
        while (!encerrarPrograma) {
            System.out.println("=== Menu Principal ===");
            System.out.println("1 - Exibir Produto");
            System.out.println("2 - Calcular Total");
            System.out.println("3 - Alterar Garantia Estendida");
            System.out.println("4 - Registrar Novo Produto");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");
            String opcao = scanner.nextLine();
            System.out.println();

            switch (opcao) {
                case "1":
                    produto.exibirProduto();
                    break;
                case "2":
                    System.out.printf("Total a pagar: R$ %.2f%n", produto.calcularTotal());
                    break;
                case "3":
                    System.out.print("Deseja ativar a garantia estendida? (S/N): ");
                    String input = scanner.nextLine().trim().toUpperCase();
                    if (input.equals("S")) {
                        produto.setGarantiaExtendida(true);
                    } else if (input.equals("N")) {
                        produto.setGarantiaExtendida(false);
                    } else {
                        System.out.println("Opção inválida. Mantendo o valor atual da garantia.");
                    }
                    break;
                case "4":
                    produto = cadastrarProduto(scanner);
                    break;
                case "5":
                    encerrarPrograma = true;
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
            System.out.println();
        }

        scanner.close();
    }

    public static Produto cadastrarProduto(Scanner scanner) {
        System.out.println("=== Registro de Produto ===");

        System.out.println("Escolha a categoria do produto:");
        VariedadeProdutoEnum[] categorias = VariedadeProdutoEnum.values();
        for (int i = 0; i < categorias.length; i++) {
            System.out.println((i + 1) + " - " + categorias[i].name());
        }
        int opcaoCategoria = 0;
        try {
            opcaoCategoria = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Opção inválida! Selecionando a primeira categoria por padrão.");
            opcaoCategoria = 1;
        }
        VariedadeProdutoEnum categoria;
        if (opcaoCategoria < 1 || opcaoCategoria > categorias.length) {
            System.out.println("Opção inválida. Selecionando a primeira categoria por padrão.");
            categoria = categorias[0];
        } else {
            categoria = categorias[opcaoCategoria - 1];
        }

        System.out.print("Digite o nome do produto: ");
        String nomeProduto = scanner.nextLine();

        System.out.print("Digite o fabricante do produto: ");
        String fabricanteProduto = scanner.nextLine();

        System.out.print("Digite o preço do produto: ");
        double precoProduto = 0.0;
        try {
            precoProduto = Double.parseDouble(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Preço inválido! Usando 0.0 como padrão.");
        }

        System.out.print("Digite a quantidade do produto (1 a 10): ");
        int qtdInput = 0;
        try {
            qtdInput = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Quantidade inválida! Usando 1 como padrão.");
            qtdInput = 1;
        }
        QuantidadeProdutoEnum quantidadeProduto = null;
        for (QuantidadeProdutoEnum q : QuantidadeProdutoEnum.values()) {
            if (q.getValor() == qtdInput) {
                quantidadeProduto = q;
                break;
            }
        }
        if (quantidadeProduto == null) {
            System.out.println("Quantidade não encontrada. Usando 1 como padrão.");
            for (QuantidadeProdutoEnum q : QuantidadeProdutoEnum.values()) {
                if (q.getValor() == 1) {
                    quantidadeProduto = q;
                    break;
                }
            }
        }

        System.out.print("Deseja ativar a garantia estendida? (S/N): ");
        String garantiaInput = scanner.nextLine().trim().toUpperCase();
        boolean garantiaExtendida = garantiaInput.equals("S");


        Produto produto;
        switch (categoria) {
            case TELEVISAO:
                Televisao tv = new Televisao();
                System.out.println("Escolha o tipo de painel:");
                TipoPainelEnum[] tipos = TipoPainelEnum.values();
                for (int i = 0; i < tipos.length; i++) {
                    System.out.println((i + 1) + " - " + tipos[i].name());
                }
                int painelOpcao = 1;
                try {
                    painelOpcao = Integer.parseInt(scanner.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Opção inválida! Usando o primeiro tipo.");
                }
                TipoPainelEnum tipoPainel = tipos[Math.max(0, Math.min(painelOpcao - 1, tipos.length - 1))];
                tv.setTipoPainel(tipoPainel);
                produto = tv;
                break;
            case CAMERA:
                Camera camera = new Camera();
                System.out.print("Digite a quantidade de megapixels da câmera: ");
                int mp = 0;
                try {
                    mp = Integer.parseInt(scanner.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Valor inválido! Usando 12MP como padrão.");
                    mp = 12;
                }
                camera.setMegapixels(mp);
                produto = camera;
                break;
            default:
                produto = new ProdutoConcreto();
        }

        produto.setVariedadeProduto(categoria);
        produto.setNomeProduto(nomeProduto);
        produto.setFabricanteProduto(fabricanteProduto);
        produto.setPrecoProduto(precoProduto);
        produto.setQuantidadeProduto(quantidadeProduto);
        produto.setGarantiaExtendida(garantiaExtendida);

        System.out.println("Produto registrado com sucesso!\n");
        return produto;
    }
}