import java.util.*;
/*
 * Clase para abstraer el funcionamiento de un dado.
 * Los dados creados con esta clase pueden hacer lo que te
 * esperarías de un dado normal.
 * Puedes lanzarlo para obtener un valor.
 */


public class Dice {
    Random randGen;
    /* 
     * Como es el dado de un cubilete podriamos hacer que devuelva
     * los valores de una enumeración con los nombres de las caras.
     */
    public Integer value;

    public Dice() {
        this.randGen = new Random();
        this.value = 0;
    }

    public void roll() {
        this.value = this.randGen.nextInt(6) + 1;
    }
}
