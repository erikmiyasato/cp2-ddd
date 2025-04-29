package Models;

public class Fabricante {
    private final String cnpj;

    public Fabricante(String nome, String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }
}
