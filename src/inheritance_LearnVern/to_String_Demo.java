package inheritance_LearnVern;

public class to_String_Demo {
	public static void main(String [] args) {
		Rectangle r = new Rectangle();
		System.out.println("Before the Passing Value and call toString : "+r);
		r.set(7643, 23);
		System.out.println("With r.print() method : ");
		r.print();
		
		System.out.println("After Passing value and call toString : ");
		System.out.println(r);
		System.out.println(r.toString());
	}

}
class Rectangle {
	protected int length;
	protected int width;
	
	public void set(int length, int width) {
		this.length = length;
		this.width = width;
	}
	public void print() {
		System.out.println("Length : "+length);
		System.out.println("Width : "+width);
	}
	public String toString() {
		String msg;
		msg = "Length : "+length+" Width : "+width;
		//return getClass().getName() + "@" + Integer.toHexString(hashCode());
		return msg+ " @@" + Long.toHexString(hashCode());
	}
}
