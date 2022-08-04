public class Stack {
    private Node top;

    public Stack() {
        this.top = null;
    }

    public Boolean push(String inputData) {
        //insert in the beginning
        //create a node
        Node node = new Node(inputData);

        //if list is empty
        //the node we create will be the starting and the end of the list
        if (top == null) {
            top = node;
            return true;
        }

        //if list is not empty
        node.next = top;
        top = node;
        return true;
    }

    public String pop() {
        //delete from the beginning
        if (top == null) {
            System.out.println("Underflow! List is empty.");
            return null;
        }

        //if list contains more than 1 nodes
        Node currentNode = top;
        top = top.next;

        return currentNode.toString();
    }

    public void print() {
        System.out.println("----------------------------------------");
        Node currentNode = top;

        while (currentNode != null) {
            System.out.println("currentNode = " + currentNode);
            currentNode = currentNode.next;
        }
        System.out.println("----------------------------------------");
    }

    public String peek() {
        return top.data;
    }
}
