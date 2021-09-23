package org.corso.orangee.statics;

/**
 * Questa classe crea due giocatori e li mette a giocare su due differenti tavoli del blackJack
 * Nel codice é stato usato un operatore ternario:
 *    (remoGioca.getSommaVintaPersaComplessiva()>0 ? " vinto " : "perso ")
 * questa é la sua sintassi:
 *    ( condizione ? istruzione-se-risultato-condizione-vera : istruzione-se-risultato-condizione-false );
 * viene usata spesso per piccole assgnazioni e per semplici condizioni.
 *
 *
 */
public class Main {

    public static void main(String[] args) {
        // crea i giocatori
        Giocatore remoGioca = new Giocatore(1000, "Remo");
        Giocatore matteoGioca = new Giocatore(2000, "Matteo");

        // crea i due tavoli di blackjack
        BlackJack blackJackTavolo1 = new BlackJack(6000);
        BlackJack blackJackTavolo2 = new BlackJack(7000);

        // fa giocare remo sul tavolo1
        blackJackTavolo1.giocata(remoGioca, 40);
        blackJackTavolo1.giocata(remoGioca, 10);
        blackJackTavolo1.giocata(remoGioca, 50);
        System.out.println("\nIl giocatore " + remoGioca.getNome() + " ha " + (remoGioca.getSommaVintaPersaComplessiva()>0?" vinto ":"perso ") + Math.abs(remoGioca.getSommaVintaPersaComplessiva()) + " euro");

        // fa giocare matteo sul tavolo2
        blackJackTavolo2.giocata(matteoGioca, 80);
        blackJackTavolo2.giocata(matteoGioca, 30);
        blackJackTavolo2.giocata(matteoGioca, 100);
        System.out.println("\nIl giocatore " + matteoGioca.getNome() + " ha " + (matteoGioca.getSommaVintaPersaComplessiva()>0?"vinto ":"perso ") + Math.abs(matteoGioca.getSommaVintaPersaComplessiva()) + " euro");

        // stampa il valore in possesso di ogni tavolo
        System.out.println("\n=======");
        System.out.println("Il banco blackJack tavolo 1 possiede ancora " + blackJackTavolo1.getSommaBanco() + " euro.");
        System.out.println("Il banco blackJack tavolo 2 possiede ancora " + blackJackTavolo2.getSommaBanco() + " euro.");

        // il valore stampato qui é un valore prelevato da un attributo statico e quindi non é associato a nessuna istanza specifica della classe BlackJack (blackJackTavolo1 o blackJackTavolo2),
        // ma é associato esclusivamente alla classe BlackJack e quindi é un ottimo strumento per condividere informazioni tra tutte le istanze della stessa classe.
        System.out.println("Il numero complessivo di giocate fatte per tutti e due i tavoli é " + BlackJack.getNumeroTotaleDiGiocateBlackJack());
    }
}
