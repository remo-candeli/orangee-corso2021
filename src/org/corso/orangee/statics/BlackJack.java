package org.corso.orangee.statics;

import java.util.Random;

/**
 * Questa classe mantiene l'informazione della somma a disposizione del banco.
 * Questa somma viene inizializzata nel costruttore.
 * Man mano che si effettuano le giocate, in base all'esito delle stesse, viene aggiornato il valore
 * della somma del banco.
 */
public class BlackJack {

    public static final int MAX_NUMERO_CASUALE=100;
    private int sommaBanco;
    private static int numeroTotaleDiGiocateBlackJack = 0;

    public BlackJack(int sommaInizialeBanco) {
        this.sommaBanco = sommaInizialeBanco;
    }

    public static int getNumeroTotaleDiGiocateBlackJack() {
        return numeroTotaleDiGiocateBlackJack;
    }

    /**
     * Richiede il giocatore e la puntata al gioco.
     * L'esito Vicita/Sconfitta del giocatore produce un effetto complementare sulla somma del banco.
     * Se vince il giocatore gli si assegna la giocata e la si decrementa al banco
     * Se vince il banco gli si assegna la giocata e la sidecrementa al giocatore
     * @param giocatore
     * @param valoreGiocata
     */
    public void giocata(Giocatore giocatore, int valoreGiocata) {
        boolean giocatoreVince = verificaGiocata();
        // Questa istruzione incrementa il contatore che calcola il numero delle giocate complessive fatte su tutti i tavoli di blackjack
        numeroTotaleDiGiocateBlackJack++;
        if (giocatoreVince) {
            this.sommaBanco -= valoreGiocata;
            giocatore.aggiungiSommaVinta(valoreGiocata);
            System.out.println(giocatore.getNome() + " vince la giocata con valore " + valoreGiocata);
        } else {
            this.sommaBanco += valoreGiocata;
            giocatore.sottraiSommaPersa(valoreGiocata);
            System.out.println(giocatore.getNome() + " perde la giocata con valore " + valoreGiocata);
        }
    }

    /**
     * calcola arbitrariamente un numero casuale su un segmento 0 - 100.
     * Se il valore é pari il giocatore vince, se dispari perde.
     * @return
     */
    private boolean verificaGiocata() {
        int numeroCausaleGenerato = generaNumeroCasuale();
        if ((numeroCausaleGenerato % 2) == 0)
            return true;
        return false;
    }


    private int generaNumeroCasuale() {
       return new Random().nextInt(MAX_NUMERO_CASUALE);
    }


    public int getSommaBanco() {
        return sommaBanco;
    }
}
