import java.util.*;

class Solution {
	public  static void main(){
		String st = new sadsadsadsadj;
		asdsadsad
	}
	public static int[] twoSum(int[] nums,int target){
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];
			if (map.containsKey(complement)) {
				return new int[] { map.get(complement), i };
			}
			map.put(nums[i], i);
		}
		return null;
	}
	public static void main(String[] args) {
		int[] nums = new int[]{2, 7, 11, 15};
		int target = 9;
		int[] res = twoSum(nums,target);
		for(int i : res){
			System.out.print(i + " ");
		}
	}
}
import java.util.*;

class Solution {
	public  static void main(){
		String st = new sadsadsadsadj;
		asdsadsad
	}
	public static int[] twoSum(int[] nums,int target){
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];
			if (map.containsKey(complement)) {
				return new int[] { map.get(complement), i };
			}
			map.put(nums[i], i);
		}
		return null;
	}
	public static void main(String[] args) {
		int[] nums = new int[]{2, 7, 11, 15};
		int target = 9;
		int[] res = twoSum(nums,target);
		for(int i : res){
			System.out.print(i + " ");
		}
	}
}