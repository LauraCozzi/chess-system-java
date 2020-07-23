package boardgame;

public class Board {
	
	private int rows;
	private int columns;
	private Piece[][] pieces;
	
	//Cria o tabuleiro
	public Board(int rows, int columns) {
		if(rows < 1 || columns < 1) {
			throw new BoardException("Error creating board: there must be at least 1 row and 1 column.");
		}
		this.rows = rows;
		this.columns = columns;
		this.pieces = new Piece[rows][columns];
	}

	public int getRows() {
		return rows;
	}

	public int getColumns() {
		return columns;
	}
	
	//Retorna a peça na linha e coluna informada
	public Piece piece(int row, int column) {
		if(!positionExists(row, column)) {
			throw new BoardException("Position not on the board.");
		}
		return this.pieces[row][column];
	}
	
	public Piece piece(Position position) {
		if(!positionExists(position)) {
			throw new BoardException("Position not on the board.");
		}
		return this.pieces[position.getRow()][position.getColumn()];
	}
	
	//Coloca a piece na position informada
	public void placePiece(Piece piece, Position position) {
		if(thereIsAPiece(position)) {
			throw new BoardException("There is already a piece on position " +position +".");
		}
		pieces[position.getRow()][position.getColumn()] = piece;
		piece.position = position;
	}
	
	//Remove a peça na posição
	public Piece removePiece(Position position) {
		if(!positionExists(position)) {
			throw new BoardException("Position not on the board.");
		}
		if(piece(position) == null) { // não tem peça na posição
			return null;
		} else {
			Piece aux = piece(position);
			aux.position = null;
			pieces[position.getRow()][position.getColumn()] = null;
			return aux;
		}
	}
	
	//Se essa posição existe
	public boolean positionExists(int row, int column) {
		return row >= 0 && row < this.rows && column >= 0 && column < this.columns;
	}
	
	public boolean positionExists(Position position) {
		return positionExists(position.getRow(), position.getColumn());
	}
	
	//se nessa posição existe uma peça
	public boolean thereIsAPiece(Position position) {
		if(!positionExists(position)) {
			throw new BoardException("Position not on the board.");
		}
		return piece(position) != null;
	}
	
	
}
