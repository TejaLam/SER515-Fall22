import java.io.FileNotFoundException;

public class ProductMenuFactory {
	MeatProductMenu meatMenu;
	ProduceProductMenu produceMenu;
	public ProductMenuFactory(Person person) throws FileNotFoundException {
		meatMenu = createMeatProductMenu(person);
		produceMenu = createProduceProductMenu(person);
		
	}
	private ProduceProductMenu createProduceProductMenu(Person person) throws FileNotFoundException {
		return new ProduceProductMenu(person);
	}
	private MeatProductMenu createMeatProductMenu(Person person) throws FileNotFoundException {
		return new MeatProductMenu(person);
	}

}
