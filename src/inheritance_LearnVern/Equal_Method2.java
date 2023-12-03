package inheritance_LearnVern;

public class Equal_Method2
{
	public static void main(String [] args)
	{
		RectangleDemo rc = new RectangleDemo(15,30);
		RectangleDemo rc2 = new RectangleDemo(15,30);
		System.out.println(rc);
		
		if(rc.equals(rc2))
		{
			System.out.println("Both Are Equal");
		}
		else
		{
			System.out.println("Both Are not Equal");
		}
		
	}

}
class RectangleDemo
{
	int length;
	int width;
	
	RectangleDemo(int length, int width)
	{
		this.length = length;
		this.width = width;
	}
	
	public String toString()
	{
		return "Length : "+length+"\nWidth : "+width;
	}
	
	public boolean equals(Object obj) {
	//or
	//public boolean equals(RectangleDemo obj){
		
		RectangleDemo rd = (RectangleDemo) obj;
		if((this.length == rd.length) && (this.width == rd.width))
		{
			System.out.println("Both Are Equal is True");
			return true;
		}
		else
		{
			System.out.println("Both Are Equal is False"); 
			return false;
		}
	}
}






