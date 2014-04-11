package hw5_1;

import java.util.ArrayList;
import java.util.Iterator;
import hw5_1.component.Component;
import hw5_1.linebreak_strategy.Strategy;

public class Composition {
	private ArrayList<Component> elements = new ArrayList<Component>();
	private Strategy strategy;

	public void addElement(Component element){
		this.elements.add(element);
	}

	public void setStrategy(Strategy strategy){
		this.strategy = strategy;
	}

	public void arrange(Layout layout){
		this.strategy.arrange(this.elements, layout);
	}

	public void compose(Layout layout){
		this.arrange(layout);
		// TODO render
	}
}
