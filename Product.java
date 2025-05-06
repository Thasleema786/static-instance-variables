public class Product{
       static String  category="Electronics";
	String productName;
	
public static void main(String[] args){
	System.out.println("Category:"+Product.category);
	Product pro1 =new Product();
        Product pro2=new Product();
	pro1.productName="Laptop";
	pro2.productName="Smartphone";
		System.out.println("Product 1:"+pro1.productName);
		System.out.println("Car 2 Model :"+pro2.productName);
}
}


	
