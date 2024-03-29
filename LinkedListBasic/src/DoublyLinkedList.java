public class DoublyLinkedList {

    //start : 100
    //100: data: kanishk (neighborAddress : 200)  ---->
    //200: data: karan (neighborAddress : 5000)  ---->
    //5000: data: tushar (neighborAddress : 0)

    //important pointers
    //start / top / first reference is necessary
    //end / rear / back can also be there as per requirement
    //data type of the data stored in the list is same
    //insertion and deletion is ideally fastest in this data structure
    //applications : used in graphs and other problem solutions

    private Node start;
    private Node end;

    public DoublyLinkedList() {
        this.start = null;
        this.end = null;
    }

    //insertion
    //insert in the beginning
    public Boolean insertBegin(String input) {
        //create a node
        Node node = new Node(input);
        //node : 1500
        //node.next : 0
        //node.previous : 0

        //if list is empty
        //the node we create will be the starting and the end of the list
        if (start == null && end == null) {
            // start : 0
            // end : 0

            start = node;
            //start : 1500
            end = node;
            //end : 1500
            return true;
        }

        //if list is not empty
        //we will connect the new node to the beginning of the list and call that as my new start
        // node <--> start <--> ,,,,,, <--> end.
        // node(start) <--> (normal node in the list) <--> ,,,,,, <--> end.

        //start : 700
        //end : 6000

        node.next = start;
        //node.next : 700
        start.previous = node;
        //start.previous : 1500
        start = node;
        //start : 1500
        return true;
    }


    //insert at the end

    public Boolean insertEnd(String input) {
        Node node = new Node(input);

        //if list is empty
        //the node we create will be the starting and the end of the list
        if (start == null && end == null) {
            // start : 0
            // end : 0

            start = node;
            //start : 1500
            end = node;
            //end : 1500
            return true;
        }

        //if list is not empty
        //we will connect the end to the new node and new node will be my new end
        end.next = node;
        node.previous = end;
        end = node;

        return true;
    }


    //homework
    //insert after a node
    public Boolean insertAfter(String previousNodeData, String newNodeData) {
        Node previousNode = searchNode(previousNodeData);
        if(previousNode == null) {
            System.out.println("Node doesn't exist.");
            return false;
        }

        Node newNode = new Node(newNodeData);
        Node nextNode = previousNode.next;

        insertBetween(previousNode, newNode, nextNode);

        return true;
    }

    private Node searchNode(String nodeData) {
        Node currentNode = start;

        while(!currentNode.data.equals(nodeData)) {
            currentNode = currentNode.next;
        }

        return currentNode;
    }


    //insert before a node
    public Boolean insertBefore(String nextNodeData, String newNodeData) {
        Node nextNode = searchNode(nextNodeData);
        if(nextNode == null) {
            System.out.println("Node doesn't exist.");
            return false;
        }

        Node newNode = new Node(newNodeData);
        Node previousNode = nextNode.previous;

        insertBetween(previousNode, newNode, nextNode);

        return true;
    }

    private void insertBetween(Node previousNode, Node newNode, Node nextNode) {
        newNode.next = nextNode;
        previousNode.next = newNode;
        nextNode.previous = newNode;
        newNode.previous = previousNode;
    }

    //deletion
    //delete in the beginning
    public String deleteBegin() {
        if (start == null && end == null) {
            System.out.println("Underflow! List is empty.");
            return null;
        }

        //single node
        if (start == end) {
            Node currentNode = start;
            start = null;
            end = null;

            return currentNode.toString();
        }

        //if list contains more than 1 nodes
        Node currentNode = start;
        start = start.next;
        start.previous = null;

        return currentNode.toString();
    }

    //delete at the end
    public String deleteEnd() {
        if (start == null && end == null) {
            System.out.println("Underflow! List is empty.");
            return null;
        }

        //single node
        if (start == end) {
            Node currentNode = start;
            start = null;
            end = null;

            return currentNode.toString();
        }

        //if list contains more than 1 nodes

        Node currentNode = end;
        end = end.previous;
        end.next = null;

        return currentNode.toString();
    }

    //homework
    //delete after a node
    //delete before a node
    //traversal
    //loop through the list and print it
    public void print() {
        System.out.println("----------------------------------------");
        Node currentNode = start;

        while (currentNode != null) {
            System.out.println("currentNode = " + currentNode);
            currentNode = currentNode.next;
        }
        System.out.println("----------------------------------------");
    }

    public void reversePrint() {
        System.out.println("----------------------------------------");
        Node currentNode = end;

        while (currentNode != null) {
            System.out.println("currentNode = " + currentNode);
            currentNode = currentNode.previous;
        }
        System.out.println("----------------------------------------");
    }
}
