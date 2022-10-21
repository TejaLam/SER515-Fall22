public class ReminderVisitor extends NodeVisitor {

	private Reminder m_Reminder;
	Trading trading;


	private ClassProductList classProductList;

	public void visitProduct(ProductList productList) {
		System.out.println("Iterator Design Pattern");
		ListIterator li = productList.listIterator();
		int number = 0;
		while (li.hasNext()) {
			System.out.println((number + 1) + ":" + li.Next().toString());
			number++;

		}

	}

	public void visitTrading(Trading trading)
	{

	}

	public void visitFacade (Facade facade)
	{

	}

}