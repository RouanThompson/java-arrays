package com.FirstJavaSteps;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//    	 this is an older way to initialize an array
//	    int [] numbers = new int[5];
//	    numbers[0] = 1;
//	    numbers[1] = 2;
//		System.out.println(Arrays.toString(numbers));
//		 by default Java returns the string which based on its address in memory
//		 That is why I had to convert the int array to a string version. A new array is returned.
//
//		 Another way to initialize an array
		int [] numbers = {2, 3, 5, 4, 1};
		System.out.println(numbers.length);
		System.out.println(Arrays.toString(numbers));
		Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers));
    }
}
