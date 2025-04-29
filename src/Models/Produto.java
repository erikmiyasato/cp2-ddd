package Models;

public class Produto {
    private String nome;
    private Fabricante fabricante;
    private double preco;
    private int garantia;

    public Produto(String nome, Fabricante fabricante, double preco, int garantia) {
        this.nome = nome;
        this.fabricante = fabricante;
        this.preco = preco;
        this.garantia = garantia;
    }
    public void exibirDetalhes(){
        System.out.println("Produto: " + nome);
        System.out.println("Fabricante: " + fabricante);
        System.out.println("Preco: R$" + preco);
        System.out.println("Garantia: " + garantia + "meses");
    }
}
