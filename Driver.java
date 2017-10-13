import java.util.Scanner;

public class Driver
{
	//Private Instance Fields
	private Scanner input;
	private Store store;
	
	public static void main (String[] args)
	{
		Driver d = new Driver();
		d.processOrder();
		d.addProduct();
		d.printProduct();
		
		
	}
	
	//Constructor (Creates a new scanner input)
	public Driver()
	{
		input = new Scanner(System.in);
	}
	
	
		//Method
	private void addProduct(){  
        //dummy read of String to clear the buffer - bug in Scanner class.
		input.nextLine();
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

        store.add(new Product(productName, productCode, unitCost, inCurrentProductLine));
    }

	//To String methods
	public void printProduct()
	{
		System.out.println(store.listProducts());
	}

	
	
	//ShopV2.0 edits
	private void processOrder()
	{
		//find out from the user how many products they would like to order
        System.out.print("How many Products would you like to have in your Store?  ");
        int numberProducts = input.nextInt();

        store = new Store(numberProducts);

        //ask the user for the details of the products and add them to the order
        for (int i = 0; i < numberProducts - 1; i++)
        {
            addProduct();
        }
		
	}
}
	