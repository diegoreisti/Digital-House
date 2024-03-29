package entities;

public abstract class Item {
    private String nome;

    public Item(String nome) {
        this.nome = nome;
    }

    public abstract double calcularPreco();

    public String getNome() {
        return nome;
    }
}
