package boardgame;

public class BoardException extends RuntimeException { // exceção opciaonal de ser tratada
	private static final long serialVersionUID = 1L; 

	public BoardException(String msg) {
		super(msg);
	}
}
