package dev.bovenzi.lezione.astratte;

public abstract class Oviparo extends Animale{

    public Oviparo(String nome) {
        super(nome);
    }

    @Override
    public String getRiproduzione() {
        return "dev.bovenzi.lezione.astratte.Oviparo";
    }


}
