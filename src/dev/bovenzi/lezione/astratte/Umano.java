package dev.bovenzi.lezione.astratte;

public class Umano extends Animale{

    public Umano(String nome) {

        super(nome);
    }


    @Override
    public String getCopertura() {
        return "Peli";
    }

    @Override
    public String getRiproduzione() {
        return "Grembo";
    }

    @Override
    public String getMovimento() {
        return "Cammina";
    }
}
