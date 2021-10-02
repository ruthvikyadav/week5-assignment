package doorStatePattern;

public class OpenDoor implements State {
	
	public OpenDoor() {
		this.open();
	}

	@Override
	public void locked() {
		 
		
	}

	@Override
	public void open() {
	 
		System.out.println("Door Opened ");
		
	}

	@Override
	public void close() {
		 
		
	}

}
