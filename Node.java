import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Node {
    
    private Node parent;
    private List<Node> children;
    private File fileName;

    public Node(File fileName) {
        children = new ArrayList<>();
        this.fileName = fileName;
    }

    public Node addChild(Node node) {
        children.add(node);
        node.parent = this;
        return this;
    }
    
}
