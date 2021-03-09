package Backend;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Atividade {

    private String nome;
    private Date horarioInicio;
    private Date horarioTermino;
    private Date data;
    private char Status;
    private String nome_user;

    public Atividade() {
        this.nome = "";
        SimpleDateFormat formato = new SimpleDateFormat("HH:mm");
        try {
            this.horarioInicio = formato.parse("00:00");
            this.horarioTermino = formato.parse("00:00");
            formato = new SimpleDateFormat("dd/MM/yyyy");
            this.data = formato.parse("01/01/0001");
            this.nome_user = "";
        } catch (ParseException ex) {
            Logger.getLogger(Disciplina.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Atividade(String Nome, String data2, String Inicio, String Termino) {
        this.nome = Nome;
        String auxiliar;
        this.Status = 'a';
        SimpleDateFormat formato = new SimpleDateFormat("HH:mm");
        try {

            this.horarioInicio = formato.parse(Inicio);

            String formatoData = "HH:mm";
            Date data = this.horarioInicio;
            SimpleDateFormat formatador = new SimpleDateFormat(formatoData);

            this.horarioTermino = formato.parse(Termino);
            formato = new SimpleDateFormat("dd/MM/yy");
            this.data = new SimpleDateFormat("dd/MM/yy").parse(data2);

            nome_user = funcoes.getUsuarioAtual();
        } catch (ParseException ex) {
            Logger.getLogger(Disciplina.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public String toString() {
        int mont = data.getMonth() + 1;
        int yeaar = data.getYear() + 1900;
        return 'a' + "," + nome + "," + data.getDate() + "/" + mont + "/" + yeaar + "," + horarioInicio.getHours() + ":" + horarioInicio.getMinutes() + "," + horarioTermino.getHours() + ":" + horarioTermino.getMinutes() + "," + nome_user + "," + Status;
    }

    public String getNome() {
        return nome;
    }

    public void setUser(String user_name) {
        nome_user = user_name;
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

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public void setStatus(char status) {
        this.Status = status;
    }

    public char getStatus() {
        return this.Status;
    }

    public String getNomeUser() {
        return this.nome_user;
    }
}
