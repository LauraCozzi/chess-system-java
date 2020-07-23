package boardgame;

public abstract class Piece {
	
	protected Position position; // não será visivel na camada do xadrez
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		this.position = null;
	}

	protected  Board getBoard() {
		return board;
	}

	public abstract boolean[][] possibleMoves();
	
	public boolean possibleMove(Position position) {
		return possibleMoves()[position.getRow()][position.getColumn()];
	}
	
	//Ver se a peça possui pelo menos 1 movimento possível
	public boolean isThereAnyPossibleMove() {
		boolean[][] mat = possibleMoves();
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat.length; j++) {
				if(mat[i][j])
					return true;
			}
		}
		return false;
	}
}
