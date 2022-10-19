public class Buyer extends Person {

	public Buyer() {
		type = 0; // type=0: student
	}

	@Override
	public boolean showMenu() {
		super.showMenu();
		showViewButton();
		showRadioButton();
		show();
		return ifLogout();
	}

	public ProductMenu CreateProductMenu(Product product, int level) {
		if (level == 0) // 0:Meat ProductMenu
		{
			theProductMenu = new MeatProductMenu();
		} else // 1: ProduceProduct
		{
			theProductMenu = new ProduceProductMenu();
		}
		return theProductMenu;
	}

}
