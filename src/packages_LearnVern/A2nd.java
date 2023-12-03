package packages_LearnVern;

import inheritance_LearnVern.Constructor_Inheritance_3;
import inheritance_LearnVern.Inheritance_First;
import newJava.Six;

public class A2nd {
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		System.out.println("This is import by Package newJava And Class is Six,"
				+ " \nAnd This is import by Package pkg_AEM_Adobe And class is Fake");
		Six s = new Six();
		Six.main(args);
		System.out.println("\nCall Again");
		s.main(args);

		System.out.println("\n Call Inheritance_First class : ");
		Inheritance_First i = new Inheritance_First();
		i.main(args);

		System.out.println("\n Call Constructor_Inheritance_3 Class : ");
		Constructor_Inheritance_3 ci = new Constructor_Inheritance_3();
		ci.main(args);
	}

}
