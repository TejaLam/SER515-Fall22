public class Seller extends Person {

	public Seller()
	{
		type = 1; // seller
	}
	public boolean showMenu() {
		super.showMenu();
		showAddButton();
		showViewButton();
		showRadioButton();
		show();
		return ifLogout();
	}

	public ProductMenu CreateProductMenu(Product theProduct,int level) {

		if (level == 0)/// 0: MeatProduct
		{
			theProductMenu = new MeatProductMenu();
		} else/// 1: ProduceProduct
		{
			theProductMenu = new ProduceProductMenu();
		}
		return theProductMenu;
	}

}
