package newJava;

public class GarbageCollection {
	
	public void finalize() {
		System.out.println("Object Destroyed..!");
	}
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		GarbageCollection GC1 = new GarbageCollection();
		GarbageCollection GC2 = new GarbageCollection();
		
		GC1 = null;
		GC2 = null;
		
		System.out.println("Object Assigned Null");

		System.gc();
	}

}
