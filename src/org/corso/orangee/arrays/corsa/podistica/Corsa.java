package org.corso.orangee.arrays.corsa.podistica;

public class Corsa {

    private String nome;
    private int lunghezzaPercorso;
    private Atleta[] registroPartecipanti;

    public Corsa(String nome, int lunghezzaPercorso) {
        this.nome = nome;
        this.lunghezzaPercorso = lunghezzaPercorso;
        this.registroPartecipanti = new Atleta[50];
    }

    /**
     * Aggiunge un atleta al registro della corsa.
     * Applicare la programmazione difensiva, quindi, verificare sempre se il parametro di entrata
     * é null prima di operare su quel parametro.
     * Verificare, inoltre, che un atleta non si iscriva due volte.
     * @param atleta
     */
    public void iscriviAtleta(Atleta atleta) {
        //...
    }

    // TODO-RM sarebbe il caso di consentire anche una disicrizione.


    // TODO-RM sarebbe il caso di implementare un metodo per stampare i partecipanti


    public String getNome() {
        return nome;
    }

    public int getLunghezzaPercorso() {
        return lunghezzaPercorso;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setLunghezzaPercorso(int lunghezzaPercorso) {
        this.lunghezzaPercorso = lunghezzaPercorso;
    }
}
