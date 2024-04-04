package Classes;

import EDD.AVLTree;

/**
 * Clase Pokemon. Esta clase define los atributos y el comportamiento de un
 * objeto del tipo Pokemon.
 *
 * @author AresR
 */
public class Pokemon {

    /**
     * Nombre del Pokémon.
     */
    private String name;

    /**
     * Estado emocional actual del Pokémon.
     */
    private EmotionalState currentState;
    
    /**
     * Inventario, guardado en un arbol AVL
     */
    private AVLTree inventory;

    /**
     * Historial de regalos recibidos, guardado en un árbol AVL.
     */
    private AVLTree recordOfGifts;

    /**
     * Lista de estados emocionales del pokemon.
     */
    private EmotionalState[] pokemonStates;

    /**
     * Constructor para instanciar la clase Pokemon, asignando el nombre y los
     * estados emocionales que tendrá el poquemon
     *
     * @param name nombre que se le asignará al pokemon
     * @param states arreglo que contiene los estados del pokemon
     */
    public Pokemon(String name, EmotionalState[] states) {
        this.name = name;
        this.currentState = states[0]; // Inicializar con el primer estado
        this.inventory = new AVLTree();
        this.recordOfGifts = new AVLTree();
        this.pokemonStates = states;

    }

    /**
     * Devuelve el nombre del Pokémon.
     *
     * @return El nombre actual del Pokémon.
     */
    public String getName() {
        return name;
    }

    /**
     * Establece el nombre del Pokémon.
     *
     * @param name El nuevo nombre del Pokémon.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Devuelve el estado emocional actual del Pokémon.
     *
     * @return El estado emocional actual.
     */
    public EmotionalState getCurrentState() {
        return currentState;
    }

    /**
     * Establece el estado emocional actual del Pokémon.
     *
     * @param currentState El nuevo estado emocional del Pokémon.
     */
    public void setCurrentState(EmotionalState currentState) {
        this.currentState = currentState;
    }

    /**
     * Devuelve el árbol AVL que representa el inventario de regalos del Pokémon.
     *
     * @return El árbol AVL con el inventario de regalos recibidos.
     */
    public AVLTree getInventory() {
        return inventory;
    }

    /**
     * Establece el árbol AVL que representa el inventario de regalos del Pokémon.
     *
     * @param inventory El árbol AVL con el nuevo inventario de regalos.
     */
    public void setInventory(AVLTree inventory) {
        this.inventory = inventory;
    }

    /**
     * Devuelve el árbol AVL que representa el registro de regalos del Pokémon.
     *
     * @return El árbol AVL con el registro de regalos.
     */
    public AVLTree getRecordOfGifts() {
        return recordOfGifts;
    }

    /**
     * Establece el árbol AVL que representa el registro de regalos del Pokémon.
     *
     * @param recordOfGifts El árbol AVL con el nuevo registro de regalos.
     */
    public void setRecordOfGifts(AVLTree recordOfGifts) {
        this.recordOfGifts = recordOfGifts;
    }

    /**
     * Devuelve el array de estados emocionales posibles del Pokémon.
     *
     * @return Array de estados emocionales.
     */
    public EmotionalState[] getPokemonStates() {
        return pokemonStates;
    }

    /**
     * Establece el array de estados emocionales posibles del Pokémon.
     *
     * @param pokemonStates El nuevo array de estados emocionales del Pokémon.
     */
    public void setPokemonStates(EmotionalState[] pokemonStates) {
        this.pokemonStates = pokemonStates;
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
