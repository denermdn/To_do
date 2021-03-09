package Backend;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

    private String nome;
    private String senha;
    private int id;

    List<Usuario> a = new ArrayList<>();

    public Usuario(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
        id = main.userss.size() + 1;
    }

    public Usuario() {
        this.nome = "";
        this.senha = "";
    }

    public String getnome() {

        return nome;
    }

    public void setId(int k) {
        this.id = k;
    }

    public int getId(int k) {
        return this.id;
    }

    public void setnome(String nome) {
        this.nome = nome;
    }

    public String getsenha() {
        return senha;
    }

    public void setsenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return nome + "," + senha;
    }
}
