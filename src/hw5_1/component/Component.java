package hw04.component;
import hw04.Size;

public abstract class Component {
	private Size naturalSize;
	private Size size;
	private Size stretchability;
	private Size shrinkability;

	public void setNaturalSize(Size size){
		this.naturalSize = size;
		if( this.size == null ) this.size = size;
	}

	public void setStretchability(Size size){
		this.stretchability = size;
	}

	public void setShrinkability(Size size){
		this.shrinkability = size;
	}

	public void setSize(Size size){
		if(	!size.greaterThan(this.stretchability) ||
			!size.lessThan(this.shrinkability)) return;

		this.size = size;
	}
}
