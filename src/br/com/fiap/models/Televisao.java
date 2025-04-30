package br.com.fiap.models;

import br.com.fiap.enums.Quantidade;
import br.com.fiap.enums.TipoPainel;

public class Televisao extends Produto {
    private TipoPainel tipoPainel;
    private String field;

    public Televisao(String nomeProduto, Fabricante fabricanteProduto, double avaliacaoProduto, Quantidade quantidade, boolean garantiaExtendida) {
        super(nomeProduto, fabricanteProduto, avaliacaoProduto, quantidade, garantiaExtendida);
    }

    public TipoPainel getTipoPainel() {
        return tipoPainel;
    }

    public void setTipoPainel(TipoPainel tipoPainel) {
        this.tipoPainel = tipoPainel;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }
}