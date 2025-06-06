package string;

import java.util.Arrays;

public class Reversestringwithoutusinginbuiltfunction {

	public static void main(String[] args) {

		String str="ShreeGanesha";
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);
		
		 String str1="listen"; 
		 String str2="silent";

	        char[] arr1 = str1.toCharArray(), arr2 = str2.toCharArray();

	        Arrays.sort(arr1);

	        Arrays.sort(arr2);

	        System.out.println("Anagram:  "+ Arrays.equals(arr1, arr2));
	}

}
