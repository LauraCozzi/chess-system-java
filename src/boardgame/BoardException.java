package boardgame;

public class BoardException extends RuntimeException { // exce��o opciaonal de ser tratada
	private static final long serialVersionUID = 1L; 

	public BoardException(String msg) {
		super(msg);
	}
}
