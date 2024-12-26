public abstract class PushableVehicle{
	public int position;
	public PushableVehicle(int pos){
		position = pos;
	}
	public abstract double move(){}
}