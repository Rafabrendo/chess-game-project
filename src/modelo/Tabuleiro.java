package modelo;

public class Tabuleiro {
    
    private Peca[][] pecas;
    private Peca pecaSelecionada = null;
    private EnumCor vez = EnumCor.BRANCO;

    public static final int TEMPO_JOGADA = 10000;

    public Tabuleiro(int linhas, int colunas ){
        this.pecas = new Peca[linhas][colunas];
    }

    public Peca getPeca(int linha, int coluna){
        return this.pecas[linha][coluna];
    }

    public void adicionaPeca(Peca peca){
        this.pecas[peca.getLinha()][peca.getColuna()] = peca;
        peca.setTabuleiro(this); //O this está referenciando o objeto em questão(tabuleiro)
    }

    public void selecionaPeca(Peca peca){
        if(peca.isSelecionada()){ // no caso da peça estar já selecionada, ele desmarca
            peca.setSelecionada(false);
            this.pecaSelecionada = null;
        } else { //no caso da peça não estar selecionada, ele marca a peça
            peca.setSelecionada(true);
            this.pecaSelecionada = peca;
        }
    }

    public void movePeca(Peca peca, int novaLinham, int novaColuna){
        
    }

    public void inverteVez(){
        // if(this.vez == EnumCor.BRANCO){
        if(this.vez.equals(EnumCor.BRANCO)){ //equals é para comparar um objeto com outro
            this.vez = EnumCor.PRETO;
        }else{
            this.vez = EnumCor.BRANCO;
        }
    }

    

}
