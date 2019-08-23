package composite01;

/**
 * 组合模式：对树状结构的容器和个体能够很好的适应在一起，进行同样的处理
 */
public class Client {

    public static void main(String[] args) {
        NonLeafNode node1 = new NonLeafNode("C");
        FileNode node2 = new LeafNode("C1");
        FileNode node3 = new LeafNode("C2");
        NonLeafNode node4 = new NonLeafNode("C3");
        NonLeafNode node5 = new NonLeafNode("C31");
        FileNode node6 = new LeafNode("C32");
        FileNode node7 = new LeafNode("C311");

        node1.add(node2);
        node1.add(node3);
        node1.add(node4);
        node4.add(node5);
        node4.add(node6);
        node5.add(node7);

        node1.open();

        System.out.println("*****************");

        node4.open();
    }
}
