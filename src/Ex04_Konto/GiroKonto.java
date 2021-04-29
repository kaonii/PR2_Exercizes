package Ex04_Konto;

public class GiroKonto extends Konto{
    protected double limit;

    public GiroKonto(String inhaber, double limit) {
        super(inhaber);
        this.limit = limit;
    }

    @Override
    public void einzahlen(double wert) {
        super.einzahlen(wert);
    }

    @Override
    public double auszahlen(double wert) {

        if (wert > limit) {
            System.out.println("limit reached, can only withdraw " + (kontostand + limit));

        }

        if (wert < limit) {
            kontostand = kontostand - wert;
        }
        return kontostand;

    }
}
