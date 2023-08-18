package com.cts;

public class Details {

	public static void main(String[] args) {

		//           0123456
		String s1 = "Welceome";
		
		//To find the index position of the given char
		int indexOf = s1.indexOf("e");
		System.out.println(indexOf);
		
		int indexOf2 = s1.indexOf("e", 2);
		System.out.println(indexOf2);
		
		//To find the last occurrence of the given char
		int lastIndexOf = s1.lastIndexOf("e");
		System.out.println(lastIndexOf);

		//To find the char by passing the index
		char charAt = s1.charAt(3);
		System.out.println(charAt);
	}

}
