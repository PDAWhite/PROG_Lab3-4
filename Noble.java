public abstract class Noble implements Human{
	public String name;
	public int position;
	public boolean isfacingforward;
	public Noble(String name){
		this.name = name;
		position = 0;
		isfacingforward = True;
	}
	public Noble(String name, int pos, boolean frontal){
		this.name = name;
		position = pos;
		isfacingforward = frontal;
	}
	public abstract void move(int change);
}

