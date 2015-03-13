package Week7.Singleton;

public class Controller {
	public static void main(String args[]) {
	Singleton s;
		try{
			for(int i = 0; i < 100; i++) {
				System.out.println("CREATE SINGLETON RUN: " + i);
				s = Singleton.CreateSingleton();			
			}
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	System.out.println("NUMBER OF INVOKE CALLS: " + Singleton.getInvocationCount());
	}
}
