package hw5_1;

import hw5_1.component.*;
import hw5_1.linebreak_strategy.*;

public class Main {
	public static void main(String[] args){
		Composition comp = new Composition();
		TextElement te = new TextElement();
		te.setStretchability(new Size(/* TODO */));

		GraphicalElement ge = new GraphicalElement();
		te.setShrinkability(new Size(/* TODO */));

		comp.addElement( te );
		comp.addElement( new TextElement());
		comp.addElement( new TextElement());
		comp.addElement( ge );
		comp.addElement( new TextElement());
		comp.addElement( new TextElement());
		comp.addElement( new TextElement());
		comp.addElement( new TextElement());
		comp.addElement( new GraphicalElement());
		comp.addElement( new TextElement());

		comp.setStrategy( new SimpleStrategy());
		comp.compose(new Layout());

		comp.setStrategy( new TexStrategy());
		comp.compose(new Layout());

		comp.setStrategy( new ArrayStrategy( 4 ));
		comp.compose(new Layout());

		te.setSize(new Size(/* TODO */));
		ge.setSize(new Size(/* TODO */));

		comp.setStrategy( new SimpleStrategy());
		comp.compose(new Layout());
	}
}
