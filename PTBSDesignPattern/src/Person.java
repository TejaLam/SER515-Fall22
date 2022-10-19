public abstract class Person {

	int type = 0; // type=0 : buyer, type=1 seller

	String UserName;
	 ProductMenu theProductMenu;

	ClassProductList classProductList;

	Trading trading;

	public Person()
	{
		classProductList = new ClassProductList();
	}

	abstract public ProductMenu CreateProductMenu(Product product, int theLevel);

	public void showViewButton() {
		theProductMenu.showViewButton();
	}

	public void showRadioButton() {
		theProductMenu.showRadioButton();
	}
	public void showLabels() {
		theProductMenu.showLabels();
	}
	public boolean showMenu(){
		return false;
	}
	public void showAddButton() {
		theProductMenu.showAddButton();
	}
	public void show() {
		theProductMenu.show();
	}

	public boolean ifLogout() {
		return theProductMenu.ifLogout();
	}


}
