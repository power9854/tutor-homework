package Thread;
import java.util.Scanner;

class CarsN extends Thread {
	private RoadN road;
	int number;
	
	public CarsN (int num, RoadN r) {
		road = r;
		number = num;
	}
	
	public void run() {
		road.drive(number);
	}
}

class BikeN extends Thread {
	private RoadN road;
	int number;
	
	public BikeN(int num, RoadN r) {
		road = r;
		number = num;
	}
	
	public void run() {
		road.biking(number);
	}
}


class PeopleN extends Thread {
	private RoadN road;
	int number;
	
	public PeopleN (int num, RoadN r) {
		road = r;
		number = num;
	}
	
	public void run() {
		road.walk(number);
	}

}

class RoadN {
	private String signal = "green";
	String road_name;
	
	RoadN (String rn){
		road_name = rn;
	}
	
	public synchronized void drive(int num) {
		while (signal != "green") {
			try {
				wait();
			} 
			catch (InterruptedException e) {}
		}
		
		System.out.println(road_name + "에 " + num + "번째 차가 주행한다.");
		signal = "orange";
		notifyAll();
		
	}
	
	public synchronized void biking(int num) {
		while (signal != "orange") {
			try {
				wait ();
			} catch (InterruptedException e) {}
			
		}
		
		System.out.println(road_name + "에 " + num + "번째 자전거가 달린다.");
		signal = "red";
		notifyAll();
	}

	
	
	public synchronized void walk(int num) {
		while (signal != "red") {
			try {
				wait ();
			} catch (InterruptedException e) {}
			
		}
		System.out.println(road_name + "에 " + num + "번째 보행자가 건넌다.");
		signal = "green";
		notifyAll();
		
	}
	
}


public class ThreeSignalsN {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("도로를 이용한 자동차, 자전거, 보행자 수를 입력 : ");
		int cnt = s.nextInt();
		
		PeopleN man[] = new PeopleN[cnt];
		BikeN bike[] = new BikeN[cnt];
		CarsN car[] = new CarsN[cnt];
		
		RoadN rd = new RoadN("명전대 사거리");
		for (int i=0; i<cnt; i++) {
			man[i] = new PeopleN(i+1, rd);
			bike[i] = new BikeN(i+1, rd);
			car[i] = new CarsN(i+1, rd);
		}
		
		
		for(int i=0; i<cnt; i++) {
			man[i].start();
			bike[i].start();
			car[i].start();
		}
		
		
		s.close();
	}

}
