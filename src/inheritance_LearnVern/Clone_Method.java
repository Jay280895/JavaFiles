package inheritance_LearnVern;

public class Clone_Method {
	
	public static void main(String [] args)
	{
		RectangleDemo1 r = new RectangleDemo1(10,25);
		RectangleDemo1 r2 = r;
		System.out.println("From r object : ");
		System.out.println(r+"\n");
		System.out.println("From r2 object : ");
		System.out.println(r2+"\n");
		
		r2.length = 15;
		System.out.println("After Change The Value");
		System.out.println("\nFrom r object : ");
		System.out.println(r);
		System.out.println("\nFrom r2 object : ");
		System.out.println(r2);
	}

}
class RectangleDemo1
{
	int length;
	int width;
	public RectangleDemo1(int length, int width) {
		this.length = length;
		this.width = width;
	}
	public String toString() {
		return "Length : "+length+"\nWidth : "+width;
	}
}
