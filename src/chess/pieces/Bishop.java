package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class Bishop extends ChessPiece{

	public Bishop(Board board, Color color) {
		super(board, color);
	}
	
	//Imprimir a pe�a
	@Override
	public String toString() {
		return "B";
	}

	@Override
	public boolean[][] possibleMoves() {
		boolean [][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
		
		Position p = new Position(0, 0);
		
		//NW
		p.setValues(position.getRow() - 1, position.getColumn() - 1); //posi��o da pe�a atual
		while(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) { // Enquanto posi��o p existir e n�o tiver pe�a na posi��o 
			mat[p.getRow()][p.getColumn()] = true;
			p.setValues(p.getRow() -1, p.getColumn()-1);
		}
		if(getBoard().positionExists(p) && isThereOpponentPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}
		
		//NE
		p.setValues(position.getRow() - 1, position.getColumn() + 1); //posi��o da pe�a atual
		while(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) { // Enquanto posi��o p existir e n�o tiver pe�a na posi��o 
			mat[p.getRow()][p.getColumn()] = true;
			p.setValues(p.getRow() -1, p.getColumn() +1);
		}
		if(getBoard().positionExists(p) && isThereOpponentPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}
		
		//SE
		p.setValues(position.getRow() + 1, position.getColumn() + 1); //posi��o da pe�a atual
		while(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) { // Enquanto posi��o p existir e n�o tiver pe�a na posi��o 
			mat[p.getRow()][p.getColumn()] = true;
			p.setValues(p.getRow() +1, p.getColumn() +1);
		}
		if(getBoard().positionExists(p) && isThereOpponentPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}
		
		//SW
		p.setValues(position.getRow() + 1, position.getColumn() - 1); //posi��o da pe�a atual
		while(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) { // Enquanto posi��o p existir e n�o tiver pe�a na posi��o 
			mat[p.getRow()][p.getColumn()] = true;
			p.setValues(p.getRow() +1, p.getColumn() -1);
		}
		if(getBoard().positionExists(p) && isThereOpponentPiece(p)) {
			mat[p.getRow()][p.getColumn()] = true;
		}
		
		return mat;
	}

}
