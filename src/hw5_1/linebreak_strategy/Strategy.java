package hw5_1.linebreak_strategy;
import java.util.ArrayList;
import hw5_1.component.Component;
import hw5_1.Layout;

public interface Strategy {
	public void arrange(ArrayList<Component> elements, Layout layout);
}
