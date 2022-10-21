import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public abstract class ProductMenu {

	Person person = null;

	public abstract void showMenu();

	public abstract void showAddButton();

	public abstract void showViewButton();

	public abstract void showRadioButton();

	public abstract void showLabels();

	public abstract void showComboxes();

	public ArrayList<Product> product;
	public ArrayList<String> options;

	public ProductMenu(Person person) throws FileNotFoundException {
		addProducts("/Users/tlam23/Desktop/MS Subjects/SER 515/UserProduct.txt/", person);
	}
	public void addProducts (String path, Person person) throws FileNotFoundException {
			this.product = new ArrayList<Product>();

			Scanner sc = new Scanner(new File(path));
			while (sc.hasNextLine()) {
				String k[] = sc.nextLine().split(":");
				if (k[0].equals(person.username)) {
					this.product.add(new Product(k[1]));
				}

			}
			this.options = new ArrayList<String>();

		}

	}