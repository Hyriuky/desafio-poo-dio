package br.com.dio.desafio.dominio;

public class Instrutor {
    private String nome;
    private String especialidade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    @Override
    public String toString() {
        return "Instrutor{" +
                "nome='" + nome + '\'' +
                ", especialidade='" + especialidade + '\'' +
                '}';
    }
}