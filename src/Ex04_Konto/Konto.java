package Ex04_Konto;

public class Konto {
    protected String inhaber;
    protected double kontostand;

    public Konto(String inhaber) {
        this.inhaber = inhaber;
        this.kontostand = 0.0;
    }

    public void einzahlen (double wert){
        kontostand = kontostand + wert;
    }

    public double auszahlen (double wert){
        kontostand = kontostand - wert;
        return wert;
    }

    public String getInhaber() {
        return inhaber;
    }

    public double getKontostand() {
        return kontostand;
    }
}
