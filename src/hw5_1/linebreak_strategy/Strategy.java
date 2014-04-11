package hw04.linebreak_strategy;
import java.util.ArrayList;
import hw04.component.Component;
import hw04.Layout;

public interface Strategy {
	public void arrange(ArrayList<Component> elements, Layout layout);
}
