import java.util.Scanner;

public class Facade {

	private int UserType;

	private Product theSelectedProduct;

	private int nProductCategory;

	private ClassProductList theProductList;

	private Person thePerson;

	public boolean login() {
		return false;
	}

	public void addTrading() {

	}

	public void viewTrading() {

	}

	public void decideBidding() {

	}

	public void discussBidding() {

	}

	public void submitBidding() {

	}

	public void remind() {

	}

	public void createUser(UserInfoItem userinfoitem) {

	}

	public void createProductList() {

	}

	public void attachProductToUser() {

	}

	public Product selectProduct() {
		return null;
	}

	public void productOperation() {

	}
	public Facade() {
		System.out.println("Facade Design Pattern");
		System.out.println("0: Login as Buyer");
		System.out.println("1: Login as Seller");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		Reminder reminder= new Reminder();
		Person per;
		if (input == 0) {
			per = new Buyer("", "");
			System.out.println("Enter Username");
			per.username=sc.next();
			System.out.println("Enter Password");
			per.password=sc.next();

			if (per.userLogin()) {
				System.out.println("Logged in Successfully");
				per.CreateProductMenu();
			}
			else
				System.out.println("Credentials are invalid");
			input=-1;
			System.out.println("Bridge Design Pattern");
			while (input!=1||input!=2) {
				System.out.println("Select from below");
				System.out.println("1.Product Categories");
				System.out.println("2.Products");
				input=sc.nextInt();
				if(input==1||input==0) {
					if(input==1) {
						input=-1;
						System.out.println("Factory Design Patterns");
						System.out.println("Select product category:");
						System.out.println("1.Produce Product Menu");
						System.out.println("2.Meat Product Menu");
						input=sc.nextInt();
						if(input==1)
							per.showMenu(input);
						if(input==2)
							per.showMenu(input);
					}
					if(input==0) {
						System.out.println("Visitor Design Pattern");
						reminder.display(new ProductList());
					}

				}
			}


		}
		else if (input==1) {
			per = new Seller("" , "");
			System.out.println("Enter Username");
			per.username=sc.next();
			System.out.println("Enter password");
			per.password=sc.next();
			if (per.userLogin()) {
				per.CreateProductMenu();
			}
			else
				System.out.println("Credentials are not valid");

			input=-1;
			System.out.println("Bridge Design Pattern");
			while (input!=1||input!=2) {
				System.out.println("Select product category:");
				input=sc.nextInt();
				if(input==1||input==2||input==3) {
					if(input==1||input==2) {
						System.out.println("Factory Design Pattern");
						per.showMenu(input);
					}
					if(input==3) {
						System.out.println("Visitor Design Pattern");
						reminder.display(new ProductList());
					}
					else
						System.out.println("Not a valid input");


				}
			}
		}
		else {
			System.out.println("ERRORRRRRR");
		}
	}

}

