public class Duke extends Noble{
	public void movingForward(int change){
		pos += change;
	}
	public void movingBackwards(int change){
		pos -= change;
    }
	public void move(int change)
	{
		if (isfacingforward){
			movingForward(change);
		}else{
			movingBackwards(change);
		}
	}
	@Override
	public String toString(){
		return "герцог" + name;
	}
	@Override 
	public int hashCode(){
		return name.hashCode() + position + isfacingforward;
	}
	@Override
	public boolean equals(Duke d){
		if (this.hashCode() == d.hashCode() || (this.name == d.name && this.position == d.position && this.isfacingforward == && d.isfacingforward)){
			return true;
		}else{
			return false;
		}
	}
}