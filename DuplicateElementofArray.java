package day_3;
/*
 * Author : Rajesh
 * Checking the duplicate elements of array.
 */
public class DuplicateElementofArray {
	
	public static void main(String[] args) {
		
        int [] arr = new int [] {20, 40, 80, 30, 90, 40, 80, 70, 20};  
          
        System.out.println("Duplicate elements in given array: ");
        
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] == arr[j])
                    System.out.println(arr[j]);
            }
        }
    }

}
