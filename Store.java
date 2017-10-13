
public class Store 
{
	private Product[] products;
	private int total;

	//Constructor
	public Store(int numberItems)
	{
		products = new Product[numberItems];
		total = 0;
	}
	
	private boolean isFull()
	{
		if(total == products.length)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	private boolean isEmpty()
	{
		if(total == 0)
		{
			return true;
		}
		
		else
		{
			return false;
		}
	}
	
	public boolean add(Product obj)
	{
		if(isFull() == true)
		{
			return false;
		}
		else
		{
			products[total] = obj;
			total++;
			return true;
		}
		
	}
	
	public String listProducts()
	{
		if(isEmpty())
		{
			return "No Products";
		}
		else
		{
			String productString = "";
			for (int i = 0; i < products.length; i++) 
			{
				productString += products[i] + "\n";
			}
			return productString;
		}
	}

}
