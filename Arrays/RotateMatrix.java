class Solution {
	public static void setZeroes(int[][] matrix) {
		if(matrix==null){
			return;
		}
		
		int m = matrix.length;
		int n = matrix[0].length;
		
		boolean rowHasZero = false;
		boolean colHasZero = false;
		
		for(int i=0; i<n; i++){
			if(matrix[0][i]==0){
				rowHasZero = true;
				break;
			}
		}
		
		for(int i=0; i<m; i++){
			if(matrix[i][0]==0){
				colHasZero = true;
				break;
			}
		}
		
		for(int i=1; i<m; i++){
			for(int j=1; j<n; j++){
				if(matrix[i][j]==0){
					matrix[i][0] = 0;
					matrix[0][j] = 0;
				}
			}
		}
		

		
		for(int j=1;j<n; j++){
			if(matrix[0][j]==0){
				nullifyCol(matrix, j, m, n);
			}
		}
		
		for(int i=1; i<m; i++){
			if(matrix[i][0]==0){
				nullifyRow(matrix, i, m, n);
			}
		}
		
		if(rowHasZero){
			nullifyRow(matrix, 0, m, n);
		}
		if(colHasZero){
			nullifyCol(matrix, 0, m, n);
		}
		
	}
	
	public static void nullifyRow(int[][] matrix, int i, int m, int n){
		for(int col=0; col<n; col++){
			matrix[i][col] = 0;
		}
	}
	
	public static void nullifyCol(int[][] matrix, int j, int m, int n){
		for(int row=0; row<m; row++){
			matrix[row][j] = 0;
		}
	}
	public static void displayMatrix(int[][] matrix){
		for(int i = 0 ; i < matrix.length; i++){
			for(int j = 0; j<matrix.length; j++){
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
	public static void main(String args[]){
		int[][] matrix = new int[][]{
			{1,2,0},
			{4,5,6},
			{7,8,9}
		};
		setZeroes(matrix);
		displayMatrix(matrix);
	}
}