package boardgame;

public class Piece {
	
	protected Position position; // não será visivel na camada do xadrez
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		this.position = null;
	}

	protected  Board getBoard() {
		return board;
	}

	
	

}
