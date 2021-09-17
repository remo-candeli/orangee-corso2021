package org.corso.orangee.saluti;


/**
 * Qusesta classe é figlia di ClasseCheSaluta e quindi devi implementare per forza il metodo
 * saluta().
 * Siccome é dichiarata con il nome SalutaInItaliano é abbastanza logico che il testo che verrá prodotto é
 * un saluto in italiano.
 * La annotation @Override non é obbligatoria e serve solo come indicazione al programmatore.
 */
public class SalutaInItaliano extends ClasseCheSaluta {
    @Override
    public void saluta() {
        System.out.println("Ciao a tutti!");
    }
}
