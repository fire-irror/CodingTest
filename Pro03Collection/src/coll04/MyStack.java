package coll04;

public class MyStack {
	public static void main(String args[]) {
		Gstack<String> stringStack = new Gstack<String>();
		//stringStack
		stringStack.push("seoul");
		stringStack.push("Busan");
		stringStack.push("LA");

		for (int n = 0; n < 3; n++) {
			System.out.println(stringStack.pop());
		}

		Gstack<Integer> intStack = new Gstack<Integer>();
		intStack.push(1);
		intStack.push(3);
		intStack.push(5);

		for (int n = 0; n < 3; n++) {
			System.out.println(intStack.pop());
		}
	}

}
