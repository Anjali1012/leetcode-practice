package threesum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
	public List<List<Integer>> threeSum(int[] nums) {
		Arrays.sort(nums);
		List<List<Integer>> lists = new ArrayList();
		int length = nums.length - 2;
		int i = 0;
		int e, f;
		int c;

		while (i < length) {
			// nums[i]!=nums[i-1] for saving time as we've already done the same computation
			// once for last element
			if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
				e = i + 1;
				// a+b+c=0 hence a+b=-c programmatically a+b==-c
				c = -(nums[i]);
				f = length + 1;
				while (e < f) {
					if (nums[e] + nums[f] == c) {
						List<Integer> list = new ArrayList();
						list.add(nums[e]);
						list.add(nums[f]);
						list.add(nums[i]);
						lists.add(list);
						// for duplicate pairs
						while (e < f && nums[e] == nums[e + 1])
							++e;
						while (e < f && nums[f] == nums[f - 1])
							--f;
						++e;
						--f;
					} else if (nums[e] + nums[f] > c)
						--f;
					else
						++e;
				}
			}
			++i;
		}
		return lists;
	}
}