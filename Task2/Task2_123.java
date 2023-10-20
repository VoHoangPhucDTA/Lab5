package Task2;

public class Task2_123 {
	private static final char EMPTY = ' ';
	private char[][] board;

	/*
	 * This method checks all rows and returns true if any of them are marked with
	 * all of a single player's markers. Otherwise, returns false.
	 */

	public Task2_123(char[][] board) {
		this.board = board;
	}

	public boolean checkRows(char symbol) {
		for (int i = 0; i < board.length; i++) {
			if ((board[i][0] == symbol) && (board[i][1] == symbol) && (board[i][2] == symbol)) {
				return true;
			}
		}
		return false;
	}

	public boolean checkCols(char symbol) {
		for (int i = 0; i < board.length; i++) {
			if ((board[0][i] == symbol) && (board[1][i] == symbol) && (board[2][i] == symbol)) {
				return true;
			}
		}
		return false;
	}

	public boolean checkDiagonals(char symbol) {
		for (int i = 0; i < board.length; i++) {
			// check đường chéo chính
			if (board[0][i] != symbol && board[1][i] != symbol && board[2][i] != symbol) {
				return false;
			}
			// check đường chéo phụ
			if (board[0][board.length-i-1] != symbol
					&& board[1][board.length-i-1] != symbol
					 && board[2][board.length-i-1] != symbol) {
				return false;
			}
		}
		return true;
	}

	public void display() {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		char[][] board = { { 'X', 'X', 'X' }, { 'O', 'X', 'O' }, { 'O', 'O', 'X' } };

		char symbolX = 'X';
		char symbolO = 'O';

		Task2_123 myBoard = new Task2_123(board);
		myBoard.display();

		System.out.println("CHECK CHO PLAYER X: ");
		System.out.print("Check Row: ");
		System.out.println(myBoard.checkRows(symbolX));

		System.out.print("Check Col: ");
		System.out.println(myBoard.checkCols(symbolX));

		System.out.print("Check Diagonal: ");
		System.out.println(myBoard.checkDiagonals(symbolX));

	}

}
