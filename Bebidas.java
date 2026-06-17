package MiniHamburgueria;

public class Bebidas implements Vendavel{

    private String nome;
    private double precoBase;
    private String tamanho;

    public Bebidas(String nome, double precoBase, String tamanho) {
        this.nome = nome;
        this.precoBase = precoBase;
        this.tamanho = tamanho;
    }
    public String getNome() {
        return nome;
    }

    public double getPrecoBase() {
        return precoBase;
    }

    public String getTamanho() {
        return tamanho;
    }

    @Override
    public double calcularPrecoFinal() {
        return precoBase + 2.00;
    }
}
