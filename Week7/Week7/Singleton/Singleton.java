package Week7.Singleton;

public class Singleton {

	private static int InvokeCounter;
	private static Singleton s = null;

	public int getNoOfObjects() {
		return this.NoOfObjects;
	}

	private Singleton() {
		NoOfObjects++;
	}

	public static Singleton CreateSingleton() {
		if(s == null) {
			InvokeCounter++;
			s = new Singleton();
			System.out.println("Singleton Created");
			return s;
		} else {
			InvokeCounter++;
			System.out.println("Singleton already created, returning existing instanciation.");
			return s;
		}
	}

	public static int getInvocationCount() {
		return InvokeCounter;
	}
}
