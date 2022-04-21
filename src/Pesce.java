public class Pesce extends Oviparo{
    public Pesce(String nome) {
        super(nome);
    }

    @Override
    public String getCopertura() {
        return "Squame";
    }

    @Override
    public String getMovimento() {
        return "Nuova";
    }

}
