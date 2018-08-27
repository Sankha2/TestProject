package sankha;


class abcs {
	
 public void method() {
	 System.out.println("i am in method");
 }
}

public class threadInterface extends abcs  implements Runnable {
	
	public void run() {
		
		
		System.out.println("i am in thread");
		
		
	}

	
	
	public static void main(String a[]) {
		
		threadInterface t= new threadInterface();
		t.method();
		
		Thread as= new Thread
				(t);
		
		as.start();
		
	}
}
