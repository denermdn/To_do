package Backend;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class funcoes extends Usuario {

    public static String Usuario_atual;

    public static boolean validate(String name, String password) {
        int i;
        for (Usuario a : main.userss) {

            if (a.getnome().equals(name) && a.getsenha().equals(password)) {
                Usuario_atual = a.getnome();
                return true;
            }
        }
        return false;
    }

    public static String getUsuarioAtual() {
        return Usuario_atual;
    }

    public static void salvasaida() {
        PrintWriter writer;
        PrintWriter writer2;
        PrintWriter writer3;
        try {
            writer = new PrintWriter(main.input_file, "UTF-8");
            String saida = "";

            for (Usuario aux2 : main.userss) {
                saida = aux2.toString();
                writer.println(saida);
                saida = "";
            }

            writer2 = new PrintWriter(main.input_file2, "UTF-8");
            saida = "";
            for (Atividade aux3 : main.atividades) {

                saida += aux3.toString();
                writer2.println(saida);
                saida = "";
            }

            for (Disciplina aux4 : main.disciplinas) {
                saida += aux4.toString();
                writer2.println(saida);
                saida = "";
            }
            saida = "";
            writer.close();
            writer2.close();
        } catch (FileNotFoundException ex) {
        } catch (UnsupportedEncodingException ex) {
        }
    }
}
