package homework3;

import java.util.Scanner;
public class Report3 {

	public static void main(String[] args) {
		result();
	}
	
	public static void result(){
		Scanner s = new Scanner(System.in);
		int []year = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
					//   1	  2	 3    4   5  6   7   8   9   10  11  12 월
		
		System.out.print("월을 입력하시오. ");
		int month = s.nextInt();		// 월, 선언및 입력
		if(month >= 13){
			System.out.print("잘못 입력하셨습니다. ");	// 13월 이상 값 입력시
			month = s.nextInt();
		}
		
		System.out.print("일을 입력하시오. ");
		int day = s.nextInt();			// 일, 선언및 입력
		if(day >= 32){
			System.out.print("잘못 입력하셨습니다. ");	//32일 이상 값 입력시
			day = s.nextInt();
		}
				
		int day_count = 0;			// 1년 중 날 수
		for(int i=0; i < month; i++)
		{
			day_count = day_count + year[i];
		}
		
		day_count = day_count + day;
		
		System.out.println("이 날짜는 1년중 "+day_count+" 번째 날에 해당됩니다.");
	}

}
