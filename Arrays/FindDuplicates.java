import java.io.*;
import java.util.*;
class Solution{
	public static int[] findDuplicates(int[] arr1, int[] arr2) {
		//Edge cases 
		if(arr1 == null || arr2 == null)
			return null;
		
		if(arr1.length == 0 || arr2.length == 0)
			return null;
		
		ArrayList<Integer> duplicates = new ArrayList<Integer>();
		int i = 0;
		int j = 0;

		while (i < arr1.length && j < arr2.length){
				
				if (arr1[i] == arr2[j]){
					duplicates.add(arr1[i]);
					i++;
					j++;
				}	
				else if (arr1[i] < arr2[j]){
					i++;
				}
			    else {
					j++;
				}	
		}
							
		int[] array = duplicates.stream().mapToInt(x->x).toArray();
		return array;

	}			
	public static void main(String args[]){
		int[] arr1 = new int[]{1, 2, 3, 5, 6, 7};
		int[] arr2 = new int[]{3, 6, 7, 8, 20};
		int res[] = findDuplicates(arr1,arr2);
		for(int i = 0; i < res.length;i++){
			System.out.print(res[i] + " ");
		}
	}
}
