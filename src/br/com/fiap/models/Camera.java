// Erik Naoki Miyasato RM: 565771
// João Henrrique Batista Leal RM: 564361
// Categoria: Televisão e Eletrônicos

package br.com.fiap.models;

public class Camera extends Produto {
    private int megapixels;

    public int getMegapixels() {
        return megapixels;
    }

    public void setMegapixels(int megapixels) {
        this.megapixels = megapixels;
    }

    @Override
    public double calcularTotal() {
        double total = getPrecoProduto() * getQuantidadeProduto().getValor();
        if (isGarantiaExtendida()) total += 250;
        if (megapixels > 24) total += 350;
        return total;
    }

    @Override
    public void exibirProduto() {
        System.out.println("Câmera: " + getNomeProduto());
        System.out.println("Fabricante: " + getFabricanteProduto());
        System.out.println("Megapixels: " + megapixels + "MP");
        System.out.println("Preço: R$ " + getPrecoProduto());
        System.out.println("Quantidade: " + getQuantidadeProduto().getValor());
        System.out.println("Garantia Estendida: " + (isGarantiaExtendida() ? "Sim" : "Não"));
    }
}