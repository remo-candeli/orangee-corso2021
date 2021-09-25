package org.corso.orangee.scope;

public class ScopeAndInitializing {

    // gli attributi di istanza (classe) di tipo primitivo sono sempre inizializzati a 0 per gli interi
    private int interoNonInizializzatoEsplicitamente;
    // gli attributi di istanza (classe) di tipo primitivo sono sempre inizializzati a 0.0 per i float
    private float floatNonInizializzatoEsplicitamente;
    // gli attributi di istanza (classe) di tipo primitivo sono sempre inizializzati a false per boolean

    private boolean fboolNonInizializzatoEsplicitamente;
    // a null tutti gli attributi di tipo non primitivo
    private String nome;

    public void test() {
        int obbiettivo = 10;
        for(int conta = 1; conta<=obbiettivo; conta++) {
            int contatoreInterno = conta;
            System.out.println("conto " + contatoreInterno);
        }
        System.out.println("contatoreInterno é arrivato a...NON SI PUÓ sapere perché non é piú visibile. E' fuori scope!");

        System.out.println();
        if (obbiettivo==10) {
            int moltiplicatore = obbiettivo * 2;
            System.out.println("moltiplicatore é visibile solo qui! moltiplicatore=" + moltiplicatore);
        }
        System.out.println("moltiplicatore NON é visibile qui! moltiplicatore=??");

        System.out.println();
        {
            int moltiplicatore = obbiettivo * 2;
            System.out.println("Di nuovo moltiplicatore é visibile solo qui! moltiplicatore=" + moltiplicatore);
        }
        System.out.println("Di nuovo moltiplicatore NON é visibile qui! moltiplicatore=??");

        System.out.println("interoNonInizializzatoEsplicitamente = " + interoNonInizializzatoEsplicitamente);
        System.out.println("floatNonInizializzatoEsplicitamente = "  + floatNonInizializzatoEsplicitamente);
        System.out.println("fboolNonInizializzatoEsplicitamente = "  + fboolNonInizializzatoEsplicitamente);
        System.out.println("nome = " + nome);
    }
}
