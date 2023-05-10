package coll04;

public class Gstack<T> {
	int tos;
	Object [] stck;
	public Gstack() {
		tos =0;
		stck = new Object[10];
	}
	public void push(T item) {
		if(tos==10)
			return;
		stck[tos] = item;
		tos++;
		
	}
	public T pop() {
		if(tos == 0)
			return null;
		tos--;
		return (T)stck[tos];
	}
}
