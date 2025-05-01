// Erik Naoki Miyasato RM: 565771
// João Henrrique Batista Leal RM: 564361
// Categoria: Televisão e Eletrônicos

package br.com.fiap.models;

import br.com.fiap.enums.QuantidadeProdutoEnum;
import br.com.fiap.enums.VariedadeProdutoEnum;

public abstract class Produto {

    private String nomeProduto;
    private String fabricanteProduto;
    private double precoProduto;
    private String descricaoProduto;
    private VariedadeProdutoEnum variedadeProduto;
    private QuantidadeProdutoEnum quantidadeProduto;
    private boolean garantiaExtendida;

    // Método auxiliar se necessário (pode ser usado internamente ou removido)
    public double calcularTotal(double preco, int quantidade, boolean garantiaExtendida) {
        double total = preco * quantidade;
        if (garantiaExtendida) {
            total += preco * 0.065;
        }
        return total;
    }

    // Método abstrato para que cada subclasse implemente sua própria lógica de cálculo
    public abstract double calcularTotal();

    public void exibirProduto() {
        System.out.println("=== Detalhes do Produto ===");
        System.out.println("Nome: " + nomeProduto);
        System.out.printf("Preço: R$ %.2f%n", precoProduto);
        System.out.println("Quantidade: " + quantidadeProduto);
        System.out.println("Garantia Estendida: " + (garantiaExtendida ? "Sim" : "Não"));
        System.out.printf("Total: R$ %.2f%n", calcularTotal());
        System.out.println();
    }

    // Getters e Setters

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getFabricanteProduto() {
        return fabricanteProduto;
    }

    public void setFabricanteProduto(String fabricanteProduto) {
        this.fabricanteProduto = fabricanteProduto;
    }

    public double getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(double precoProduto) {
        this.precoProduto = precoProduto;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

    public VariedadeProdutoEnum getVariedadeProduto() {
        return variedadeProduto;
    }

    public void setVariedadeProduto(VariedadeProdutoEnum variedadeProduto) {
        this.variedadeProduto = variedadeProduto;
    }

    public QuantidadeProdutoEnum getQuantidadeProduto() {
        return quantidadeProduto;
    }

    public void setQuantidadeProduto(QuantidadeProdutoEnum quantidadeProduto) {
        this.quantidadeProduto = quantidadeProduto;
    }

    public boolean isGarantiaExtendida() {
        return garantiaExtendida;
    }

    public void setGarantiaExtendida(boolean garantiaExtendida) {
        this.garantiaExtendida = garantiaExtendida;
    }
}