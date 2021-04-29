package Ex04_Konto;

public class KontoApp {

    public static void main(String[] args) {

    Konto konto1 = new Konto("Caro");
    GiroKonto gk1 = new GiroKonto("Caro", 1000);
    JugendGiroKonto jgk1 = new JugendGiroKonto("Caro", 1000, 200);
    SparKonto sk1 = new SparKonto("Caro");


        System.out.println("\n***konto1***");

        konto1.einzahlen(200);
        konto1.auszahlen(300);
        System.out.println(konto1.getKontostand());

        System.out.println("\n***gk1***");
        gk1.einzahlen(2000);
        System.out.println(gk1.getKontostand());

        gk1.auszahlen(50);
        System.out.println(gk1.getKontostand());

        gk1.auszahlen(3000);
        System.out.println(gk1.getKontostand());

        gk1.auszahlen(1000);
        System.out.println(gk1.getKontostand());


        System.out.println("\n***jk1***");
        System.out.println(jgk1.getKontostand());
        System.out.println(sk1.getKontostand());


    }//

} //
