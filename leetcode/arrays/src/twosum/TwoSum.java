//Given an array of integers, return indices of the two numbers such that they add up to a specific target.
//
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//
//Example:
//
//Given nums = [2, 7, 11, 15], target = 9,
//
//Because nums[0] + nums[1] = 2 + 7 = 9,
//return [0, 1].






package twosum;

import java.util.Arrays;
import java.util.Scanner;

public class TwoSum {

	public int[] twoSum(int[] nums, int target) {
		int index[] = new int[2];
		for(int i=0; i<nums.length; i++) {
			for(int j=0; j<nums.length; j++) {
				if(nums[i]+ nums[j]== target && i!=j) {
				
					index[0]= i;
					index[1]= j;
					break;
					
					
				}
			}
		
		}
		return index;
		
		
		

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//length of the array
		System.out.println("Enter the number of elements in an array");
		int n= sc.nextInt();
		//value of those elements
		int nums [] = new int[n];
		System.out.println("Enter the elements");
		
		for(int i=0; i<n; i++) {
			nums[i]= sc.nextInt();
		}
		
		System.out.println("Enter the target");
		int target= sc.nextInt();
		int index[] = new int[2]; 
		TwoSum twosum= new TwoSum();
		index= twosum.twoSum(nums, target);
		System.out.println(Arrays.toString(index));
		
		
		
		
		

	}

}
