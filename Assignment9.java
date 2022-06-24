package cap.datastructure;

import java.util.Scanner;

public class Assignment9 {

	public static void main(String args[]) {
		float sub1, sub2, sub3, avg;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the mark of three subs");
		sub1 = s.nextFloat();
		sub2 = s.nextFloat();
		sub3 = s.nextFloat();
		avg = (sub1 + sub2 + sub3) / 3;
		if (avg >= 80) {
			System.out.println("You are in A grade ");
		} else if (avg >= 60 && avg <= 80) {
			System.out.println("You are in B grade ");
		} else if (avg >= 50 && avg < 60) {
			System.out.println("You are in C grade ");
		} else {
			System.out.println("Fail ");
		}
	}

}
