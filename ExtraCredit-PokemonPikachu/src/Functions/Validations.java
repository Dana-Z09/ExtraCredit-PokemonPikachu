package Functions;

/**
 *
 * @author Danna Star
 */
public class Validations {

    public Validations() {
    }

    /**
     * Función que valida que dos string sean iguales letra por letra
     *
     * @param s1 String 1 a comparar
     * @param s2 String 1 a comparar
     * @return boolean, retorna verdadero si ambos string son iguales letra por
     * letra
     */
    public boolean compareStrings(String s1, String s2) {
        // Verificar si las cadenas tienen el mismo tamaño
        if (s1.length() != s2.length()) {
            return false;
        }

        // Comparar letra por letra
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }

        // Si todas las letras son iguales, retornar true
        return true;
    }

    /**
     * Valida si el numero introducido esta en el rango formado por dos numeros
     * indicados.
     *
     * @param numToReview numero a validar
     * @param max extremo superior del intervalo
     * @param min extremo inferior del intervalo
     * @return true si el string es un numero y esta en el rango indicado, false
     * en caso contrario.
     */
    public boolean numInRange(int numToReview, int max, int min) {
        return numToReview >= min && numToReview < max;
    }
}
