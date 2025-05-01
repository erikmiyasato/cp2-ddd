// Erik Naoki Miyasato RM: 565771
// João Henrrique Batista Leal RM: 564361
// Categoria: Televisão e Eletrônicos

package br.com.fiap.models;

public class ProdutoConcreto extends Produto {
    @Override
    public double calcularTotal() {

        int quantidade = getQuantidadeProduto().getValor();

        return calcularTotal(getPrecoProduto(), quantidade, isGarantiaExtendida());
    }
}