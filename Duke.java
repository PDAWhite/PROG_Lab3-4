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
}