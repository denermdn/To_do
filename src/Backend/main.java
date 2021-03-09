package Backend;

import Frontend.Login;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class main {

    public static List<Usuario> userss = new ArrayList<>();
    public static List<Atividade> atividades = new ArrayList<>();
    public static List<Disciplina> disciplinas = new ArrayList<>();
    public static File input_file;
    public static File input_file2;

    public static void main(String[] args) throws UnsupportedEncodingException {
        input_file = new File(args[0]);
        input_file2 = new File(args[1]);

        String aux = "";
        String word;
        char type = 'a';
        /**
         *
         */
        Usuario user = new Usuario();
        try {
            Scanner in = new Scanner(input_file);
            ///le a linha primeira linha e a ignora. Nela esta a informacao do que representa cada uma das duas colunas
            while (in.hasNext()) {
                aux = in.nextLine();///le a linha
                String[] line = aux.split(",");///separa a linha nas virgulas
                int j = 0;
                int k = 0;
                for (String i : line) {
                    word = i; ///Tira as aspas das palavras 
                    switch (j) {
                        case 0:
                            user.setnome(word);///Insere o id no objeto autores
                            user.setId(k);
                            k++;
                            break;
                        case 1:
                            if (word.equals("")) { ///Se o nome for vazio
                                user.setsenha(word);
                            } else {
                                user.setsenha(word);///Insere o nome no objeto
                            }
                            break;
                    }
                    j++;

                }
                userss.add(user);///adiciona o objeto a lista de objetos
                user = new Usuario(); ///Cria o novo objeto
            }
        } catch (Exception e) {
        }

        Atividade atv = new Atividade();
        Disciplina dis = new Disciplina();
        try {
            Scanner in2 = new Scanner(input_file2);
            ///le a linha primeira linha e a ignora. Nela esta a informacao do que representa cada uma das duas colunas
            while (in2.hasNext()) {
                aux = in2.nextLine();///le a linha
                String[] line = aux.split(",");///separa a linha nas virgulas
                int j = -1;
                int k = 0;
                for (String i : line) {
                    word = i; ///Tira as aspas das palavras 
                    switch (j) {
                        case -1:
                            char[] auxi = word.toCharArray();
                            type = auxi[0];
                        case 0:
                            if (type == 'a') {
                                atv.setNome(word);
                                k++;
                            }
                            if (type == 'd') {
                                dis.setNome(word);
                            }
                            break;
                        case 1:
                            if (type == 'a') {
                                if (word.equals("")) { ///Se o nome for vazio
                                    SimpleDateFormat formato4 = new SimpleDateFormat("dd/MM/yyyy");
                                    Date auxx = formato4.parse(word);

                                    atv.setData(auxx);
                                } else {
                                    SimpleDateFormat formato4 = new SimpleDateFormat("dd/MM/yyyy");
                                    Date auxx = formato4.parse(word);
                                    atv.setData(auxx);///Insere o nome no objeto
                                }
                            }
                            if (type == 'd') {
                                String[] diassS = word.split(";");
                                for (String auxo : diassS) {
                                    dis.addDiaSemana(auxo);
                                }
                            }
                            break;
                        case 2:
                            if (type == 'a') {
                                SimpleDateFormat formato4 = new SimpleDateFormat("HH:mm");
                                Date auxx = formato4.parse(word);
                                atv.setHorarioInicio(auxx);
                            }
                            if (type == 'd') {
                                SimpleDateFormat formato4 = new SimpleDateFormat("HH:mm");
                                Date auxx = formato4.parse(word);
                                dis.setHorarioInicio(auxx);
                            }
                            break;
                        case 3:
                            if (type == 'a') {
                                SimpleDateFormat formato3 = new SimpleDateFormat("HH:mm");
                                Date auxxx = formato3.parse(word);
                                atv.setHorarioTermino(auxxx);
                            }
                            if (type == 'd') {
                                SimpleDateFormat formato3 = new SimpleDateFormat("HH:mm");
                                Date auxxx = formato3.parse(word);
                                atv.setHorarioTermino(auxxx);
                            }
                            break;
                        case 4:
                            if (type == 'a') {
                                atv.setUser(word);
                            }
                            if (type == 'd') {
                                dis.setUser(word);
                            }
                            break;
                        case 5:
                            char[] c = word.toCharArray();
                            if (type == 'a') {
                                atv.setStatus(c[0]);
                            }
                            break;
                    }
                    j++;
                }
                if (type == 'a') {
                    atividades.add(atv);
                    atv = new Atividade(); ///Cria o novo objeto
                }
                if (type == 'd') {
                    disciplinas.add(dis);
                    dis = new Disciplina();
                }
            }
        } catch (Exception e) {
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
}
