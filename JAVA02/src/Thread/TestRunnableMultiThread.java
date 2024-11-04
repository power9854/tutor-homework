package Thread;

class RunnableThread2 implements Runnable {
	String name;
	RunnableThread2(String s) {   
	name = s;
	}
	
	public void run() {
	for (int i=0; i<5; i++)
	System.out.println( name +" 실행중");
	}
}


public class TestRunnableMultiThread {
	public static void main(String[] args) {
		RunnableThread2 r = new RunnableThread2("첫번째 스레드");
		Thread t1 = new Thread(r);
		RunnableThread2 r2 = new RunnableThread2("두번째 스레드");
		Thread t2 = new Thread(r2);
		
		System.out.println("스레드 시작 전");
		t1.start();
		t2.start();
		System.out.println("스레드 시작 후");
	}
	
} 