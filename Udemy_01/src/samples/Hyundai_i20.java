package samples;

public class Hyundai_i20 extends Hyundai {
	//??????????????????????????
	//Why overriding is not necessary here!
	
	public static void main(String[] args) {
		Hyundai_i20 mySamplei20 = new Hyundai_i20();
		
		mySamplei20.carMove();
		mySamplei20.moving();
		mySamplei20.producedIn();
	}

}
