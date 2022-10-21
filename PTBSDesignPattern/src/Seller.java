import java.io.FileNotFoundException;

public class Seller extends Person {

	public Seller(String username, String password) {
		this.username=username;
		this.password=password;
	}
	public void showMenu() {

	}


	public void CreateProductMenu() {
		// TODO Auto-generated method stub
		System.out.println("Product for: "+this.username);
		try {
			this.productMenu = new ProductMenuFactory(this);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
