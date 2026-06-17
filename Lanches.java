package MiniHamburgueria;

public class Lanches implements Vendavel{

    private String nome;
    private double precoBase;
    private double valorAdicional;

    public Lanches(String nome, double precoBase, double valorAdicional) {
        this.nome = nome;
        this.precoBase = precoBase;
        this.valorAdicional = valorAdicional;
    }

    public String getNome() {
        return this.nome;
    }

    public double getPrecoBase() {
        return this.precoBase;
    }

    public double getValorAdicional() {
        return this.valorAdicional;
    }

    @Override
    public double calcularPrecoFinal() {
        return (precoBase + valorAdicional) * 1.10;
    }
}
