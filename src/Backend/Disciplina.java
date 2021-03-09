package Backend;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Disciplina {

    private String nome;
    private Date horarioInicio;
    private Date horarioTermino;
    private List<String> diaSemana;
    private String nome_user;

    public Disciplina() {
        this.nome = "";
        SimpleDateFormat formato = new SimpleDateFormat("HH:mm");
        try {
            this.nome_user = "";
            this.horarioInicio = formato.parse("00:00");
            this.horarioTermino = formato.parse("00:00");
        } catch (ParseException ex) {
            Logger.getLogger(Disciplina.class.getName()).log(Level.SEVERE, null, ex);
        }

        diaSemana = new ArrayList<>();

    }

    public Disciplina(String nome, List<String> day, String h1, String h2) throws ParseException {
        this.nome = nome;
        this.nome_user = funcoes.Usuario_atual;
        this.diaSemana = day;

        this.horarioInicio = new SimpleDateFormat("HH:mm").parse(h1);
        this.horarioTermino = new SimpleDateFormat("HH:mm").parse(h2);

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getHorarioInicio() {
        return horarioInicio;
    }

    public void setHorarioInicio(Date horarioInicio) {
        this.horarioInicio = horarioInicio;
    }

    public Date getHorarioTermino() {
        return horarioTermino;
    }

    public void setHorarioTermino(Date horarioTermino) {
        this.horarioTermino = horarioTermino;
    }

    public List<String> getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(List<String> diaSemana) {
        this.diaSemana = diaSemana;
    }

    public void addDiaSemana(String diaSemana) {
        this.diaSemana.add(diaSemana);
    }

    @Override
    public String toString() {
        String texte;
        texte = "d," + nome + ",";
        for (String a : diaSemana) {
            texte = texte + a;
            texte = texte + ";";
        }
        texte = texte.substring(0, texte.length() - 1);
        return texte + "," + horarioInicio.getHours() + ":" + horarioTermino.getMinutes() + "," + horarioTermino.getHours() + ":" + horarioTermino.getMinutes() + "," + nome_user;
    }

    public String getnomeuser() {
        return this.nome_user;
    }

    public void setUser(String nomeUser) {
        this.nome_user = nomeUser;
    }

    public boolean verificaDisciplina(int dd) {
        switch (dd) {
            case 1:
                for (String a : diaSemana) {
                    if (a.equals("Segunda-feira")) {
                        return true;
                    }
                }
                break;
            case 2:
                for (String a : diaSemana) {
                    if (a.equals("Terça-feira")) {
                        return true;
                    }
                }
                break;
            case 3:
                for (String a : diaSemana) {
                    if (a.equals("Quarta-feira")) {
                        return true;
                    }
                }
                break;
            case 4:
                for (String a : diaSemana) {
                    if (a.equals("Quinta-feira")) {
                        return true;
                    }
                }
                break;
            case 5:
                for (String a : diaSemana) {
                    if (a.equals("Sexta-feira")) {
                        return true;
                    }
                }
                break;
            case 6:
                for (String a : diaSemana) {
                    if (a.equals("Sábado")) {
                        return true;
                    }
                }
                break;
        }
        return false;
    }
}
