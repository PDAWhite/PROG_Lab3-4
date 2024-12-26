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
	}
	public void movingBackwards(int change, Cart cart, Road road){
		double deltaComfort = 0;
		for (int i = 0; i < change; i++)
			pos--;
			deltaComfort += cart.move(-1, road);
    }
	public void move(int change, Cart cart, Road road)
	{
		if (isfacingforward == true){
			movingForward(change, cart, road);
		}else{
			movingBackwards(change, cart, road);
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