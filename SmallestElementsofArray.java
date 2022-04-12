package day_3;
/*
 * Author : Rajesh
 * Printing the smallest elements of array.
 */

public class SmallestElementsofArray {
	
	public static void main(String[] args) {  
		  
        int [] arr = new int [] {35, 65, 28, 797, 50};
        
        int min = arr[0];
        
        for (int i = 0; i < arr.length; i++) {
        	
            if(arr[i] <min)
            min = arr[i];
        }
        System.out.println("Smallest element present in the array: " + min); 
    }

}
