public class Baron extends Noble{
	public Agitation state;
	public Baron(String name){
		super(name);
		state = Agitation.CALM;
	}
	public Baron(String name, int pos, boolean frontal, Agitation st){
		super(name, pos, frontal);
		state = st;
	}
	public void movingForward(int change, Cart cart, Road road){
		double deltaComfort = 0;
		for (int i = 0; i < change; i++)
			pos++;
			deltaComfort += cart.move(1, road);
			if (deltaComfort > (state.ordinal() + 1) * 10){
				state = Agitation.values()[deltaComfort % 10];
			}
	}
	public void movingBackwards(int change, Cart cart, Road road){
		double deltaComfort = 0;
		for (int i = 0; i < change; i++)
			pos--;
			deltaComfort += cart.move(-1, road);
			if (deltaComfort > (state.ordinal() + 1) * 10){
				state = Agitation.values()[deltaComfort % 10];
			}
    }
	public void move(int change, Cart cart, Road road)
	{
		if (isfacingforward == true){
			movingForward(change, cart, road);
		}else{
			movingBackwards(change, cart, road);
		}
	}
	@Override
	public String toString(){
		return "барон" + name;
	}
	@Override 
	public int hashCode(){
		return name.hashCode() + position + state.ordinal() + isfacingforward;
	}
	@Override
	public boolean equals(Baron b){
		if (this.hashCode() == b.hashCode() || (this.name == b.name && this.position == b.position && this.isfacingforward == && b.isfacingforward && this.state == b.state)){
			return true;
		}else{
			return false;
		}
	}
}

enum Agitation{
	CALM,
	DISTURBED,
	AGITATED,
	ONEDGE,
	BREAKDOWN
}