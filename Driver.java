import java.util.Scanner;

public class Driver
{
	//Private Instance Fields
	private Scanner input;
	private Product product;
	
	//Constructor (Creates a new scanner input)
	public Driver()
	{
		input = new Scanner(System.in);
	}
	
	
		//Method
	public void addProduct()
	{
		System.out.print("Enter the Product Name:  ");
		String productName = input.nextLine();
		System.out.print("Enter the Product Code:  ");
		int productCode = input.nextInt();
		System.out.print("Enter the Unit Cost:  ");
		double unitCost = input.nextDouble();
		System.out.print("Is this product in your current line (y/n): ");
		char currentProduct = input.next().charAt(0);
		boolean inCurrentProductLine = false;
		if ((currentProduct == 'y') || (currentProduct == 'Y'))
			inCurrentProductLine = true;

		product = new Product(productName, productCode, unitCost, inCurrentProductLine);
	}

	//To String methods
	public void printProduct()
	{
		System.out.println(product.toString());
	}

	public static void main (String[] args)
	{
		Driver d = new Driver();
		d.addProduct();
		d.printProduct();
		
	}
	}
	