
public class Run {

	public static void main(String[] args) throws InterruptedException {
		AddToCart cart= new AddToCart();
		LoginTest login = new LoginTest();
		MultiUser mu= new MultiUser();
		LogOutTest lo= new LogOutTest();
		cart.cart();
		login.login();
		lo.logout();
		mu.login("standard_user", "secret_sauce");
		

	}

}
