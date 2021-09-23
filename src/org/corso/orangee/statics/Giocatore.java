package org.corso.orangee.statics;


/**
 * Giocatore mantiene le informazioni del giocatore oltre che
 * la somma iniziale di cui intende disporre al tavolo di bj
 */
public class Giocatore {

    private String nome;
    private int sommaInizialeGiocatore;
    private int sommaGiocatore;
    private static String esempioAttributoStatico = "GIOCATORI DELLA DOMENICA";

    /**
     * La presenza di questo costruttore con argomenti evidenzia il fatto ogni istanza di giocatore
     * deve per forza essere inizializzata con la somma iniziale ed il nome del giocatore.
     * @param sommaInizialeGiocatore
     * @param nome
     */
    public Giocatore(int sommaInizialeGiocatore, String nome) {
        this.sommaInizialeGiocatore = sommaInizialeGiocatore;
        this.sommaGiocatore = sommaInizialeGiocatore;
        this.nome = nome;
    }

    /**
     * Attenzione!!!
     * I metodi statici non possono mai accedere al this o al super.
     * I metodi statici possono accedere solo ad attributi statici o ad altri metodi statici.
     * se provate a togliere il commmento all'istruzione commentata otterrete un errore.
     */
    public static void stampaGiocatore() {
        //System.out.println("il nome del giocatore é + "+ this.sommaGiocatore);
        System.out.println(esempioAttributoStatico);
    }

    /**
     * Al contrario, i metodi dinamici (quelli non static) possono accedere ad attributi e metodi statici.
     * Eccone un esempio.
     */
    public void unoDeiTantiMetodiDinamici() {
        System.out.println(esempioAttributoStatico);
    }


    public int getSommaVintaPersaComplessiva() {
        return this.sommaInizialeGiocatore - sommaGiocatore;
    }

    public void aggiungiSommaVinta(int sommaVinta) {
        this.sommaGiocatore += sommaVinta;
    }

    public void sottraiSommaPersa(int sommaPersa) {
        this.sommaGiocatore -= sommaPersa;
    }

    public String getNome() {
        return nome;
    }

    public int getSommaGiocatore() {
        return sommaGiocatore;
    }

    public int getSommaInizialeGiocatore() {
        return sommaInizialeGiocatore;
    }
}
