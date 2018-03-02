import java.io.*;
import java.util.*;

class Solution {

	public static int[] meetingPlanner(int[][] slotsA, int[][] slotsB, int dur) {
		
		//indices to loop through slots
		int ia = 0;
		int ib = 0;

		while (ia < slotsA.length && ib < slotsB.length) {

			int start = Math.max(slotsA[ia][0], slotsB[ib][0]);
			int end = Math.min(slotsA[ia][1], slotsB[ib][1]);
			if (start + dur <= end) {
				int[] res = new int[2];
				res[0] = start;
				res[1] = start + dur;
				return res;
			}
			if (slotsA[ia][1] < slotsB[ib][1]) {
				ia++;
			} else {
				ib++;
			}



		}

		return new int[0];
	}

	public static void main(String[] args) {
		int[][] slotsA = new int[][]{
			{ 10, 50 },
			{ 60, 120 },
			{ 140, 210 }
		 };
		int[][] slotsB = new int[][]{
			{ 0, 15 },
			{60, 70 }
		};
		int dur = 8;
		int[] res = meetingPlanner(slotsA,slotsB,dur);
		if(res.length == 0){
			System.out.print("No interval found");
		}else{
			System.out.print(res[0] + " " + res[1]);
		}
		
	
	}

}
