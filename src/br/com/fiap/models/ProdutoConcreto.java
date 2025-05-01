// Erik Naoki Miyasato RM: 565771
// João Henrrique Batista Leal RM: 564361
// Categoria: Televisão e Eletrônicos

package br.com.fiap.models;

public class ProdutoConcreto extends Produto {
    @Override
    public double calcularTotal() {
        // Aqui assumimos que o enum QuantidadeProdutoEnum possui um método getValor()
        // que retorna a quantidade como um int.
        int quantidade = getQuantidadeProduto().getValor();
        // Utiliza o método auxiliar definido na classe abstrata para calcular o total.
        return calcularTotal(getPrecoProduto(), quantidade, isGarantiaExtendida());
    }
}