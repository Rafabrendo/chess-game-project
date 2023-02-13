package modelo;

public abstract class Peca {
    
    private EnumCor cor;
    private Integer linha, coluna;
    private String imagem; // nome do arquivo que tem a imagem
    private Boolean eliminada = false;
    private Boolean selecionada = false;

    public Peca(EnumCor cor, int linha, int coluna, String imagem, boolean eliminada, boolean selecionada){
        this.cor = cor;
        this.linha = linha;
        this.coluna = coluna;
        this.imagem = imagem;
        this.eliminada = eliminada;
        this.selecionada = selecionada;
    }

    public abstract boolean validaMovimento(int linhaDestino, int colunaDestino);

    public EnumCor getCor() {
        return this.cor;
    }

    public void setCor(EnumCor cor) {
        this.cor = cor;
    }

    public Integer getLinha() {
        return this.linha;
    }

    public void setLinha(Integer linha) {
        this.linha = linha;
    }

    public Integer getColuna() {
        return this.coluna;
    }

    public void setColuna(Integer coluna) {
        this.coluna = coluna;
    }

    public String getImagem() {
        return this.imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public Boolean isEliminada() {
        return this.eliminada;
    }

    public void setEliminada(Boolean eliminada) {
        this.eliminada = eliminada;
    }

    public Boolean isSelecionada() {
        return this.selecionada;
    }

    public void setSelecionada(Boolean selecionada) {
        this.selecionada = selecionada;
    }
}
