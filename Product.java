
public class Product 
{
	
	//private instance fields
	private String productName;
	private int productCode;
	private double unitCost;
	private boolean inCurrentProductLine;
	
	//constructor
	public Product(String productName, int productCode, double unitCost, boolean inCurrentProductLine) 
	{	
		this.setProductName(productName);
		this.setProductCode(productCode);
		this.setUnitCost(unitCost);
		this.setInCurrentProductLine(inCurrentProductLine);
	}

	
	//Setters and Getters
	public String getProductName() 
	{
		return productName;
	}

	public void setProductName(String productName) 
	{
		this.productName = productName;
	}

	public int getProductCode() 
	{
		return productCode;
	}

	public void setProductCode(int productCode) 
	{
		this.productCode = productCode;
	}

	public double getUnitCost() 
	{
		return unitCost;
	}

	public void setUnitCost(double unitCost) 
	{
		this.unitCost = unitCost;
	}

	public boolean isInCurrentProductLine() 
	{
		return inCurrentProductLine;
	}

	public void setInCurrentProductLine(boolean inCurrentProductLine) 
	{
		this.inCurrentProductLine = inCurrentProductLine;
	}

	//To String methods
	public String toString()
	{
		return "Product is called " +productName + ", " + "Product Code is " +productCode + ", " + "The unit cost is " +unitCost + ", " + "Is the product in your current product line? " +inCurrentProductLine ;
	}
}