package strategy;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List <String> list = new ArrayList<String>();
		list.add("Alkio1");
		list.add("ALkio2");
		list.add("Alkio3");
		list.add("Alkio4");
		list.add("Alkio5");
		list.add("Alkio6");
		list.add("Alkio7");
		list.add("Alkio8");
		list.add("Alkio9");
		list.add("Alkio10");
		
		Context context = new Context(new Strategy1());
		System.out.println("Strategy 1: " + context.executeStrategy(list));

		context = new Context(new Strategy2());
		System.out.println("Strategy 2: " + context.executeStrategy(list));

		context = new Context(new Strategy3());
		System.out.println("Strategy 3: " + context.executeStrategy(list));
	}
}
