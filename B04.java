import java.util.Scanner;;
public class B04 {

	public static void main(String[] args) {
		new B04().result();		
	}
	
	public void result(){
		Scanner s = new Scanner(System.in);
		System.out.print("연봉을 원단위로 입력하세요 ");
		int num = s.nextInt();	// 연봉
		
		double num2 = 0; // 소득세 알아낼 녀석
		if(num >= 80000000){
			num2 = 37.0;
		}
			else if(num >= 40000000){
			num2 = 28.0;
		}
			else if(num >= 10000000){
			num2 = 19.0;
		}
		else{
			num2 = 9.5;
		}
		
		double result = (double)num * num2;	// 소득세
		
		System.out.println("연봉 금액에 대한 소득세는 "+(int)result+"입니다.");
	}

}
