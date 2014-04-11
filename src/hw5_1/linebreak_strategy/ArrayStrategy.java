package hw5_1.linebreak_strategy;
import java.util.ArrayList;
import java.util.Iterator;
import hw5_1.component.Component;
import hw5_1.Layout;

public class ArrayStrategy implements Strategy {
	private int fixedNumber;
	public ArrayStrategy(int fixedNumber){
		this.fixedNumber = fixedNumber;
	}

	public void arrange(ArrayList<Component> elements, Layout layout){
		Iterator<Component> it = elements.iterator();
		ArrayList<Component> elementsOfLine = new ArrayList<Component>();

		while (it.hasNext()) {
			Component element = it.next();
			elementsOfLine.add(element);
			if (elementsOfLine.size() >= this.fixedNumber){
				// TODO handle breakline
				elementsOfLine = new ArrayList<Component>();
			}
		}
	}
}
