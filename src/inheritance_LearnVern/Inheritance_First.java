package inheritance_LearnVern;

public class Inheritance_First {
	public static void main(String[] args) {
//		Ant a1=new Ant();
//		a1.show();
		pan b1=new pan();
		b1.show();
		b1.show2();
		b1.show3();
	}

}

interface Ant {
	void show();
}

interface Bat {
	void show2();
}


class pan implements Bat , Ant{
	void show3(){
		int x = 1;
		x+=x;
		System.out.println("Class C"+x);
	}
	
	@Override
	public void show2() {
		System.out.println("Class B");
	}
	
	@Override
	public void show(){
		System.out.println("Class A");
	}
	{
		System.out.println();
	}
}



