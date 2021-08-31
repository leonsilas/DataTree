import java.io.File;
import java.util.ArrayList;

public class Tree {
    //CONSTRUCTING AND MANIPULATING TREE
    private Node root;
    private File fileName;

    public Tree(String url) {
        fileName = new File(url);
        this.root = createTree(fileName);
    }

    public Node createTree(File file) {
        Node root = new Node(fileName);

            if (file.isDirectory()) {
                File[] files = file.listFiles();
                for (File f : files) {
                    root.addChild(createTree(f));
                }
            }
        return root;
    }

    // Recusively output the tree
    public void printTree(String url) {
        // Create file system
        File mainFolder = new File(url);
        File[] folderFiles = mainFolder.listFiles();

        // Loop through the array
        if (folderFiles != null && folderFiles.length > 0){
            for (File file : folderFiles) {
                
                // Checks if file is a folder (recursion)
                if (file.isDirectory()) {
                    System.out.println(file.getAbsolutePath() + " has " + file.length() + " files that take up " + (file.getTotalSpace() - file.getFreeSpace()) + " bytes");
                    printTree(file.getAbsolutePath());
                    System.out.println("");
                }   
                // Base case
                else 
                    System.out.println(file.getAbsolutePath());
            }
        }
    }

        // NODE CLASS FOR TREE
        public class Node {
    
            private Node parent;
            private ArrayList<Node> children;
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
        
            public Node getParent() {
                return parent;
            }
        
            public ArrayList<Node> getChildren() {
                return children;
            }
        
            public File getFileName() {
                return fileName;
            }
            
        }
}
