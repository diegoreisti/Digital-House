public class Boleto60d extends Boleto {

    // Construtor
    public Boleto60d(double valor) {
        super(valor);
        this.juro = 0.1;
        this.desconto = 0.0;
        this.multa = 0.2;
    }
}
