import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//import CourseList.CourseIterator;

public class ProductList implements ArrayList {
private Product[] theProduct;
	
	public ProductList() {
		super();
		getProducts("/Users/tlam23/Desktop/MS Subjects/SER 515/ProductInfo.txt/");
	}
	public void getProducts(String path) {
		try {
			Scanner sc= new Scanner(new File(path));
			int j=0;
			while (sc.hasNextLine()) {
				sc.nextLine();
				j++;
			}
			this.theProduct=new Product[j];
			sc= new Scanner(new File (path));
			j=0;
			while (sc.hasNextLine()) {
				this.theProduct[j]=new Product(sc.nextLine().trim());
				j++;
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("File not found");
			e.printStackTrace();
		}
		
	}

	@Override
	public ListIterator listIterator() {
		// TODO Auto-generated method stub
		return new ProductIterator();
	}
	//Iterator pattern
	private class ProductIterator implements ListIterator {
		int index=0;

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return index<theProduct.length;
		}

		@Override
		public void moveToHead() {
			// TODO Auto-generated method stub
			index = 0;
		}

		@Override
		public Product Next() {
			// TODO Auto-generated method stub
			if(this.hasNext())
				return theProduct[index++];
			return null;
		}

		

	}

}
