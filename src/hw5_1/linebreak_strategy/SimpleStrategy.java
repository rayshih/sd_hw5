package hw5_1.linebreak_strategy;
import java.util.ArrayList;
import java.util.Iterator;
import hw5_1.component.Component;
import hw5_1.Layout;

public class SimpleStrategy implements Strategy {
	public void arrange(ArrayList<Component> elements, Layout layout){
		Iterator<Component> it = elements.iterator();
		ArrayList<Component> elementsOfLine = new ArrayList<Component>();

		while (it.hasNext()) {
			Component element = it.next();
			if (!this.shouldBreakline(elementsOfLine, element, layout)) {
				elementsOfLine.add(element);
			} else {
				// TODO handle breakline
				elementsOfLine = new ArrayList<Component>();
			}
		}
	}

	private boolean shouldBreakline(ArrayList<Component> elements, Component element, Layout layout){
		// TODO compare total length of elements plus element.weight with layout.width
		// if is greater then return true
		return false;
	}
}
