package Models;

import Enums.Quantidade;

public class Produto {
    private String nomeProduto;
    private Fabricante fabricanteProduto;
    private double avaliacaoProduto;
    private String descricaoProduto;
    private double preco;
    private Quantidade quantidade;
    private boolean garantiaExtendida;

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public Fabricante getFabricanteProduto() {
        return fabricanteProduto;
    }

    public void setFabricanteProduto(Fabricante fabricanteProduto) {
        this.fabricanteProduto = fabricanteProduto;
    }

    public double getAvaliacaoProduto() {
        return avaliacaoProduto;
    }

    public void setAvaliacaoProduto(double avaliacaoProduto) {
        this.avaliacaoProduto = avaliacaoProduto;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Quantidade getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Quantidade quantidade) {
        this.quantidade = quantidade;
    }

    public boolean isGarantiaExtendida() {
        return garantiaExtendida;
    }

    public void setGarantiaExtendida(boolean garantiaExtendida) {
        this.garantiaExtendida = garantiaExtendida;
    }

    public void emissaoNotaFiscal() {
    }

    public Produto(String nomeProduto, Fabricante fabricanteProduto, double avaliacaoProduto,
                   String descricaoProduto, double preco, Quantidade quantidade,
                   boolean garantiaExtendida) {
        this.nomeProduto = nomeProduto;
        this.fabricanteProduto = fabricanteProduto;
        this.avaliacaoProduto = avaliacaoProduto;
        this.descricaoProduto = descricaoProduto;
        this.preco = preco;
        this.quantidade = quantidade;
        this.garantiaExtendida = garantiaExtendida;
    }

}