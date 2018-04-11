import java.util.*;
class Solution {
	public static List<Integer> findDisappearedNumbers(int[] nums) {
			List<Integer> ls = new ArrayList<Integer>();
			Set<Integer> s = new HashSet<Integer>();
			int l = nums.length;
			for(int i = 0; i <l;i++){
				s.add(nums[i]);
			}
			for(int i=1;i<=l;i++){
				if(!s.contains(i)){
					ls.add(i);
				}
			}
			return ls;
	}
	public static void main(String[] args) {
		int[] arr = new int[]{4,3,2,7,8,2,3,1};
		List<Integer> res = findDisappearedNumbers(arr);
		System.out.println("Numerele care lipsesc sunt : ");
		res.forEach(System.out::println);	
	}
}