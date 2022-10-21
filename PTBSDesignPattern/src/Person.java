import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public abstract class Person {

	private ProductMenu theProductMenu;
	ProductMenuFactory productMenu;

	String username;
	String password;

	public abstract void showMenu();
	public boolean checkUser(String string) {
		Scanner scanning;
		try {
			scanning = new Scanner(new File(string));
			while (scanning.hasNextLine()) {
				String str[]= scanning.next().split(":");

				if(str[0].equals(this.username)&&str[1].equals(this.password)) {
					return true;
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("Cannot find the user so error");
			e.printStackTrace();
		}
		return false;
	}

	public void showAddButton() {

	}

	public void showViewButton() {

	}

	public void showRadioButton() {

	}

	public void showLabels() {

	}

	public abstract void CreateProductMenu();
	public boolean userLogin () {
		if(this.getClass().equals(Buyer.class)) {
			return checkUser("/Users/tlam23/Desktop/MS Subjects/SER 515/BuyerInfo.txt/");
		}

		else {
			return checkUser("/Users/tlam23/Desktop/MS Subjects/SER 515/SellerInfo.txt");
		}


	}
	public void showMenu(int choice) {
		if(choice==2) {
			MeatProductMenu menu=this.productMenu.meatMenu;
			for(int i=0; i<menu.product.size();i++) {
				System.out.println(":"+menu.product.get(i).productName);
			}
		}
		else {
				ProduceProductMenu menu=this.productMenu.produceMenu;
				for(int i=0; i<menu.product.size();i++) {
					System.out.println(":"+menu.product.get(i).productName);
			}
		}

	}

}
