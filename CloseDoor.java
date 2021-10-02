package doorStatePattern;

public class CloseDoor implements State {
	
	CloseDoor(){
		this.close();
	}

	@Override
	public void locked() {
		 
		
	}

	@Override
	public void open() {
		 
		
	}

	@Override
	public void close() {
		 System.out.println("Door closed ");
		
	}

}
