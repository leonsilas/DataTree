// Project Notes
// I believe this to be an incomplete and buggy implementation.  While it does work, it is not ideal and should be fixed in the future.

public class DataTree {
    public static void main(String[] args) {
        // Setup
        String url = "C:/Users/Sern/Documents/School Work/2021-2022/Spring2022"; // Change this to your directory
        Tree mainTree = new Tree(url);
        System.out.println("Printing out file system...\n");
        mainTree.printTree(url);

    }// End of main
        
}// End of DataTree