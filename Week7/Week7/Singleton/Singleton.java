package Week7.Singleton;

public class Singleton {

	private static int NoOfObjects;
	private static int InvokeCounter;
	private static Singleton s;

	public int getNoOfObjects() {
		return this.NoOfObjects;
	}

	public void setNoOfObjects(int NoOfObjects) {
		this.NoOfObjects = NoOfObjects;
	}

	private Singleton() {
		NoOfObjects++;
	}

	public static Singleton CreateSingleton() {
		// TODO - implement Singleton.CreateSingleton
		if(NoOfObjects == 0) {
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
