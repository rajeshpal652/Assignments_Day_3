package day_3;
/*
 * Author : Rajesh
 * Printing the Largest element of the array.
 */
public class LargestElementofArray {
	public static void main(String[] args) {  
		    
        int [] arr = new int [] {35, 65, 28, 797, 50};
        
        int max = arr[0];
        
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max)  
            max = arr[i];  
        } 
        System.out.println("Largest element present in the array: " + max);  
    }  

}
