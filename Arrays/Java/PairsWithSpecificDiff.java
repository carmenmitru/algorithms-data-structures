import java.util.*;
class Solution {
	/*
	 arr = [0, -1, -2, 2, 1]
	 k = 1
	
	 output: [[0, -1], [-1, -2], [2, 1], [1, 0]]
	*/
	static int[][] findPairsWithGivenDifference(int[] arr, int k) {
		 if(arr==null || arr.length<2){
			return new int[0][0];
		 }	
				
		Arrays.sort(arr);
		List<int[]> ls = new ArrayList<int[]>();
		for(int i = 0;i < arr.length; i++){
			if(binarySearch(arr,arr[i] + k)	== true){ 
					ls.add(new int[]{arr[i],arr[i]+k});
			}
		}
		
return ((ls.size() == 0) ?  null : ls.toArray(new int[1][ls.size()]));
		
					 
	}
	 static boolean binarySearch(int [] arr,int el){
		int begin = 0;
		int end = arr.length-1;
		
		while(begin<=end){
		   int middle = (begin + end) / 2;
		   if(arr[middle] == el) {
				return true;
		   }
		   if(arr[middle] < el) {
				begin = middle + 1;
		   }
		   if(arr[middle] > el) {
				end = middle - 1;
		   }
		}
		return false;
	  }
	public static void main(String[] args) {
		int[] arr = new int[]{0, -1, -2, 2, 1};
		int k = 12;
		int[][] res = findPairsWithGivenDifference(arr,k);
		if(res == null){
			System.out.print("No solution found");
		}else{
			for(int i = 0; i<res.length; i++){
				System.out.print("[ " + res[i][0] + ", " + res[i][1] + "]\n");
			}
		}
		
	}
}
