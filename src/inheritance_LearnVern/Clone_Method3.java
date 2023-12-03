package inheritance_LearnVern;

public class Clone_Method3 implements Cloneable {

	int rollNo;
	Names studeNames;

	public Clone_Method3(int rollNo, String fnm) {
		this.rollNo = rollNo;
		this.studeNames = new Names(fnm);
	}

	public void setStudeName(String fnm) {
		this.studeNames.setName(fnm);

	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		Clone_Method3 temp = (Clone_Method3) super.clone();
		return temp;
	}

	public static void main(String[] args) {
		try {
			Clone_Method3 s = new Clone_Method3(12, "Tannu");
			Clone_Method3 s2 = (Clone_Method3) s.clone();
			System.out.println(s.rollNo + " " + s.studeNames);
			System.out.println(s2.rollNo + " " + s2.studeNames);

			s2.rollNo = 18;
			s2.setStudeName("Sunny");
			System.out.println(s.rollNo + " " + s.studeNames);
			System.out.println(s2.rollNo + " " + s2.studeNames);

		} catch (CloneNotSupportedException xyz) {
			System.out.println(xyz);
		}
	}
}

class Names {
	String firstname;

	public Names(String fnm) {
		firstname = fnm;
	}

	public void setName(String fnm) {
		firstname = fnm;
	}

	@Override
	public String toString() {
		return firstname;
	}
}
