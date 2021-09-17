package org.corso.orangee.saluti;

public class Main {
    public static void main(String[] args) {

        ClasseCheSaluta salutoItaliano = new SalutaInItaliano();
        ClasseCheSaluta salutoFrancese = new SalutaInFrancese();
        ClasseCheSaluta salutoInglese = new SalutaInglese();

        salutoItaliano.saluta();
        salutoFrancese.saluta();
        salutoInglese.saluta();
    }
}
