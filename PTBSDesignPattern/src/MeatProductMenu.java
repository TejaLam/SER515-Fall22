import java.io.FileNotFoundException;

public class MeatProductMenu extends ProductMenu {

	public void showMenu() {

	}

	public void showAddButton() {

	}

	public void showViewButton() {

	}

	public void showRadioButton() {

	}

	public void showLabels() {

	}

	public void showComboxes() {

	}
	public MeatProductMenu(Person person) throws FileNotFoundException {
		super(person);
		for(int i=0; i<(this.product).size(); i++) {
			if(person.getClass().equals(Buyer.class))
				this.options.add("Meat Produce Products for Buyers");
			else
				this.options.add("Meat Produce products for Sellers");
		}


	}

}
