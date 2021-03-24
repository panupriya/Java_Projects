package exceptionhandling;

public class checked {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("program is started");
		System.out.println("program is in progress");
		/*Thread.sleep(5000);  // to get gap for next output , it throws an exception>> it can be handled by try catch method n throw keyword
		System.out.println("program is completed");
		System.out.println("program is exited");*/
		
		try {
			Thread.sleep(5000);
		}
		catch(InterruptedException e)
		{}
			System.out.println("program is completed");
			System.out.println("program is exited");
	}

}
