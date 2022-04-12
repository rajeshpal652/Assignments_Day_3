package day_3;
/*
 * Author : Rajesh
 * Printing the elements of array.
 */

public class PrintArray {
	
	public static void main(String[] args) {  
        //Initializing array  
        int [] arr = new int [] {10, 20, 30, 40, 50};  
        System.out.println("Elements of The array: ");
        
        for (int i = 0; i < arr.length; i++) {  
            System.out.print(arr[i] + " ");  
        }  
    } 

}
