package day_3;
/*
 * Author : Rajesh
 * Printing the Odd elements of array.
 */

public class OddElementsofArray {
	
	public static void main(String[] args) {
	    
        int [] arr = new int [] {10, 20, 30, 40, 50}; 
  
        System.out.println("Elements of the array present on even position: ");
 
        for (int i = 0; i < arr.length; i = i+2) {
            System.out.println(arr[i]);
        }
    }
	
	
	
	
}
	