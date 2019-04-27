package com.array.one;

public class SumOfArrayValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={1,2,3,4,5,6,7,8,9};
		System.out.println(sumOfArrayValues(a));
	}
	
	public static int sumOfArrayValues(int[] values){
//		Approach 1
		int result=0;
		for (int i = 0; i < values.length; i++) {
			result +=values[i];
		}
		return result;
	}

}
