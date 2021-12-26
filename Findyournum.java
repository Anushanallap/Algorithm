package Algorithm;

import java.util.Scanner;

public class Findyournum {
	
	Scanner sc = new Scanner(System.in);

	public void Findyournum() {
		System.out.println("Number between 1 to 100");
		int firstnum = 0;
		int lastnum = 100;
		
		while ((lastnum - firstnum) > 0) {

			int mid = ((firstnum + lastnum) / 2);

			System.out.println("Is" + mid + "your number? \n(yes or no)");
			String ch = sc.next().toLowerCase();

			if (ch.equals("yes")) {
				System.out.println("Your number is : " + mid);
				break;
			} else {
				System.out.println("Is your number between " + firstnum + " and " + lastnum + " ?\n(yes or no)");
				String ch2 = sc.next().toLowerCase();
				if (ch2.equals("yes")) {
					firstnum = mid;
//				leftNumber=0;
				} else {
					lastnum = mid;
				}
			}
		}
	}
		
		public static void main(String[] args) {
			
			Findyournum game = new Findyournum();
			game.Findyournum();
		}

		
	}

