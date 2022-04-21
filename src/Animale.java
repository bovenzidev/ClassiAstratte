public abstract class Animale implements Comparable<Animale>{
    private String nome;
    private int campaPer;

    //costruttore
    public Animale(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCampaPer() {
        return campaPer;
    }

    public void setCampaPer(int campaPer) {

        this.campaPer = campaPer;
    }

    //metodi astratti
    // Come si muove: cammina, vola, nuota
    //Come si riproduce: oviparo, viviparo
    // Da che cosa è ricoperto: peli, piume, squame
    public abstract String getCopertura();

    public abstract String getRiproduzione();

    public abstract String getMovimento();

    @Override
    public int compareTo(Animale o) {

        return campaPer > o.getCampaPer()?1: campaPer < o.getCampaPer()?-1: 0;
    }

    @Override
    public String toString() {
        return "Animale{" +
                "nome='" + nome + '\'' +
                ", campaPer=" + campaPer +
                '}'+ "copertura "+getCopertura();
    }
}
