package doorStatePattern;

public class LockedDoor implements State {
	
	LockedDoor(){
		locked();
	}

	@Override
	public void locked() {
		 
		System.out.println("Door locked ");
		
	}

	@Override
	public void open() {
		 
		
	}

	@Override
	public void close() {
		 
		
	}

}
