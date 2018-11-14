package common;

/**
 * @author taleko01
 */

public class Node {
    private int data;
    private Node next;

    public Node(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void appendToTail(int data) {
        Node node = this;
        while (node.next != null) {
            node = node.next;
        }
        node.next = new Node(data);
    }

    @Override
    public String toString() {
        StringBuffer nodeString = new StringBuffer();
        Node node = this;
        while (node.next != null) {
            nodeString.append(node.data).append("->");
            node = node.next;
        }
        nodeString.append(node.data);
        return nodeString.toString();
    }

    @Override
    public boolean equals(Object obj) {
        return obj != null && this.data == ((Node) obj).data;
    }

    @Override
    public int hashCode() {
        return (int) (Math.pow(2, 10) + this.data);
    }
}