package 백준;

import java.util.Scanner;

public class Number16120 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		char ans[] = new char[s.length()];
		
		int index = 0;
		while(true) {
			if(index+3 >= s.length()) break;
			if(s.charAt(index) == 'P' && s.charAt(index+1) == 'P' && s.charAt(index+2)=='A' && s.charAt(index+3) == 'P') {
				index = index+3;
			} else index++;
		}
		
		if(index+3 < s.length()) {
			if()
		} else System.out.println("NP");
		
		if(a.length==4 && a[index] == 'P' && a[index+1] == 'P' && a[2] == 'A' && a[3] == 'P') {
			System.out.println("PPAP");
		}
		scanner.close();
	}
}
