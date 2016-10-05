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
		System.out.print("아파트의 분양 면적(제곱미터)을 입력하시오. ");
		double m2_area = s.nextDouble();	// 면적 (제곱미터)
		
		double	pyung_area = m2_area / 3.305f;	// 면적 (평수)
				
		if(pyung_area >= 50){
			result = "대형";
		}else if(pyung_area >= 30){
			result = "중형";
		}else if(pyung_area >= 15){
			result = "중소형";
		}else {
			result = "소형";
		}
		
		String result2 = rr(Double.toString(pyung_area));	// 소수점 자릿수 #.# 로 조정
		
		
		System.out.println("아파트의 평형은 "+result2+" 입니다.\n"+result+" 아파트 입니다.");
			}

}
