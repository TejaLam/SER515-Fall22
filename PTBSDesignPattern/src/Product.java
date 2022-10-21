public class Product {

	String productName;
	Trading[] trading;

	public Product(String name) {
		this.productName = name;
		int length = 2;
		this.trading = new Trading[length];
		this.trading[0] = new Trading("produce products trading " + " " + this.productName);
		this.trading[1] = new Trading("meat products trading " + " " + this.productName);

}
}
