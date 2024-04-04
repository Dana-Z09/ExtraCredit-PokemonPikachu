package Classes;

/**
 * La clase Gift representa un regalo que se puede dar a un Pokémon, incluyendo
 * su nombre, costo y el efecto que tiene en la relación.
 *
 * @author AresR
 */
public class Gift {

    /**
     * Nombre del regalo.
     */
    private String name;

    /**
     * Costo del regalo.
     */
    private int cost;

    /**
     * Aumento que proporciona el regalo a la relación.
     */
    private int relationshipBoost;

    /**
     * Cantidad del regalo que ha recibido el pokemon
     */
    private int quantity;

    /**
     * Constructor para crear un nuevo regalo con un nombre, costo y efecto en
     * la relación.
     *
     * @param name Nombre del regalo.
     * @param cost Costo del regalo.
     * @param relationshipBoost Aumento de la relación que proporciona el
     * regalo.
     */
    public Gift(String name, int cost, int relationshipBoost) {
        this.name = name;
        this.cost = cost;
        this.relationshipBoost = relationshipBoost;
        this.quantity = 1;
    }

    /**
     * Obtiene el nombre del regalo.
     *
     * @return El nombre del regalo.
     */
    public String getName() {
        return name;
    }

    /**
     * Establece el nombre del regalo.
     *
     * @param name El nuevo nombre del regalo.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Obtiene el costo del regalo.
     *
     * @return El costo del regalo.
     */
    public int getCost() {
        return cost;
    }

    /**
     * Establece el costo del regalo.
     *
     * @param cost El nuevo costo del regalo.
     */
    public void setCost(int cost) {
        this.cost = cost;
    }

    /**
     * Obtiene el aumento de relación que proporciona el regalo.
     *
     * @return El aumento a la relación.
     */
    public int getRelationshipBoost() {
        return relationshipBoost;
    }

    /**
     * Establece el aumento de relación que proporciona el regalo.
     *
     * @param relationshipBoost El nuevo aumento a la relación.
     */
    public void setRelationshipBoost(int relationshipBoost) {
        this.relationshipBoost = relationshipBoost;
    }

    /**
     * Obtiene cantidad de esa instancia de la clase regalo que ha recibido el
     * pokemon.
     *
     * @return numero que representa la cantidad de esa instancia de la clase
     * regalo que ha recibido el pokemon.
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Establece cantidad de esa instancia de la clase regalo que ha recibido el
     * pokemon.
     *
     * @param quantity El nuevo valor que tendra el atributo, para aumentar la
     * cantidad.
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     *      HACER JAVADOC
     */
    public void upgradeQuantity() {

        int current = this.getQuantity();
        current++;
        int newValue = current;
        this.setQuantity(newValue);
    }

    /**
     * Funcion para visualizar en texto los atributos de una instancia de la
     * clase
     *
     * @return un string que resume los el contenido de cada atributo de una
     * instancia de la clase
     */
    public String summaryForPrint() {
        String toReturn;

        toReturn = "Nombre:" + this.getName() + ". Costo:" + this.getCost() + ". Efecto: " + this.getRelationshipBoost() + ". Cantidad: "+this.getQuantity()+ ".";

        return toReturn;
    }
}
