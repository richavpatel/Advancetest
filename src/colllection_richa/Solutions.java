package colllection_richa;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solutions {

	public static void main(String[] args) {

		int[] nums = { 2, 7, 1, 6 };
		int target = 9;

		System.out.println("Using HashMap Index value of sum of two Int : " + Arrays.toString(twoSum(nums, target)));

		Map<Integer, Integer> numMap = new HashMap<>();
		numMap.put(1, 10);
		numMap.put(2, 20);
		numMap.get(1);
		// System.out.println("richa test" +numMap.containsKey(7));
		// System.out.println("richa test" +numMap.get(1));

		for (int i = 0; i < nums.length; i++) {
			numMap.put(nums[i], i);
			// System.out.println(nums[i]);//loop thi index ni value malse

		}

	}

	public static int[] twoSum(int[] nums, int target) {

		Map<Integer, Integer> numMap = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			numMap.put(nums[i], i); // loop thi index ni value malse

		}

		for (int i = 0; i < nums.length; i++) {

			int numToFind = target - nums[i];// 9-2 = 7
			if (numMap.containsKey(numToFind) && numMap.get(numToFind) != i) {
				return new int[] { i, numMap.get(numToFind) };
			}

		}
		return new int[0];
		// throw new IllegalArgumentException("S");

	}

}
