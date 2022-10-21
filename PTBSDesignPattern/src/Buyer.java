import java.io.FileNotFoundException;

public class Buyer extends Person {
	public Buyer(String input_username, String pword) {
		this.username = input_username;
		this.password = pword;
	}

	public void showMenu() {

	}

	public void CreateProductMenu() {
		System.out.println("product for the given " + this.username);
		try {
			this.productMenu = new ProductMenuFactory(this);
		} catch (FileNotFoundException excep) {
			excep.printStackTrace();
		}
	}
}
