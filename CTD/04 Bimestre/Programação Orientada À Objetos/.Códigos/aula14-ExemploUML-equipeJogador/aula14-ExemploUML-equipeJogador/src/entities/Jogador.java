package entities;

public class Jogador {
    private int id;
    private int numeroCamisa;
    private String nome;
    private boolean lesionado;
    private boolean titular;

    public Jogador() {
    }

    public Jogador(int id, int numeroCamisa, String nome, boolean lesionado, boolean titular) {
        this.id = id;
        this.numeroCamisa = numeroCamisa;
        this.nome = nome;
        this.lesionado = lesionado;
        this.titular = titular;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumeroCamisa() {
        return numeroCamisa;
    }

    public void setNumeroCamisa(int numeroCamisa) {
        this.numeroCamisa = numeroCamisa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isLesionado() {
        return lesionado;
    }

    public void setLesionado(boolean lesionado) {
        this.lesionado = lesionado;
    }

    public boolean isTitular() {
        return titular;
    }

    public void setTitular(boolean titular) {
        this.titular = titular;
    }

    /*public int compareTo(Jogador o){
        if(this.numeroCamisa < o.numeroCamisa){
            return -1;
        }
        if(this.numeroCamisa > o.numeroCamisa){
            return 1;
        }
        return 0;
    }*/

}
