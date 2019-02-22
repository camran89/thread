
public class threadc implements runnable{
	
			Thread t;
			
	threadc(){
		t=(this,"my thread");
		System.out.println("child thread" +t);
		t.start();
	}
	public void run{
		try {
			for(int i=5;i>0;i++) {
				System.out.println("child thread" +i);
				Thread.sleep(500);
			}
		}
			catch(InterruptedException e) {
				System.out.println("child thread interupted");
			
		}
	}

}
class threaddemo{
	public static void main(String args[]) {
		new NewThread();
		try {
			for(i=5;i>0;i--) {
				System.out.println("main Thread");
				Thread.sleep(1000);
			}
		}
		catch(InterrupedException e) {
			System.out.println("main thread interrupted");
		}
		
	}
}
