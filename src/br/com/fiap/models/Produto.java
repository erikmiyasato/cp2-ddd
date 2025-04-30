package br.com.fiap.models;

import br.com.fiap.enums.Quantidade;

public class Produto {
    private String nomeProduto;
    private Fabricante fabricanteProduto;
    private double preco;
    private Quantidade quantidade;
    private boolean garantiaExtendida;

    // Construtor que inicializa todos os atributos
    public Produto(String nomeProduto, Fabricante fabricanteProduto, double preco,
                   Quantidade quantidade, boolean garantiaExtendida) {
        this.nomeProduto = nomeProduto;
        this.fabricanteProduto = fabricanteProduto;
        this.preco = preco;
        this.quantidade = quantidade;
        this.garantiaExtendida = garantiaExtendida;
    }

    // Método para calcular o valor total
    public double calcularValorTotal() {
        double total = this.preco * this.quantidade.getValor();
        if (this.garantiaExtendida) {
            total += total * 0.065; // Adiciona 6,5% ao total caso a garantia seja estendida
        }
        return total;
    }

    // Getters para os atributos (quando necessário)
    public String getNomeProduto() {
        return nomeProduto;
    }

    public Fabricante getFabricanteProduto() {
        return fabricanteProduto;
    }
}