// Erik Naoki Miyasato RM: 565771
// João Henrrique Batista Leal RM: 564361
// Categoria: Televisão e Eletrônicos

package br.com.fiap.enums;

public enum QuantidadeProdutoEnum {
    UM(1),
    DOIS(2),
    TRES(3),
    QUATRO(4),
    CINCO(5),
    SEIS(6),
    SETE(7),
    OITO(8),
    NOVE(9),
    DEZ(10);

    private final int valor;

    QuantidadeProdutoEnum(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }
}


