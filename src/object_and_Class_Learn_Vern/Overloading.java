package object_and_Class_Learn_Vern;

public class Overloading {
	public static void main(String [] args) {
		int prize = 450;
		
		float length,width;
		length = 9.5f;
		width = 5.8f;
		
		String BookName,AuthorName,Language;
		BookName = "Let us Java";
		AuthorName = "James Gosling";
		Language = "Computer language in English";
		
		
		
		System.out.println("The Prize : "+Book(prize));
		System.out.println("The Length & Width : "+Book(length,width));
		System.out.println("The Book Details : "+Book(BookName,AuthorName,Language)+"\n");
	}
	
	
	
	
	
	public static int Book(int prize) {
		return prize;
		
	}
	public static String Book(float length, float width) {
		return "\tLength is : "+length+"\t\tWidth is : "+width;
	  
	}
	public static String Book(String BookName, String AuthorName, String Language) {
		return "\nBook Name : "+BookName+"\nAuthor Name : "+AuthorName+"\nLanguage : "+Language;
		
	}

}
