package exceptionhandling;

public class ChekedTrowHandl {
	public static void main(String[] args) throws InterruptedException{  // put throw in main method
		System.out.println("program is started");
		System.out.println("program is in progress");
		Thread.sleep(5000);
		System.out.println("program is completed");
		System.out.println("program is exited");
		
}
}