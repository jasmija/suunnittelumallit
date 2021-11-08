package observer;

import java.util.Observable;
import java.util.Observer;

public class Clock implements Observer {

	private ClockTimer timer;

	public Clock(ClockTimer ct) {
		System.out.println("Kello");
		timer = ct;
	}

	private void getTime() {
		int hour = timer.getHour();
		int minute = timer.getMinute();
		int second = timer.getSecond();

		System.out.println("Kellossa aikaa: " + hour + " tuntia, " + minute + " minuuttia, " + second + " sekunttia.");
	}

	public void update(Observable o, Object arg) {
		getTime();
	}

}
