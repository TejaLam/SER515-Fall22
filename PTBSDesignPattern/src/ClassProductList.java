import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ClassProductList implements ArrayList {
	private Product[] product;

	public ClassProductList() {
		super();
		requestingProducts("/Users/tlam23/Desktop/MS Subjects/SER 515/ProductInfo.txt/");
	}
	public void requestingProducts(String path) {
		try {
			Scanner scanning= new Scanner(new File(path));
			int j=0;
			while (scanning.hasNextLine()) {
				scanning.nextLine();
				j++;
			}
			this.product=new Product[j];
			scanning= new Scanner(new File (path));
			j=0;
			while (scanning.hasNextLine()) {
				this.product[j]=new Product(scanning.nextLine().trim());
				j++;
			}

		} catch (FileNotFoundException excep) {
			System.out.println("not found the expected file");
			excep.printStackTrace();
		}

	}

	@Override
	public ListIterator listIterator() {
		return new ProductIterator();
	}




	//Iterator pattern
	private class ProductIterator implements ListIterator {
		int init=0;

		@Override
		public boolean hasNext() {
			return init< product.length;
		}

		@Override
		public void remove() {

		}

		@Override
		public Product Next() {
			if(this.hasNext())
				return product[init++];
			return null;
		}

		@Override
		public void moveToHead() {
			init = 0;
		}
	}
}
