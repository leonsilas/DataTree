import java.io.File;

public class DataTree {

    public static void main(String[] args) {
        DataTree tree = new DataTree();
        
        // Create file system
        File mainFolder = new File("C:/Users/Sern/Documents/School Work/2021-2022/Fall2021");

        // Read files from a folder
        File[] folderFiles = mainFolder.listFiles();

        // Loop through the files
        for (File file : folderFiles) {

            // Check if the file is a folder
            if (file.isDirectory()) {
                System.out.println("Folder: " + file.getName());
            }
        }

    }//end of main

}//end of DataTree