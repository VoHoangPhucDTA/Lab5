package Task2;

public class Task2_4 {
	private char[][] board;
	private int size;
	private static final char EMPTY = ' ';
	
	public Task2_4(char[][] board, int size) {
		this.board = board;
		this.size = size;
	}
	
	
	public boolean checkRows(char symbol, int row) {
		for (int i = 0; i < size; i++) {
			if (board[row][i] != symbol) {
				return false;
			}
		}
		return true;
	}

	public boolean checkCols(char symbol, int col) {
		for (int i = 0; i < size; i++) {
			if (board[i][col] != symbol) {
				return false;
			}
		}
		return true;
	}

	
	
	public boolean checkDiagonals(char symbol) {
		for (int i = 0; i < size; i++) {
			if (board[i][i] != symbol) {
				return false;
			}
			if (board[i][size-1-i] != symbol) {
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
		char[][] board = {{'X','O','X','O','O'},{'O','O','X','O','O'},
				{'O','O','X','X','X'}, {'O','O','X','X','O'}, {'X','O','O','X','X'},
		};
		Task2_4 myBoard = new Task2_4(board,5);
		myBoard.display();
		
		char symbolX = 'X';
		char symbolO = 'O';
		System.out.println("--------------");
		
		System.out.println("CHECK CHO PLAYER O: ");
		System.out.print("Check Row Thứ 3: ");
		System.out.println(myBoard.checkRows(symbolO, 2));

		System.out.print("Check Col 2: ");
		System.out.println(myBoard.checkCols(symbolO, 1));

		System.out.print("Check Diagonal: ");
		System.out.println(myBoard.checkDiagonals(symbolO));

		
		
	}
}
