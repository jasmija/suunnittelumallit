package observer;

import java.util.Calendar;
import java.util.Observable;
import java.util.Observer;
import java.util.Scanner;

public class ClockTimer extends Observable implements Runnable {

	Calendar calendar = Calendar.getInstance();

	int hour;
	int minute;
	int second;

	public ClockTimer() {
	}

	public int getHour() {
		hour = calendar.get(Calendar.HOUR_OF_DAY);
		return hour;
	}

	public int getMinute() {
		minute = calendar.get(Calendar.MINUTE);
		return minute;
	}

	public int getSecond() {
		second = calendar.get(Calendar.SECOND);
		return second;
	};

	@Override
	public void run() {

		while (true) {

			// Aloitusaika
			long start = System.currentTimeMillis();

			try {
				setChanged();
				notifyObservers();
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			// Millisekuntteina aika nyt - ohjelman alku
			long elapsed = System.currentTimeMillis() - start;

			// Lisätään calendarin aikaa kuluneen ajan perusteella
			calendar.setTimeInMillis(calendar.getTime().getTime() + elapsed);
		}

	}
}
