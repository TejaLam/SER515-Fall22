import java.io.FileNotFoundException;

public class MeatProductMenu extends ProductMenu {

	public void showMenu() {

	}

	public void showAddButton() {

	}

	public void showViewButton() {

	}

	public MeatProductMenu(Person input_person) throws FileNotFoundException {
		super(input_person);
		for(int i=0; i<(this.product).size(); i++) {

			if(input_person.getClass().equals(Buyer.class))
				this.options.add("Buyers meat produce products");
			else
				this.options.add("Sellers meat produce products");
		}


	}

	public void showRadioButton() {

	}

	public void showLabels() {

	}

	public void showComboxes() {

	}

}
