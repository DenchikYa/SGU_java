import java.util.*;
import java.io.*;

public class file {

    public static void main(String[] args) throws Exception {

        FileWriter fileWriter = new FileWriter("file1.txt");

        for(int i = 0; i < 10; i++){
            fileWriter.write(String.valueOf(i) + " ");
        }

        fileWriter.write("\n");

        fileWriter.write("\nAvoiding of\nSins-only illusion,\nExactly I know.");

        fileWriter.close();

        FileReader fileReader = new FileReader("file1.txt");
        Scanner scanner = new Scanner(fileReader);

        int i = 1;

        while(scanner.hasNextLine()){
            System.out.println(i + " : " + scanner.nextLine());
            i++;
        }

        fileReader.close();
    }
}