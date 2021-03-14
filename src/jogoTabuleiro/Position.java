package jogoTabuleiro;

public class Position {
	
	public Position(int linha, int coluna) {		
		this.linha = linha;
		this.coluna = coluna;
	}

	private int linha;
	private int coluna;
	
	
	
	public void setColuna(int coluna) {
		this.coluna = coluna;
	}
	
	public int getColuna() {
		return this.coluna;
	}

	public int getLinha() {
		return linha;
	}

	public void setLinha(int linha) {
		this.linha = linha;
	}
	
	@Override
	public String toString() {
		return linha + ", " + coluna;
	}

	
}
