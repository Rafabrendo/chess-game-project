package modelo;

public class Bispo extends Peca {

    public Bispo(EnumCor cor, int linha, int coluna, String imagem, boolean eliminada, boolean selecionada) {
        super(cor, linha, coluna, imagem, eliminada, selecionada);
    }

    @Override
    public boolean validaMovimento(int linhaDestino, int colunaDestino) {
        return true;
    }
    
}
