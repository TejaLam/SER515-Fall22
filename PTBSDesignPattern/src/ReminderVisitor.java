public class ReminderVisitor extends NodeVisitor {

	private Reminder m_Reminder;
	Trading trade;


	private ClassProductList classProductList;

	public void visitProduct(ClassProductList productList) {
		System.out.println("Design Pattern -------- Iterator ");
		ListIterator listing = productList.listIterator();
		int number = 0;
		while (listing.hasNext()) {
			System.out.println((number + 1) + ":" + listing.Next().toString());
			number++;
		}

	}

	public void visitProduct(Product product) {

	}

	public void visitTrading(Trading trading)
	{

	}

	public void visitFacade (Facade facade)
	{

	}

}