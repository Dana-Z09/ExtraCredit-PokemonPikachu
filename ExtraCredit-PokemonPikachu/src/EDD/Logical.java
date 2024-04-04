
package EDD;

import java.io.Serializable;

/**
 *
 * @author Daniela Zambrano
 */
class Logical implements Serializable{
    private boolean value;

    public Logical(boolean value) {
        this.value = value;
    }
    
    public boolean getValue() {
        return value;
    }

    public void setValue(boolean value) {
        this.value = value;
    }
    
    
}
