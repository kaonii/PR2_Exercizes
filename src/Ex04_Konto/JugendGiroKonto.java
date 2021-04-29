package Ex04_Konto;

public class JugendGiroKonto extends GiroKonto{
    protected double buchungslimit;

    public JugendGiroKonto(String inhaber, double limit, double buchungslimit) {
        super(inhaber, limit);
        this.buchungslimit = buchungslimit;
    }

    @Override
    public void einzahlen(double wert) {

        if (kontostand + wert < buchungslimit) {
            kontostand = kontostand + wert;
        }
    }

    @Override
    public double auszahlen(double wert) {

        if (kontostand > kontostand - limit && kontostand - wert < buchungslimit) {
            kontostand = kontostand - wert;
        }
        return kontostand;
    }
}


