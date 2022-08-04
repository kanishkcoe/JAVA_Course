public class Queue {

    private Node front;
    private Node rear;

    public Queue() {
        this.front = null;
        this.rear = null;
    }

    //insertion at end
    public Boolean enqueue(String input) {
        Node node = new Node(input);

        //if list is empty
        //the node we create will be the starting and the end of the list
        if (front == null && rear == null) {
            // start : 0
            // end : 0

            front = node;
            //start : 1500
            rear = node;
            //end : 1500
            return true;
        }

        //if list is not empty
        //we will connect the end to the new node and new node will be my new end
        rear.next = node;
        rear = node;

        return true;
    }

    //deletion from beginning
    public String dequeue() {
        if (front == null && rear == null) {
            System.out.println("Underflow! List is empty.");
            return null;
        }

        //single node
        if (front == rear) {
            Node currentNode = front;
            front = null;
            rear = null;

            return currentNode.toString();
        }

        //if list contains more than 1 nodes
        Node currentNode = front;
        front = front.next;
        return currentNode.toString();
    }

    public void print() {
        System.out.println("----------------------------------------");
        Node currentNode = front;

        while (currentNode != null) {
            System.out.println("currentNode = " + currentNode);
            currentNode = currentNode.next;
        }
        System.out.println("----------------------------------------");
    }
}
