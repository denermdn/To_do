package Backend;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Reading_writing {

    private static FileWriter output_file;

    public static boolean reader() {
        try {
            File input_file = new File("data_base/database.txt");
            String aux = "";
            String word;
            Usuario user = new Usuario();
            Scanner in = new Scanner(input_file);
            aux = in.nextLine();
            String[] line = aux.split("=");
            for (String i : line) {
                System.out.println(i + "\n");
            }
            return true;

        } catch (FileNotFoundException e) {
            try {
                output_file = new FileWriter("data_base/database.txt");

            } catch (IOException ex) {
                Logger.getLogger(Reading_writing.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        return false;
    }

    public static void writer(String datas) {
        try (PrintWriter writer = new PrintWriter(output_file)) {
            writer.print(datas);
        }
        try {
            output_file.close();
        } catch (IOException ex) {
            Logger.getLogger(Reading_writing.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
