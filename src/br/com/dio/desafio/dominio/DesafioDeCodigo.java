package br.com.dio.desafio.dominio;

public class DesafioDeCodigo extends Conteudo {

    private int nivelDificuldade;

    @Override
    public double calcularXp() {
        return XP_PADRAO * nivelDificuldade * 1.5;
    }

    public int getNivelDificuldade() {
        return nivelDificuldade;
    }

    public void setNivelDificuldade(int nivelDificuldade) {
        this.nivelDificuldade = nivelDificuldade;
    }

    @Override
    public String toString() {
        return "DesafioDeCodigo{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", nivelDificuldade=" + nivelDificuldade +
                '}';
    }
}