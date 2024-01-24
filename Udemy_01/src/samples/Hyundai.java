package samples;

public class Hyundai implements Transportation,Car {

	@Override
	public void carMove() {
		System.out.println("Car is moving....");
		
	}

	@Override
	public void moving() {
		System.out.println("Vehicle is moving....");
		
	}
	
	//Here is own method
	public void producedIn() {
		System.out.println("I have been produced in south korea...");
	}
		
	public static void main(String[] args) {
		//Car myCar = new Hyundai();  
		Hyundai myCar = new Hyundai();
 
		
	}
}
