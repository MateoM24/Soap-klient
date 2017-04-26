package logika.clientsample;

import java.util.List;
import logika.*;

public class ClientSample {

	public static void main(String[] args) {
	        System.out.println("***********************");
	        System.out.println("Create Web Service Client...");
	        CashierService service1 = new CashierService();
	        System.out.println("Create Web Service...");
	        Cashier port1 = service1.getCashierPort();
	        System.out.println("Call Web Service Operation...");
	        Cart cart=new Cart();
	        Product p1=new Product();
	        p1.setName("Woda");
	        p1.setPrice(2.50);
	        p1.setQuantity(6);
	        Product p2=new Product();
	        p2.setName("Mleko");
	        p2.setPrice(3.20);
	        p2.setQuantity(12);
	        Product p3=new Product();
	        p3.setName("Kurczak");
	        p3.setPrice(21.00);
	        p3.setQuantity(1);
	        List<Product> list=cart.getList();
	        list.add(p1);
	        list.add(p2);
	        list.add(p3);
	        System.out.println("1) Test z pe³nym koszykiem");
	        try {
	        System.out.printf("Value of your cart is: %.2f",port1.getCartValue(cart));
	        Cart cartAfterDiscount=port1.discountCart(cart,10.0);
	        System.out.println("\nAfter the discount, cart looks like this: " + cartAfterDiscount);
	        System.out.println("The most expensive product is: " + port1.getMostExpensiveProduct(cartAfterDiscount));
	        } catch (NoCartException_Exception e) {
				e.printStackTrace();
			}finally{
				System.out.println("Koniec testu nr.1");
			}
	        
	        System.out.println("Create Web Service...");
	        Cashier port2 = service1.getCashierPort();
	        System.out.println("Call Web Service Operation...");
	        System.out.println("Start testu nr.2 Powinnien byæ rzucony wyj¹tek...");
	        try {
			System.out.println("Server said: " + port2.getCartValue(null));
	        System.out.println("Server said: " + port2.discountCart(null,15.0));
	        System.out.println("Server said: " + port2.getMostExpensiveProduct(null));
	        } catch (NoCartException_Exception e) {
				e.printStackTrace();
			}finally{
	        System.out.println("***********************");
	        System.out.println("Call Over!");
			}
	}
}
