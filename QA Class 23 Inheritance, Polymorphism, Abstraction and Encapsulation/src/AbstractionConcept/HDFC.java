package AbstractionConcept;

public class HDFC extends AbstractionConcept {

	public static void main(String[] args) {
		HDFC w= new HDFC();
		w.savings();
		w.insurance();
		w.kyc();

	}

	@Override
	public void savings() {
		System.out.println("savings interest is 3.0%");
		
	}

	@Override
	public void insurance() {
	System.out.println("insurance cost 50$");
		
	}

}
