package homework3;

import java.util.Scanner;
public class Report3 {

	public static void main(String[] args) {
		result();
	}
	
	public static void result(){
		Scanner s = new Scanner(System.in);
		int []year = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
					//   1	  2	 3    4   5  6   7   8   9   10  11  12 ��
		
		System.out.print("���� �Է��Ͻÿ�. ");
		int month = s.nextInt();		// ��, ����� �Է�
		if(month >= 13){
			System.out.print("�߸� �Է��ϼ̽��ϴ�. ");	// 13�� �̻� �� �Է½�
			month = s.nextInt();
		}
		
		System.out.print("���� �Է��Ͻÿ�. ");
		int day = s.nextInt();			// ��, ����� �Է�
		if(day >= 32){
			System.out.print("�߸� �Է��ϼ̽��ϴ�. ");	//32�� �̻� �� �Է½�
			day = s.nextInt();
		}
				
		int day_count = 0;			// 1�� �� �� ��
		for(int i=0; i < month; i++)
		{
			day_count = day_count + year[i];
		}
		
		day_count = day_count + day;
		
		System.out.println("�� ��¥�� 1���� "+day_count+" ��° ���� �ش�˴ϴ�.");
	}

}
