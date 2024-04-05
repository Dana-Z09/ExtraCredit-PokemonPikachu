package EDD;

import Classes.Gift;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Daniela Zambrano
 */
public class AVLTree implements Serializable {

    private NodeAVL root;

    public AVLTree() {
    }

    public NodeAVL getRoot() {
        return root;
    }

    public void setRoot(NodeAVL root) {
        this.root = root;
    }

    private NodeAVL rotationLL(NodeAVL n, NodeAVL n1) {
        n.setpLeft(n1.getpRight());
        n1.setpRight(n);
        //Actualización de los factores de equilibrio
        if (n1.getBalanceFactor() == -1)//se cumple la insercion
        {
            n.setBalanceFactor(0);
            n1.setBalanceFactor(0);
        } else {
            n.setBalanceFactor(-1);
            n1.setBalanceFactor(1);
        }
        return n1;
    }

    private NodeAVL rotationRR(NodeAVL n, NodeAVL n1) {
        n.setpRight(n1.getpLeft());
        n1.setpLeft(n);
        //Actualización de los factores de equilibrio
        if (n1.getBalanceFactor() == 1)//se cumple la insercion
        {
            n.setBalanceFactor(0);
            n1.setBalanceFactor(0);
        } else {
            n.setBalanceFactor(1);
            n1.setBalanceFactor(-1);
        }
        return n1;

    }

    private NodeAVL rotationLR(NodeAVL n, NodeAVL n1) {
        NodeAVL n2;

        n2 = (NodeAVL) n1.getpRight();

        n.setpLeft(n2.getpRight());
        n2.setpRight(n);
        n1.setpRight(n2.getpLeft());
        n2.setpLeft(n1);
        //Actualización de los factores de equilibrio
        if (n2.getBalanceFactor() == 1)//se cumple la insercion
        {
            n1.setBalanceFactor(-1);
        } else {
            n1.setBalanceFactor(0);
        }
        if (n2.getBalanceFactor() == -1) {
            n.setBalanceFactor(1);
        } else {
            n.setBalanceFactor(0);
        }
        n2.setBalanceFactor(0);

        return n2;
    }

    private NodeAVL rotationRL(NodeAVL n, NodeAVL n1) {
        NodeAVL n2;

        n2 = (NodeAVL) n1.getpRight();

        n.setpRight(n2.getpLeft());
        n2.setpLeft(n);
        n1.setpLeft(n2.getpRight());
        n2.setpRight(n1);
        //Actualización de los factores de equilibrio
        if (n2.getBalanceFactor() == 1)//se cumple la insercion
        {
            n.setBalanceFactor(-1);
        } else {
            n.setBalanceFactor(0);
        }
        if (n2.getBalanceFactor() == -1) {
            n1.setBalanceFactor(1);
        } else {
            n1.setBalanceFactor(0);
        }
        n2.setBalanceFactor(0);

        return n2;
    }

    public void insert(int num, Object content) throws Exception {
        Logical h = new Logical(false);//intercambia un valor booleano
        this.root = insertAVL(root, num, content, h);
    }

    private NodeAVL insertAVL(NodeAVL root, int num, Object nodeContent, Logical h) throws Exception {
        System.out.println("1");
        NodeAVL auxNode;
        NodeAVL insertedNode = new NodeAVL(num,nodeContent);

        if (root == null) {
            System.out.println("2");
            root = insertedNode;
            h.setValue(true);
        } else if (insertedNode.isLessThan(root.getNodeID())) {
            System.out.println("3");
            NodeAVL leftNode;
            leftNode = insertAVL((NodeAVL) root.getpLeft(), num, nodeContent, h);
            root.setpLeft(leftNode);

            //regreso por los nodos del camino busqueda
            if (h.getValue()) {
                //decrementa el factor de equilibrio por aumentar la altura de rama izquierda

                switch (root.getBalanceFactor()) {
                    case 1 -> {
                        root.setBalanceFactor(0);
                        h.setValue(false);
                        break;
                    }
                    case 0 -> {
                        root.setBalanceFactor(-1);
                        break;
                    }
                    case -1 -> {

                        //aplicar rotacion a la izquierda
                        auxNode = (NodeAVL) root.getpLeft();

                        if (auxNode.getBalanceFactor() == -1) {
                            root = rotationLL(root, auxNode);
                        } else {
                            root = rotationLR(root, auxNode);
                        }
                        h.setValue(false);
                        break;
                    }
                }

            }
        } else if (insertedNode.isGreaterThan(root.getNodeID())) {
            System.out.println("4");
            NodeAVL rightNode;
            rightNode = insertAVL((NodeAVL) root.getpRight(), num, nodeContent, h);
            root.setpRight(rightNode);

            //regreso por los nodos del camino de busqueda
            if (h.getValue()) {
                //incremena el factor de equilibrio por aumentar la altura de derecha
                switch (root.getBalanceFactor()) {
                    case 1 -> {//aplicar rotacion a la derecha
                        auxNode = (NodeAVL) root.getpRight();

                        if (auxNode.getBalanceFactor() == 1) {
                            root = rotationRR(root, auxNode);
                        } else {
                            root = rotationRL(root, auxNode);
                        }
                        h.setValue(false);
                        break;
                    }
                    case 0 -> {
                        root.setBalanceFactor(1);
                        break;
                    }
                    case -1 -> {
                        root.setBalanceFactor(0);
                        h.setValue(false);
                        break;
                    }
                }

            }

        } else {
            throw new Exception("No puede haber claves repetidas");
        }

        return root;
    }

