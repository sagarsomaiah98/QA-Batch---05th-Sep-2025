package InterfaceConcept;

public class ING implements ReserveBank {

	public static void main(String[] args) {
		ING ing = new ING();
		ing.savings();
		ing.loans();
		ing.insurance();
		
	}

	@Override
	public void savings() {
		System.out.println("ING savings interest is 4%");
		
	}

	@Override
	public void loans() {
	System.out.println("ING loan interest is 3%");
		
	}

	@Override
	public void insurance() {
		System.out.println("ING insurance is 100$");
	}

	@Override
	public void kyc() {
		// TODO Auto-generated method stub
		
	}

}
