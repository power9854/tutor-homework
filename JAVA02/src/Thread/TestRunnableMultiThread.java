package Thread;

class RunnableThread2 implements Runnable {
	String name;
	RunnableThread2(String s) {   
	name = s;
	}
	
	public void run() {
	for (int i=0; i<5; i++)
	System.out.println( name +" ������");
	}
}


public class TestRunnableMultiThread {
	public static void main(String[] args) {
		RunnableThread2 r = new RunnableThread2("ù��° ������");
		Thread t1 = new Thread(r);
		RunnableThread2 r2 = new RunnableThread2("�ι�° ������");
		Thread t2 = new Thread(r2);
		
		System.out.println("������ ���� ��");
		t1.start();
		t2.start();
		System.out.println("������ ���� ��");
	}
	
} 