package gtp.calendar;

import java.util.Scanner;

public class Prompt {
	
	private final static String PROMPT = "cal> ";
		
	public void runPrompt() {
		Scanner scanner = new Scanner(System.in);
		Calendar cal = new Calendar();
		
		int month = 1;
		
		while(true) {
			System.out.println("월을 입력하세요. :");
			System.out.println(PROMPT);
			
			month = scanner.nextInt();
			
			if(month == -1) {
				break;
			}
			
			if(month > 12) {
				continue;
			}
			
//			System.out.printf("%d월은 %d일까지 있습1니다.", month, cal.getMaxDaysOfMonth(month));
			cal.printCalendar(2019, month);
		}
		
		System.out.println("Bye~~~");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prompt p = new Prompt();
		p.runPrompt();

	}

}
