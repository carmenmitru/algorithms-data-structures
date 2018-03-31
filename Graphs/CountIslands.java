import java.util.*;
class CountIslands {
	
	public static int countIslands(int binaryMatrix[][]){
		int islands = 0;
		int rows = binaryMatrix.length;
		int cols = binaryMatrix[0].length;
		for(int i = 0; i < rows; i++){
			for(int j = 0; j < cols; j++){
				if(binaryMatrix[i][j] == 1){
					markIslandBFS(binaryMatrix,i,j);
					islands++;  
				}
			}
		}
		return islands;
	}
	
	/* DFS  */
	public static void markIslandDFS(int [][] binaryMatrix, int x, int y){
		int rows = binaryMatrix.length;
		int cols = binaryMatrix[0].length;
		if(x < 0  || x >= rows || y < 0 || y >= cols || binaryMatrix[x][y] != 1) return;
		binaryMatrix[x][y] = -1;
		markIslandDFS(binaryMatrix,x-1,y);
		markIslandDFS(binaryMatrix,x+1,y);
		markIslandDFS(binaryMatrix,x,y-1);
		markIslandDFS(binaryMatrix,x,y+1);
	}
	/* BFS Version */
	public static void markIslandBFS(int [][] binaryMatrix, int i, int j){
		int rows = binaryMatrix.length;
		int cols = binaryMatrix[0].length;
		Queue<int[]> q  = new LinkedList<int[]>();
		int[] a = new int[2];
		a[0] = i;
		a[1] = j;
		q.add(a);
		while(!q.isEmpty()){
			int[] item = new int[2];
			item = q.poll();
			int x = item[0];
			int y = item[1];
			if(binaryMatrix[x][y] == 1){
				binaryMatrix[x][y] = -1;
				pushIfValid(q,rows,cols,x-1,y);
				pushIfValid(q,rows,cols,x+1,y);
				pushIfValid(q,rows,cols,x,y-1);
				pushIfValid(q,rows,cols,x,y+1);
			}
		}
	}
	public static void pushIfValid(Queue<int[]> q,int rows,int cols,int x,int y){
		if( x >= 0 && x < rows && y >= 0 && y < cols){
			int[] pos = new int[2];
			pos[0] = x;
			pos[1] = y;
			q.add(pos);
		}
	}
	public static void main(String[] args) {
		int n = 5;
	   
	    int[][] binaryMatrix = new int[][]{
				{ 0, 1, 0, 1, 0 },
				{ 0, 0, 1, 1, 0 },
				{ 1, 0, 0, 1, 0 },
				{ 0, 1, 1, 0, 0 },
				{ 1, 0, 1, 0, 1 }
			  };
	   
	   System.out.print("Number of islands : " + countIslands(binaryMatrix));
			   
	}
	
}
