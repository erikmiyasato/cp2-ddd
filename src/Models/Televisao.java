package Models;

import Enums.TipoPainel;

public class Televisao {
    private TipoPainel tipoPainel;
    private String field;

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