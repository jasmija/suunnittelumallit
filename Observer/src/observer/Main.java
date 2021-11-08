package observer;


public class Main {

	public static void main(String[] args) {
		
		ClockTimer timer = new ClockTimer();
		Clock clock = new Clock(timer);
		timer.addObserver(clock);
		new Thread(timer).start();
	}

}

