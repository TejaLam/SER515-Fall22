import java.io.FileNotFoundException;

public class Seller extends Person {

	public Seller(String u_name, String passwd) {
		this.username=u_name;
		this.password=passwd;
	}
	public void showMenu() {

	}


	public void CreateProductMenu() {
		System.out.println("the product for name is  "+this.username);
		try {
			this.productMenu = new ProductMenuFactory(this);
		} catch (FileNotFoundException except) {
			except.printStackTrace();
		}

	}

}
