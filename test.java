import java.io.File;

public class test {

    public static void main(String[] args) {

        //create file system
        File mainFolder = new File("C:/Users/Sern/Documents/School Work/2021-2022/Fall2021");

        //list each file in the folder
        File[] files = mainFolder.listFiles();

        // list each file in the files folder
        for (File file : files) {
            System.out.println(file.getName());
            // listeach file in the files folder
            File[] files2 = file.listFiles();
            for (File file2 : files2) {
                System.out.println(file2.getName());
            }
        }

    }//end of main

}//end of DataTree