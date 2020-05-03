package list;

public class Node {


    private Node next;
    private Integer date;

    public Node(Node next, Integer date) {
        this.next = next;
        this.date = date;
    }

    public Integer getDate() {
        return date;
    }

    public void setDate(Integer date) {
        this.date = date;
    }

    public void addNode(int date) {
        Node temp = this;
        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node(null, date);
    }

    public int getSize() {
        Node temp = this;
        int count = 1;
        while (temp.next != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public Node reverse() {
        Node firstNode = this;
        Node previousNode = null;
        Node currentNode = firstNode;
        Node nextNode = currentNode.next;

        while (nextNode != null) {
            currentNode.next = previousNode;
            previousNode = currentNode;
            currentNode = nextNode;
            nextNode = currentNode.next;
        }

        currentNode.next = previousNode;

        firstNode = currentNode;
        return firstNode;
    }

    public void printNodeContainer() {
        Node temp = this;

        while(temp.next != null) {
            System.out.print(temp.getDate() + " ");
            temp = temp.next;
        }

        System.out.println(temp.getDate());
    }
}
