package br.com.dio.desafio.dominio;

public class Artigo extends Conteudo {

    private int paginas;

    @Override
    public double calcularXp() {
        // Um artigo concede uma quantidade fixa de XP por página
        return XP_PADRAO + (paginas * 2);
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    @Override
    public String toString() {
        return "Artigo{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", paginas=" + paginas +
                '}';
    }
}