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
	public void submitBidding() {

	}

	public void remind() {

	}

	public void createUser(UserInfoItem userinfoitem) {

	}

	public void viewTrading() {

	}

	public void decideBidding() {

	}

	public void discussBidding() {

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
		System.out.println("Design Pattern ------ Facade");
		System.out.println("If you want buyer then give 0");
		System.out.println("If you want seller then give 1");
		System.out.println("-----------------------------------------");
		Scanner scanning = new Scanner(System.in);
		int typeIn = scanning.nextInt();
		Reminder reminder= new Reminder();
		Person per;
		if (typeIn == 0) {
			per = new Buyer("", "");
			System.out.println("Give the username ");
			per.username=scanning.next();
			System.out.println("Give the passwd");
			per.password=scanning.next();

			if (per.userLogin()) {
				System.out.println("Logged in Successfully into the system");
				per.CreateProductMenu();
			}
			else {
				System.out.println("Given inputs are not valid");
				System.exit(0);
			}
			typeIn = -3;
			System.out.println("Design Pattern ------ Bridge");
			while (typeIn!=1||typeIn!=2||typeIn!=3) {
				System.out.println("1.Select this for Product Categories");
				System.out.println("2.Select this for Products");
				System.out.println("3.If you want to exit from the flow");
				System.out.println("-----------------------------------------");
				typeIn=scanning.nextInt();
				if(typeIn==1||typeIn==2||typeIn==3) {


					if(typeIn==1) {
						System.out.println("Design Pattern ---------- Factory");
						System.out.println("1.check product category: Produce Product Menu");
						System.out.println("2.check product category: Meat Product Menu");
						System.out.println("3.If you want to exit from the flow");
						System.out.println("-----------------------------------------");
						typeIn=scanning.nextInt();
						if(typeIn==1) {
							System.out.println("Choose Produce Product Menu");
							per.showMenu(typeIn);
						}
						if(typeIn==2) {
							System.out.println("Choose Meat Product Menu");
							per.showMenu(typeIn);
						}
						if(typeIn==3)
						{
							System.exit(0);
						}
					}

					if(typeIn==2) {
						System.out.println("Design Pattern   ------ Visitor");
						reminder.display(new ClassProductList());
					}
					if(typeIn==3)
					{
						System.exit(0);
					}
				}
			}


		}







		else if (typeIn==1) {
			per = new Seller("", "");
			System.out.println("give your username");
			per.username = scanning.next();
			System.out.println("give your password");
			per.password = scanning.next();
			if (per.userLogin()) {
				System.out.println("you are successfully logged in");
				per.CreateProductMenu();
			} else{
				System.out.println("Given Credentials are not at all valid");
			System.exit(0);
		}

			typeIn=-3;
			System.out.println("Design Pattern ------------- Bridge ");
			while (typeIn!=1||typeIn!=2 ||typeIn!=3||typeIn!=4) {
				System.out.println("Select product category:");
				System.out.println("1 or 2.Select this for Product Categories produce product menu and meat product menu");
				System.out.println("3.Select this for Products");
				System.out.println("4.If you want to exit from the flow");
				System.out.println("-----------------------------------------");
				typeIn=scanning.nextInt();
				if(typeIn==1||typeIn==2||typeIn==3||typeIn==4) {
					if(typeIn==1||typeIn==2) {
						System.out.println(" Design Pattern -------------- Factory");
						per.showMenu(typeIn);
					}
					if(typeIn==3) {
						System.out.println("Design Pattern --------- Visitor");
						reminder.display(new ClassProductList());
					}
					if(typeIn==4)
					{
						System.out.println("This is not at all a valid input");
						System.exit(0);
					}

				}
			}
		}
		else {
			System.out.println("there is an error");
			System.exit(0);
		}
	}

}

