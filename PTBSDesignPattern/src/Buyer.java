import java.io.FileNotFoundException;

public class Buyer extends Person {
	public Buyer(String input_username, String password) {
		this.username = input_username;
		this.password = password;
	}

	public void showMenu() {

	}

	public void CreateProductMenu() {
		// TODO Auto-generated method stub
		System.out.println("Product for: " + this.username);
		try {
			this.productMenu = new ProductMenuFactory(this);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
