import java.util.ArrayList;

public class Store {

	private ArrayList<Product>products;

	public Store(){
		products = new ArrayList<Product>();
	}

	public void add(Product product)
	{
		products.add(product);
	}

    public String listProducts(){
        if (products.size() == 0){
            return "No products";
        }
        else{
            String listOfProducts = "";
            for (int i = 0; i < products.size(); i++){
                listOfProducts = listOfProducts + i + ": " + products.get(i) + "\n";
            }
            return listOfProducts;
        } 
    }
	public String cheapestProduct()
	{	
		Product cheapestProduct = products.get(0);
		for (int i = 0; i < products.size(); i++)
		{
			if (products.get(i).getUnitCost() < cheapestProduct.getUnitCost() )
			{
				cheapestProduct = products.get(i);
			}
		/*	//else
			{
				return "No Products are in the ArrayList";
			}*/
		}
		return cheapestProduct.getProductName();
	}
	
    private double toTwoDecimalPlaces(double num){
        return (int) (num *100 ) /100.0; 
    }

	public String listCurrentProducts()
	{
        if (products.size() == 0){
            return "No products";
        }
        else{
            String listOfProducts = "";
            for (int i = 0; i < products.size(); i++)
            {
            	if (products.get(i).isInCurrentProductLine())
            	{
            		listOfProducts = listOfProducts + i + ": " + products.get(i) + "\n";
            	}
            }
            return listOfProducts;
        }
    }

    public double averageProductPrice()
    { 
        if (products.size() != 0){
            double totalPrice = 0;
            for (int i = 0; i < products.size(); i++){
                totalPrice = totalPrice + products.get(i).getUnitCost();
            }
            return toTwoDecimalPlaces(totalPrice / products.size());
        }
        else{
            return 0.0;
        }
    }

	public String listProductsAboveAPrice(double price)
	{
		String str = "";
        if (products.size() == 0)
        {
            return "No products";
        }
        else
        {
        	for (int i = 0; i < products.size(); i++)
        	{
        		if (products.get(i).getUnitCost() > price)
        		{
        			str = str + i + ": " + products.get(i) + "\n";
        		}
        	}
        	return str;
        }
	}    
}
