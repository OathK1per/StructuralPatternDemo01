package composite01;

import java.util.ArrayList;
import java.util.List;

public interface FileNode {

    void open();
}

class LeafNode implements FileNode {
    private String nodeName;

    public LeafNode(String nodeName) {
        this.nodeName = nodeName;
    }

    @Override
    public void open() {
        System.out.println("打开文件: " + nodeName);
    }
}

class NonLeafNode implements FileNode {
    private List<FileNode> nodes = new ArrayList<>();
    private String nodeName;

    public NonLeafNode(String nodeName) {
        this.nodeName = nodeName;
    }

    public void add(FileNode node) {
        nodes.add(node);
    }

    public FileNode remove(int index) {
        return nodes.remove(index);
    }

    public FileNode get(int index) {
        return nodes.get(index);
    }

    @Override
    public void open() {
        System.out.println("打开文件夹: " + nodeName);
        for (FileNode node : nodes) {
            node.open();
        }
        System.out.println("-----关闭文件夹-----");
    }
}