    public void delete(Object nodeContent) throws Exception {
        Logical flag = new Logical(false);
        root = removeAVL(root, nodeContent, flag);
    }

    private NodeAVL removeAVL(NodeAVL root, Object nodeContent, Logical highChange) throws Exception {
        NodeAVL auxNode = new NodeAVL(nodeContent);

        if (root == null) {
            throw new Exception("Nodo no encontrado");
        } else if (auxNode.isLessThan(root.getNodeID())) {//el nodo a insertar es menor que el valor del nodo raiz
            NodeAVL leftNode;
            leftNode = removeAVL((NodeAVL) root.getpLeft(), nodeContent, highChange);
            root.setpLeft(leftNode);

            if (highChange.getValue()) {
                root = balanceLeftBranch(root, highChange);
            }
        } else if (auxNode.isGreaterThan(root.getNodeID())) {
            NodeAVL rightNode;
            rightNode = removeAVL((NodeAVL) root.getpRight(), nodeContent, highChange);
            root.setpRight(rightNode);
            if (highChange.getValue()) {
                root = balanceRightBranch(root, highChange);
            }
        } else {//Nodo encontrado
            NodeAVL theOne = root; // el nodo que se quiere eliminar del arbol   

            if (theOne.getpLeft() == null) { //no tiene rama izquierda
                root = (NodeAVL) theOne.getpRight();
                highChange.setValue(true);
            } else if (theOne.getpRight() == null) { //no tiene rama derecha
                root = (NodeAVL) theOne.getpLeft();
                highChange.setValue(true);
            } else {//tiene rama izquierda y derecha
                NodeAVL left;
                left = replace(root, (NodeAVL) root.getpLeft(), highChange);
                root.setpLeft(left);
                if (highChange.getValue()) {
                    root = balanceLeftBranch(root, highChange);
                }

            }
            theOne = null;
        }

        return root;
    }

    private NodeAVL replace(NodeAVL oldNode, NodeAVL newNode, Logical highChange) {
        if (newNode.getpRight() != null) {
            NodeAVL right;
            right = replace(oldNode, (NodeAVL) newNode.getpRight(), highChange);
            newNode.setpRight(right);
            if (highChange.getValue()) {
                newNode = balanceRightBranch(newNode, highChange);
            }
        } else {
            oldNode.setContent(newNode.getContent());
            oldNode = newNode;
            newNode = (NodeAVL) newNode.getpLeft();
            oldNode = null;
            highChange.setValue(true);
        }
        return newNode;
    }

    private NodeAVL balanceLeftBranch(NodeAVL n, Logical highChange) {
        NodeAVL auxNode;

        switch (n.getBalanceFactor()) {
            case -1 -> {
                n.setBalanceFactor(0);
                break;
            }
            case 0 -> {
                n.setBalanceFactor(1);
                highChange.setValue(false);
                break;
            }
            case 1 -> { //se aplica un tipo de rotacion derecha
                auxNode = (NodeAVL) n.getpRight();
                if (auxNode.getBalanceFactor() >= 0) {
                    if (auxNode.getBalanceFactor() == 0) {//la altura no vuelve a disminuir
                        highChange.setValue(false);
                    }
                    n = rotationRR(n, auxNode);
                } else {
                    n = rotationRL(n, auxNode);
                }
                break;

            }

        }
        return n;
    }

    private NodeAVL balanceRightBranch(NodeAVL n, Logical highChange) {
        NodeAVL auxNode;

        switch (n.getBalanceFactor()) {
            case -1: {//Se aplica un tipo de rotacion izquierda
                auxNode = (NodeAVL) n.getpLeft();
                if (auxNode.getBalanceFactor() <= 0) {
                    if (auxNode.getBalanceFactor() == 0) {
                        highChange.setValue(false);
                    }
                    n = rotationLL(n, auxNode);
                } else {
                    n = rotationLR(n, auxNode);
                }
                break;
            }
            case 0: {
                n.setBalanceFactor(-1);
                highChange.setValue(false);
                break;
            }

            case 1: {
                n.setBalanceFactor(0);
                break;
            }
        }
        return n;
    }

