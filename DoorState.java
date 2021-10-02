package doorStatePattern;

public class DoorState {
	
	private State state;

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}
	
	public void lockedState() {
		
	 state = new LockedDoor();
		
	}
	
	public void openState() {
		state =  new OpenDoor();
	}
	
	public void closeState() {
		state =  new CloseDoor();
	}

}
