package homework3;

import java.util.Scanner;
import java.text.DecimalFormat;
public class Report2 {

	public static void main(String[] args) {
		result();
	}
	public static String rr(String str){
		float f = Float.parseFloat(str);
		DecimalFormat format = new DecimalFormat("#.#");
		String result = format.format(f);
		return result;
	}
	public static void result(){
		String result;
		Scanner s = new Scanner(System.in);
		System.out.print("����Ʈ�� �о� ����(��������)�� �Է��Ͻÿ�. ");
		double m2_area = s.nextDouble();	// ���� (��������)
		
		double	pyung_area = m2_area / 3.305f;	// ���� (���)
				
		if(pyung_area >= 50){
			result = "����";
		}else if(pyung_area >= 30){
			result = "����";
		}else if(pyung_area >= 15){
			result = "�߼���";
		}else {
			result = "����";
		}
		
		String result2 = rr(Double.toString(pyung_area));	// �Ҽ��� �ڸ��� #.# �� ����
		
		
		System.out.println("����Ʈ�� ������ "+result2+" �Դϴ�.\n"+result+" ����Ʈ �Դϴ�.");
			}

}