    public NodeAVL SearchNodeInAVL(NodeAVL pRoot, int numNodeOfCurrentOperation) throws Exception {

        if (pRoot == null) {
            throw new Exception("No se encuentra.");
        } else if (pRoot.isEqual(numNodeOfCurrentOperation)) {
            return pRoot;
        } else if (pRoot.isGreaterThan(numNodeOfCurrentOperation)) {
            return SearchNodeInAVL(pRoot.getpLeft(), numNodeOfCurrentOperation);
        } else {
            return SearchNodeInAVL(pRoot.getpRight(), numNodeOfCurrentOperation);
        }
    }

    /**
     * Inserta un nuevo dato en un nodo existente del árbol.
     *
     * @param pRoot El nodo raíz del subárbol en el que se buscará el nodo a
     * actualizar.
     * @param numNodeOfCurrentOperation El número identificador del nodo a
     * actualizar.
     * @param newData El nuevo objeto de datos a asignar al nodo.
     * @return true si la actualización fue exitosa, false en caso contrario.
     * @throws Exception Si el nodo no se encuentra en el árbol.
     */
    public boolean insertNewDataInNode(NodeAVL pRoot, int numNodeOfCurrentOperation, Object newData) throws Exception {
        if (pRoot == null) {
            throw new Exception("No se encuentra.");

        } else if (pRoot.isEqual(numNodeOfCurrentOperation)) {
            pRoot.setContent(newData);
            return true;

        } else if (pRoot.isGreaterThan(numNodeOfCurrentOperation)) {
            return insertNewDataInNode(pRoot.getpLeft(), numNodeOfCurrentOperation, newData);

        } else {
            return insertNewDataInNode(pRoot.getpRight(), numNodeOfCurrentOperation, newData);
        }
    }

    //Recorrido de un árbol binario en preorden
    public String preorden(NodeAVL root, StringBuilder temp) {
        if (root != null) {
            temp.append(root.getSummaryOfObjectGift(root));

            preorden(root.getpLeft(), temp);
            preorden(root.getpRight(), temp);
        }
        return temp.toString();
    }

    //Recorrido de un árbol binario en preorden
    public String inorden(NodeAVL root, StringBuilder temp) {
        if (root != null) {

            inorden(root.getpLeft(), temp);

            temp.append(root.getSummaryOfObjectGift(root));

            inorden(root.getpRight(), temp);
        }
        return temp.toString();
    }

    //Recorrido de un árbol binario en preorden
    public String postorden(NodeAVL root, StringBuilder temp) {
        if (root != null) {
            postorden(root.getpLeft(), temp);
            postorden(root.getpRight(), temp);

            temp.append(root.getSummaryOfObjectGift(root));

        }
        return temp.toString();
    }

    public int sizeTree(NodeAVL root) {
        if (root == null) {
            return 0;
        } else {
            return 1 + sizeTree(root.getpLeft()) + sizeTree(root.getpRight());
        }
    }

    /**
     * Resumen del árbol binario de búsqueda en un String utilizando paréntesis
     * en preorden.
     *
     * @return Un String que representa el árbol en preorden utilizando
     * paréntesis.
     */
    public String summarizeTree() {
        StringBuilder sb = new StringBuilder();
        summarizeTreeRecursive(this.getRoot(), sb);
        return sb.toString();
    }

    /**
     * Método auxiliar recursivo para realizar el recorrido en inOrden del árbol
     * y generar la representación en paréntesis
     *
     * @param pRootOfTree nodo raiz del arbol del cual se quiere obtener su
     * resumen en forma de string.
     * @param sb
     */
    private void summarizeTreeRecursive(NodeAVL pRootOfTree, StringBuilder sb) {
        if (pRootOfTree != null) {

            // Recorrer el subárbol izquierdo
            summarizeTreeRecursive(pRootOfTree.getpLeft(), sb);

            // Agregar el valor del nodo al String
            sb.append("(").append(pRootOfTree.getNodeID()).append(" ");

            // Recorrer el subárbol derecho
            summarizeTreeRecursive(pRootOfTree.getpRight(), sb);

            // Cerrar el paréntesis del nodo
            sb.append(")");
        }
    }

    
    
    public ArrayList inordenArray(NodeAVL root){
        ArrayList lista = null;
        
        if(root!=null){
        inordenArray(root.getpLeft());
        Gift regalo= (Gift) root.visit();
        lista.add(regalo);
        inordenArray(root.getpRight());
        }
        return lista;
    }
}
