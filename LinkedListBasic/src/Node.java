public class Node {
    String data;
    Node next;
    Node previous;

    public Node(String data) {
        this.data = data;
        this.next = null;
        this.previous = null;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data='" + data + "'}";
    }
}
