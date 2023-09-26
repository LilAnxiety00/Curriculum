package br.com.curriculum.curriculum.Model;

public class Experiencias {
    private String ano;
    private String lugar;
    private String cargo;
    private String resumo;

    
    public Experiencias(String ano, String lugar, String cargo, String resumo) {
        this.ano = ano;
        this.lugar = lugar;
        this.cargo = cargo;
        this.resumo = resumo;
    }
    public String getAno() {
        return ano;
    }
    public void setAno(String ano) {
        this.ano = ano;
    }
    public String getLugar() {
        return lugar;
    }
    public void setLugar(String lugar) {
        this.lugar = lugar;
    }
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public String getResumo() {
        return resumo;
    }
    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    
}
