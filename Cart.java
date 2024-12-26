public class Cart extends PushableVehicle{
	public Quality quality;
	public Cart(int pos, Quality q){
		super(pos);
		quality = q;
	}
	public double move(int change, Road road){
		double sound;
		if (change >= 0){
			for(int i = 0; i < change; i++){
				sound += abs(road.bumps[pos+1] - road.bumps[pos]) * (0.8 + 0.2 * quality.ordinal());
				pos++;
			}
		}else{
			for (int i = 0; i > change; i--){
				sound += abs(road.bumps[pos-1] - road.bumps[pos]) * (0.8 + 0.2 * quality.ordinal());
				pos--;
			}
		}
		return sound;
	}
}

enum Quality{
	STURDY,
	NORMAL,
	WORNDOWN,
	CREAKY
}