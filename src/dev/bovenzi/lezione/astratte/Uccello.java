package dev.bovenzi.lezione.astratte;

public class Uccello extends Oviparo {
    public Uccello(String nome) {
        super(nome);
    }

    @Override
    public String getCopertura() {
        return "Piume";
    }

    @Override
    public String getMovimento() {
        return "Vola";
    }
}
