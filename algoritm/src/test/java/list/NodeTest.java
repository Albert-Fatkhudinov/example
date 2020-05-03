package list;

import org.junit.Test;


public class NodeTest {

    @Test
    public void testNode() {
        Node node = new Node(null, 0);
        node.addNode(1);
        node.addNode(2);
        node.addNode(3);
        node.addNode(4);
        node.addNode(5);
        node.addNode(6);
        node.addNode(7);
        node.addNode(8);
        node.addNode(9);

        int size = node.getSize();
        System.out.println(size);

        node.printNodeContainer();
        Node reverseNode = node.reverse();
        reverseNode.printNodeContainer();

    }
}