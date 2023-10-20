package Task1;

public class Task1_1234 {
	public static int[][] add(int[][] a, int[][] b) {
		// condition
		if (a.length != b.length || a[0].length != b[0].length) {
			return null;
		}
		
		
		int[][] result = new int[a.length][a[0].length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				result[i][j] = a[i][j] + b[i][j];
			}
		}
		return result;
	}
	
	public static int[][] subtract(int[][] a, int[][] b) {
		// condition
		if (a.length != b.length || a[0].length != b[0].length) {
			return null;
		}
		
		
		int[][] result = new int[a.length][a[0].length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				result[i][j] = a[i][j] - b[i][j];
			}
		}
		return result;
	}
	
	
	public static int[][] mutiply(int[][] a, int[][] b) {
		if (a.length != b[0].length) return null;
		int[][] result = new int[a.length][b[0].length];
		
		
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {
				for (int k = 0; k < a[0].length; k++) {
					result[i][j] += a[i][k] * b[k][j];
				}
			}
		}
		
		return result;
	}
	
	
	public static int[][] transpose(int[][] matrix) {
		int[][] result = new int[matrix[0].length][matrix.length];
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {
				result[i][j] = matrix[j][i];
			}
		}
		return result;
	}
	
	

	
	
	
	public static void display(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	
	public static void main(String[] args) {
		int[][] matrix1 = {{7,2},{5,3}};
		int[][] matrix2 = {{2,1},{3,1}};
		
		int[][] matrix3 = {{1,2,3},{4,5,6}};
		int[][] matrix4 = {{7,8},{9,10},{11,12}};
		System.out.println("Cộng 2 ma trận: ");
		
		
		display(add(matrix1, matrix2));
		System.out.println();
		
		
		System.out.println("Trừ 2 ma trận: ");
		display(subtract(matrix1, matrix2));
		System.out.println();
		
		System.out.println("Nhân 2 ma trận");
		display(mutiply(matrix3, matrix4));
		System.out.println();
		
		System.out.println("Ma trận chuyển vị: ");
		display(transpose(matrix4));
		
	}
	
	
	
}
