package in05;

public class Person {
	private int weight;
	int age;
	protected int height;
	public String name;
	
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;	//멤버면수에 99가 저장된다.
	}
}
