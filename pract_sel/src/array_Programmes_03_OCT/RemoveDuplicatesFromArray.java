package array_Programmes_03_OCT;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicatesFromArray {

	public static void main(String[] args) {
		
		Scanner scr=new Scanner(System.in);
		System.out.println("enter length of array");
		int arraylen=scr.nextInt();
		
		int[] arr=new int[arraylen];
		System.out.println("Enter elements in array with duplicate values");
		for(int i=0;i<arraylen;i++) {
			arr[i]=scr.nextInt();
		}
		System.out.println("array before dupicate remove"+Arrays.toString(arr));
		Set<Integer> uniqueElements=new HashSet<>();
		for(int num:arr) {
			uniqueElements.add(num);
		}
		
		int[] resultArray=new int[uniqueElements.size()];
		int index=0;
		for(int num:uniqueElements) {
			resultArray[index++]=num;
		}
		
		System.out.println("array after dupicate remove"+Arrays.toString(resultArray));
		
		scr.close();
	}

}
