package gtp.calendar;

import java.util.Scanner;

public class Calendar {
	
	private static final int[] MAX_DAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	
	public int getMaxDaysOfMonth(int month) {
		return MAX_DAYS[month - 1];
	}

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("달을 입력하세요.");
//
//		int month = scanner.nextInt();
//
//		System.out.printf("%d월은 %d일까지 있습니다.", month, maxDays[month - 1]);
//		scanner.close();
//	}
	
	public void printCalendar(int year, int month) {
		System.out.printf(" <<< %4d %3d >>> \n", year, month);
		System.out.println(" SU MO TU WE TH FR SA");
		System.out.println(" ==================== ");
		
		int maxDay = getMaxDaysOfMonth(month);
		
		for(int i = 1; i<=maxDay; i++) {
			System.out.printf("%3d", i);
			
			if(i%7 == 0) {
				System.out.printf("\n");
			}
		}
		
		System.out.println();

//		System.out.println("  1   2    3    4    5    6    7");
//		System.out.println("  8   9   10   11   12   13   14");
//		System.out.println(" 15  16   17   18   19   20   21");
//		System.out.println(" 22  23   24   25   26   27   28");
		
	}

}
