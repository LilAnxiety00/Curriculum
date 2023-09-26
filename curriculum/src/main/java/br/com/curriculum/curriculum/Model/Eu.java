package br.com.curriculum.curriculum.Model;

public class Eu {
    private String nome;
    private String resumo;
    private String profissao;
    private String email;

    public Eu(){

    }

    public Eu(String nome, String resumo, String profissao, String email) {
        this.nome = nome;
        this.resumo = resumo;
        this.profissao = profissao;
        this.email = email;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getResumo() {
        return resumo;
    }
    public void setResumo(String resumo) {
        this.resumo = resumo;
    }
    public String getProfissao() {
        return profissao;
    }
    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }


}
