import java.io.File;

public class DataTree {
    public static void main(String[] args) {
        // Setup
        String url = "C:/Users/nirok/Documents/School/Test Folder";
        listFiles(url);

       // Node root = new Node(file);

    }// End of main

    // Recursion to list files in folders
    public static void listFiles(String url) {
        // Create file system
        File mainFolder = new File(url);
        File[] folderFiles = mainFolder.listFiles();

        // Loop through the array
        if (folderFiles != null && folderFiles.length > 0){
            for (File file : folderFiles) {

                // Checks if file is a folder (recursion)
                if (file.isDirectory()) {
                    System.out.println("Folder: " + file.getName() + "\n\t");
                    listFiles(file.getAbsolutePath());
                }   
                // Base case
                else 
                    System.out.println("File: " + file.getName());
        
            }
        }
    }// End of listFiles 
}// End of DataTree