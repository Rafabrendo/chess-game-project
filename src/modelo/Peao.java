package modelo;

public class Peao extends Peca {

    public Peao(EnumCor cor, int linha, int coluna, String imagem, boolean eliminada, boolean selecionada) {
        super(cor, linha, coluna, imagem, eliminada, selecionada);
        
    }

    @Override
    public boolean validaMovimento(int linhaDestino, int colunaDestino) {
        return false;
    }
    
}
