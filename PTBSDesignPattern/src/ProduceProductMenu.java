import java.io.FileNotFoundException;

public class ProduceProductMenu extends ProductMenu {

	public void showMenu() {

	}

	public void showAddButton() {

	}

	public void showRadioButton() {

	}

	public void showLabels() {

	}

	public void showViewButton() {

	}

	public void showComboxes() {

	}
	public ProduceProductMenu(Person person) throws FileNotFoundException {
		super(person);
		for(int i=0; i<this.product.size(); i++) {
			if(person.getClass().equals(Buyer.class))
				this.options.add("Produce Product Menu for Buyers");
			else
				this.options.add("Produce Product Menu for Sellers");
		}
	}

}
