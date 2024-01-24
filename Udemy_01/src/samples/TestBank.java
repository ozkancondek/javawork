package samples;

public class TestBank {
	public static void main(String[] args) {
		//???????????????????????????upcasting ~ reference comes from parent
		// What if create from DeutscheBank. What is the difference.
		//DeutscheBank myBankObjcet;
		Bank myBankObjcet;
		myBankObjcet = new DeutscheBank();
		System.out.println("Interest rate for DeutscheBank is "+myBankObjcet.getInterest());
		System.out.println(myBankObjcet.toString());
		
		
		
		//Sparkasse myBankObjcet2;
		myBankObjcet = new Sparkasse();
		System.out.println("Interest rate for Sparkasse is "+myBankObjcet.getInterest());
		System.out.println(myBankObjcet.toString());
		

	}

}
