public class ProductApp{

	public static void main(String[] args)
	{
		boolean runner = true;
		String temp;
		while(runner){		
			Product p1 = ProductDB.getProduct(Validator1.getString("Enter Product Code: "));
			System.out.print(p1.toString());
			if(p1 instanceof Book){
				System.out.println("Author:      " + ((Book)p1).getAuthor());
			}
			else{
				System.out.println("Version:   " + ((Software)p1).getVersion());
			}
			System.out.println("Product Count: " + Product.getCount());
			temp = Validator1.getString("Continue? (y/n)");
			if(!temp.equalsIgnoreCase("y"))
				runner = false;
		}
	}
}