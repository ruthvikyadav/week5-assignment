package doorStatePattern;

public class TestDoorStatePattern {

	public static void main(String[] args) {
		
		System.out.println("Different types of door behaviour state changes. \n");
		
	DoorState doorState =  new  DoorState() ;
	
	doorState.lockedState();
	
	doorState.openState();
	
	doorState.closeState();
	
	
		 
	}

}
