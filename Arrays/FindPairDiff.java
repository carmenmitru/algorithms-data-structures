import java.io.*;
import java.util.*;
class Solution {
	 public static int[][] findPairsWithGivenDifference(int[] arr, int k) {
	  {
		//Edge cases
		if (arr == null || arr.length < 2)
		 return new int[0][0];

		Arrays.sort(arr);
		List < int[] > ls = new ArrayList < int[] > ();
		int i = 0;
		int j = 1;

		while (i < arr.length && j < arr.length) {
		 if (i != j && arr[j] - arr[i] == k) {
		  ls.add(new int[] {
			arr[j], arr[i]
		  });
		  i++;
		  j++;
		 } else if (arr[j] - arr[i] < k) {
		  j++;
		 } else {
		  i++;
		 }

		}


		int[][] result = ls.toArray(new int[1][ls.size()]);
		return result;

	  }
	 }
	public static void main(String[] args) {
		int[]  arr1 = new int[]{0, -1, -2, 2, 1};
		int k = 1;
		int[][] res = findPairsWithGivenDifference(arr1,k);
		if(res.length == 0 || res[0].length == 0){
			System.out.print("No pairs found ");

		}else{
			for(int i = 0; i < res.length; i++){
				for(int j = 0; j < res[0].length; j++){
					System.out.print(res[i][j] + " ");
				}
				System.out.print("\n");

			}
		}
		
		
	}
}