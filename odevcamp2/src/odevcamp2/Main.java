package odevcamp2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Product product1 = new Product(1, "C# + Angular", "Engin Demirog");
		Product product2 = new Product(2, "JAVA + REACT", "Engin Demirog");
		
		Product[] products= {product1,product2};
		for (Product product : products) {
			
			System.out.println(product.name +" "+ product.instructor);
		}
		ProductManager productManager= new ProductManager();
		productManager.addToCart(product1);
		productManager.addToCart(product2);
		
	
	}

}
