package linkedList;

public class OwnLL<T> {

    private Node<T> firstNode;
    private Node<T> lastNode;

    public void add(T val) {
        if(firstNode == null) {
            firstNode = new Node<>(null, null, val);
        } else if (lastNode == null) {
            lastNode = new Node<>(firstNode, null, val);
            firstNode.setNextNode(lastNode);
        } else {
            Node<T> node = new Node<>(lastNode, null, val);
            lastNode.setNextNode(node);
            lastNode = node;
        }
    }

    public T get(int index) {
        Node<T> currentNode = firstNode;
        for(int i = 0; i < index; i++) {
            currentNode = currentNode.getNextNode();
        }
        return currentNode.getValue();
    }

    public static void main(String[] args) {
        OwnLL<String> ownLL = new OwnLL<>();
        ownLL.add("Hello");
        ownLL.add("From");
        ownLL.add("Go");
        ownLL.add("IT");

        System.out.println("ownLL.get(1) = " + ownLL.get(0));
    }
}
