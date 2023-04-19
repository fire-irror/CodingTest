/*주사위의 눈의 수는 1~6 주사위를 10번 던져서 전체 금액은 얼마인가.?
 * 조건 : 1:500원 2:700원 3:1200원 4:1800원 5:2100원 6:3000*/

package pack06;

public class MathEx {
	public static void main(String args[]) {
//		System.out.println(Math.PI);
//		System.out.println(Math.ceil(3.14));	//무조건 올림값
//		System.out.println(Math.floor(3.14));	//무조건 내림값
//		System.out.println(Math.sqrt(9));		//루트(제곱근)
//		System.out.println(Math.exp(2));		//E 는 자연대수인데 2.718282로 설정 
//		System.out.println(Math.round(3.14));	//소수점 이하 첫째자리 수 반올림
		
		//1~45까지의 수 난수 5개 발생
		System.out.print("주사위의 금액은 : ");
		for(int i=0; i<=6; i++) {
			int money = 0;
			int sum=0;
			money=(int)(Math.random()*6+1);
			switch(money) {
			case 1 :
				sum+=500;
				break;
			case 2:
				sum+=700;
				break;
			case 3:
				sum+=1200;
				break;
			case 4:
				sum+=1800;
				break;
			case 5:
				sum+=2100;
				break;			
			case 6:
				sum+=3000;
				break;
			default :
				System.out.println("꽝");
					
			}
			System.out.println(sum);
			
		}
	}

}
