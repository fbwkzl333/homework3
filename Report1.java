package homework3;

import java.util.Scanner;
public class Report1 {

	public static void main(String[] args) {
		result();
	}
	
	public static void result(){
		int num1, num2, num3;	// 1,2,3��° ����
		int max_num =0;
		int min_num = 0;	// ���� ū ����, ���� ���� ����
		Scanner s = new Scanner(System.in);
		
		System.out.print("ù��° ���ڸ� �Է��ϼ��� ");
		num1 = s.nextInt();
		System.out.print("�ι�° ���ڸ� �Է��ϼ��� ");
		num2 = s.nextInt();
		System.out.print("����° ���ڸ� �Է��ϼ��� ");
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
		
		
		System.out.println("���� ū ���� "+max_num+" �̰�, ���� ���� ���� "+ min_num+" �Դϴ�.");
		
	}

}
