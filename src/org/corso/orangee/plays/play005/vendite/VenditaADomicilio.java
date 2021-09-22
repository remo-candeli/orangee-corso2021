package org.corso.orangee.plays.play005.vendite;


import org.corso.orangee.plays.play005.Prodotto;

/**
 * La classe VenditaADomicilio si occupa di applicare i calcoli inerenti vendite a docmicilio
 *
 */
public class VenditaADomicilio extends Vendita{


    /**
     * Per ogni esecuzione vengono ricevuti l'oggetto di tipo Prodotto e la qta venduta.
     * Per ciascuna transazione viene eseguito il metodo calcolaPrezzoDiVendita del Prodotto.
     *
     * @param prodotto
     * @param qta
     */
    public void esegui(Prodotto prodotto, int qta) {
        float valore = prodotto.calcolaPrezzoVendita(qta);

        // qui andrebbero implementati i calcoli degli sconti eventuali

        super.setTotaleComplessivoVendite(getTotaleComplessivoVendite() + valore);
        System.out.println("--- vendita di " + prodotto.getNome() + " qta = " + qta + " al p.unitario = "
                + prodotto.getPrezzoUnitario() + " con sconto = " + prodotto.getScontoPercentuale() + ". Euro = " + valore);
    }


}
