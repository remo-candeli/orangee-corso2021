package org.corso.orangee.saluti;

/**
 * Questa classe é astratta perché esiste al suo interno almeno un metodo dichiarato come
 * astratto.
 * Il metodo saluta() é astratto perché questa classe non puó definire una implementazione
 * specifica di un saluto poiché il livello di questa classe é molto generico.
 * Per questo viene imposta alle classi figlie l'implementazione di questo metodo.
 *
 */
abstract public class ClasseCheSaluta {
    abstract public void saluta();
}
