package org.corso.orangee.arrays.esempio;

public class Main {

    // usiamo una bella costante pubblica (tutti la possono leggere, ma nesuno la puó alterare)
    public static final int NR_MAX_PERSONE = 10;

    public static void main(String[] args) {
        Persona persona1 = new Persona("Remo", "Candeli", "CNDRME");
        Persona persona2 = new Persona("Niels", "Bohr", "NLSBHR");
        Persona persona3 = new Persona("Marie", "Curie", "MRCRIE");

        //
        Persona elenco[] = new Persona[NR_MAX_PERSONE];
        elenco[0] = persona1;
        elenco[1] = persona2;
        elenco[2] = persona3;

        // No! non si puó fare! L'array elenco puó contenere max 10 elementi e parte dalla posizione 0
        // fino alla posizione 9! Errore ArrayIndexOutOfBoundsException!
        //elenco[10] = persona3;

        // NO! Non si puó fare: elenco vuole solo oggetti di tipo Persona
        //elencoPersone[3] = "Stringa";

        // vecchio for...loop (cicla in modo personalizzato)
        System.out.println("\nfor...loop");
        for(int i = 0; i<3; i++ ) {
            System.out.println("nr. " + i +" - " + elenco[i]);
        }

        // for..each (cicla su tutto l'array: dall'inizio alla fine
        System.out.println("\nfor...each");
        int i = 0;
        for(Persona p: elenco) {
            System.out.println("nr. " + i++ +" - " + p);
        }


        // cerchiamo una persona: Niels
        System.out.println("\ncerchiamo...Niels!");
        for(int x = 0; x<10; x++ ) {
            if (elenco[x]!=null && elenco[x].getCf().equals("NLSBHR"))
                System.out.println(elenco[x] + " trovato alla posizione nr. " + x);
        }

    }
}
