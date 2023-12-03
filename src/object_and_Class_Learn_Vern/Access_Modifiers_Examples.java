package object_and_Class_Learn_Vern;

public class Access_Modifiers_Examples {

	public class PublicExample {
	    public int publicField;
	    public void publicMethod() {
	        // Code accessible from anywhere.
	    }
	}

	class DefaultExample {
	    int defaultField; // Default access modifier
	    void defaultMethod() {
	        // Code accessible within the same package.
	    }
	}

	class AnotherClassInSamePackage {
	    @SuppressWarnings("unused")
		void accessMembersFromOtherClass() {
	        DefaultExample example = new DefaultExample();
	        int field = example.defaultField; // Accessing a default field in the same package is allowed.
	        example.defaultMethod(); // Accessing a default method in the same package is allowed.
	    }
	}

	class SubclassInDifferentPackage extends PublicExample {
	    @SuppressWarnings("unused")
		void accessProtectedMember() {
			int field = publicField; // Accessing a protected field from a subclass is allowed.
	        publicMethod(); // Accessing a protected method from a subclass is allowed.
	    }
	}

	class DifferentPackageClass {
	    @SuppressWarnings("unused")
		void accessMembersFromDifferentPackage() {
	        DefaultExample example = new DefaultExample();
	        int field = example.defaultField; // Error: Cannot access default field from a different package.
	        example.defaultMethod(); // Error: Cannot access default method from a different package.
	    }
	}

}
