package EDD;



import Classes.Gift;

import java.io.Serializable;

/**
 *
 * @author Daniela Zambrano
 */
public class NodeAVL implements Comparator, Serializable{
    private int balanceFactor; //Factor de Equilibrio
    private int nodeID;
    private Object content;
    private NodeAVL pLeft;
    private NodeAVL pRight;
    
    /**
    * Constructores 
    */
    public NodeAVL(){
        
    }
    public NodeAVL(Object content) {
        this.balanceFactor = 0;
        this.content = content;
    }
    
    public NodeAVL(int nodeID, Object content) {
        this.balanceFactor = 0;
        this.nodeID = nodeID;
        this.content = content;
    }
    
    public NodeAVL(int nodoID, Object content, NodeAVL pLeft, NodeAVL pRight) {
        this.balanceFactor = 0;
        this.nodeID = nodoID;
        this.content = content;
        this.pLeft = pLeft;
        this.pRight = pRight;
    }
    /*------------------------------------------------------------------------*/
    
    /*Getters and Setters*/
    public int getBalanceFactor() {
        return balanceFactor;
    }
    public void setBalanceFactor(int balanceFactor) {
        this.balanceFactor = balanceFactor;
    }
    public int getNodeID() {
        return nodeID;
    }
    public void setNodeID(int nodeID) {
        this.nodeID = nodeID;
    }
    public Object getContent() {
        return content;
    }
    public void setContent(Object content) {
        this.content = content;
    }
    public NodeAVL getpLeft() {
        return pLeft;
    }
    public void setpLeft(NodeAVL pLeft) {
        this.pLeft = pLeft;
    }
    public NodeAVL getpRight() {
        return pRight;
    }
    public void setpRight(NodeAVL pRight) {
        this.pRight = pRight;
    }
    /*------------------------------------------------------------------------*/
    
    /**
     * Compara si el número identificador del nodo es igual al número dado.
     *
     * @param otherNodeID Número para comparar.
     * @return true si los números son iguales, false en caso contrario.
     */
    @Override
    public boolean isEqual(int otherNodeID) {
        return  this.nodeID == otherNodeID;
    }

    /**
     * Compara si el número identificador del nodo es menor al número dado.
     *
     * @param otherNodeID Número para comparar.
     * @return true si el número del nodo es menor, false en caso contrario.
     */
    @Override
    public boolean isLessThan(int otherNodeID) {
        return this.nodeID < otherNodeID;
    }

    /**
     * Compara si el número identificador del nodo es mayor al número dado.
     *
     * @param otherNodeID Número para comparar.
     * @return true si el número del nodo es mayor, false en caso contrario.
     */
    @Override
    public boolean isGreaterThan(int otherNodeID) {
        return this.nodeID > otherNodeID;
    }
    
    public String getSummaryOfObjectGift(NodeAVL nodeInTree){
        
        Gift giftInNode = (Gift) nodeInTree.getContent();
        String toReturn = giftInNode.summaryForPrint();
        
        return toReturn;
    }

    public Object visit() {
        return this.getContent();
    }
}
