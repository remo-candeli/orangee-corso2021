package org.corso.orangee.arrays.esempio;

public class Main {

    public static void main(String[] args) {
        Persona perona1 = new Persona("Remo", "Candeli", "CNDRME");
        Persona perona2 = new Persona("Niels", "Bohr", "NLSBHR");
        Persona perona3 = new Persona("Marie", "Candeli", "MRCRIE");

        //
        Persona elenco[] = new Persona[10];
        elenco[0] = perona1;
        elenco[1] = perona2;
        elenco[2] = perona3;

        // NO! Non si puó fare: elenco vuole solo Persone
        //elencoPersone[3] = "Stringa"; 

        // vecchio for...loop
        System.out.println("\nvfor...loop");
        for(int i = 0; i<3; i++ ) {
            System.out.println("nr. " + i +" - " + elenco[i]);
        }

        // for..each
        System.out.println("\nfor...each");
        int i = 0;
        for(Persona p: elenco) {
            System.out.println("nr. " + i++ +" - " + p);
        }


        // cerchiamo una persona: Remo
        System.out.println("\ncerchiamo...Niels!");
        for(int x = 0; x<10; x++ ) {
            if (elenco[x]!=null && elenco[x].getCf().equals("NLSBHR"))
                System.out.println(elenco[x] + " trovato alla posizione nr. " + x);
        }

    }
}
