package Basics;

public class tryOnMe {
	public static void repeatChar (String myChar,int size) {
		System.out.println(new String(new char[size]).replace("\0", myChar));  
	}
	public static void main(String[] args) {
		repeatChar("+",12);
	}
}
