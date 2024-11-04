package Thread;

class Road {
	private String signal = "green";
	String road_name;
	
	Road (String rn){
		road_name = rn;
	}
	
	public synchronized void drive() {
		while (signal != "green") {
			try {
				wait();
			} 
			catch (InterruptedException e) {}
		}
		
			System.out.println(road_name + "�� ���� �����Ѵ�.");
			signal = "red";
			notify();
		
	}
	
	public synchronized void walk() {
		while (signal != "red") {
			try {
				wait ();
			} catch (InterruptedException e) {}
			
		}
			System.out.println(road_name + "�� �����ڰ� ���� �ǳʹ�.");
			signal = "green";
			notify();
		
	}
	
}

class Cars extends Thread {
	private Road road;
	public Cars (Road r) {
		road = r;
	}
	public void run() {
		road.drive();
	}
	
}

class People extends Thread {
	private Road road;
	public People (Road r) {
		road = r;
	}
	
	public void run() {
		road.walk();
	}
}

public class Twosignals {
	public static void main(String[] args) {
		Road rd = new Road("������ ��Ÿ�");
		People man = new People(rd);
		Cars car = new Cars(rd);
		man.start();
		car.start();
	}

}
