package strategy;

import java.util.List;

public class Context {

	private ListConverter converter;

	public Context(ListConverter converter) {
		this.converter = converter;
	}

	public String executeStrategy(List list) {
		return converter.listToString(list);
	}
}
