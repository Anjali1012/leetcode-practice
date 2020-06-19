package threesum;

import java.util.*;

class TestList {
	public static void main(String gg[]) {
		List<Integer> magic = new ArrayList();
		List<Integer> magic1 = new ArrayList();
		List<Integer> magic2 = new ArrayList();
		// adding elements in list named as magic
		
		magic.add(22);
		magic.add(222);
		magic.add(33);
		if(magic.get(2).equals(33)==true) {
			System.out.println("hurray");
		}
		
		int nums[]= new int[3];
		nums[0]=1;
		nums[1]=3;
		nums[2]=4;
		List list = Arrays.asList(nums);
		if((list.get(0).equals(1))==true) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}

	}
}