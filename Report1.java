package homework3;

import java.util.Scanner;
public class Report1 {

	public static void main(String[] args) {
		result();
	}
	
	public static void result(){
		int num1, num2, num3;	// 1,2,3번째 숫자
		int max_num =0;
		int min_num = 0;	// 가장 큰 숫자, 가장 작은 숫자
		Scanner s = new Scanner(System.in);
		
		System.out.print("첫번째 숫자를 입력하세요 ");
		num1 = s.nextInt();
		System.out.print("두번째 숫자를 입력하세요 ");
		num2 = s.nextInt();
		System.out.print("세번째 숫자를 입력하세요 ");
		num3 = s.nextInt();
		
		if(num1 < num2){
			if(num2 < num3){
				max_num = num3; min_num = num1;
			}else{
				max_num = num2; min_num = num1;
			}
		}else if(num1 < num3){
			max_num = num3; min_num = num2;
		}else if(num2 < num3){
			max_num = num1; min_num = num2;
		}else{
			max_num = num1; min_num = num3;
			
		}
		
		
		System.out.println("가장 큰 수는 "+max_num+" 이고, 가장 작은 수는 "+ min_num+" 입니다.");
		
	}

}
