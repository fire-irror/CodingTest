package in09;

public class GoodCalc extends Calculator {
	@Override  //어노테이션
public int add(int a,int b) {
	return a+b;
}
	@Override
	public int subtract(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}
	public double  average(int[] a) {  //int a[]=new int[] {2,3,4}와 같은 표현
		// TODO Auto-generated method stub
		double sum=0;
		for(int i=0; i<a.length; i++) 
			sum+=a[i];
			return sum/a.length;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GoodCalc c=new GoodCalc();
		System.out.println(c.add(2, 3));
		System.out.println(c.subtract(2, 3));
		System.out.println(c.average(new int[] {2,3,4}));
	}
	@Override
	public int average(int[] a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}

}