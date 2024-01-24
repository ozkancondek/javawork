package samples;

abstract class AbstractTransportation implements Transportation {
	//Why overriding is not necessary when i use abstract
	public void moving() {
		System.out.println("Iam moving....");
	}

}
