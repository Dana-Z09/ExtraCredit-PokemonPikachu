/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.io.Serializable;

/**
 * La clase RelationShip representa la relación entre el jugador y los Pokémon.
 * Incluye el rango de la relación y el estado actual de los Pokémon.
 *
 * @author AresR
 */
public class RelationShip implements Serializable {

    /**
     * Numero que indica el rango de relación actual.
     */
    private int relationShipRange;

    /**
     * El Pokémon que tiene la relacion e interactua con el jugador.
     */
    private Pokemon currentPokemon;

    /**
     * Arreglo que almacena los Pokemones del jugador, en este caso 2.
     */
    private Pokemon[] pokemons;

    /**
     * Crea una instancia de la clase Relationship, asignando el pokemon
     * elegido.
     *
     * @param currentPokemon Pokemon elegido por el usuario
     */
    public RelationShip(Pokemon currentPokemon) {
        this.relationShipRange = 0;
        this.currentPokemon = currentPokemon;
        this.pokemons=new Pokemon[2];
        this.pokemons[0]= currentPokemon;
    }

    /**
     * Obtiene el rango de la relación.
     *
     * @return El rango de relación actual.
     */
    public int getRelationShipRange() {
        return relationShipRange;
    }

    /**
     * Establece el rango de la relación.
     *
     * @param relationShipRange El nuevo rango de relación.
     */
    public void setRelationShipRange(int relationShipRange) {
        this.relationShipRange = relationShipRange;
    }

    /**
     * Obtiene el Pokémon actualmente seleccionado para la interacción.
     *
     * @return El Pokémon actual.
     */
    public Pokemon getCurrentPokemon() {
        return currentPokemon;
    }

    /**
     * Establece el Pokémon actualmente seleccionado para la interacción.
     *
     * @param currentPokemon El nuevo Pokémon actual.
     */
    public void setCurrentPokemon(Pokemon currentPokemon) {
        this.currentPokemon = currentPokemon;
    }

    /**
     * Obtiene el arreglo de Pokémon.
     *
     * @return El arreglo de los dos Pokémon.
     */
    public Pokemon[] getPokemons() {
        return pokemons;
    }
    
    /**
     * Establece el arreglo de Pokémon.
     *
     * @param pokemons El nuevo arreglo de dos Pokémon.
     */
    public void setPokemons(Pokemon[] pokemons) {
        if (pokemons.length == 2) {
            this.pokemons = pokemons;
        } else {
            throw new IllegalArgumentException("Debe haber exactamente dos Pokémon.");
        }
    }
    
    public void actualizateRelationShipRange(){
        if(this.relationShipRange>0){
        int current = this.getRelationShipRange();
        int newCurrent = current--;
        this.setRelationShipRange(newCurrent);
        } 
    }
    
    /**
     * 
     * @return 
     */
    public String summaryForPrint(){
        String toReturn;
        
        toReturn = "";                      //terminar
        
        return toReturn;
    }
}
