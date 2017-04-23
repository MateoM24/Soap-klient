package logika.clientsample;

import java.util.ArrayList;
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
	        List<Product> list=cart.getList();
	        list.add(p1);
	        list.add(p2);
	        
	        System.out.println("Server said: " + port1.getCartValue(cart));
	        //Please input the parameters instead of 'null' for the upper method!
	
	        System.out.println("Server said: " + port1.discountCart(cart,10.0));
	        //Please input the parameters instead of 'null' for the upper method!
	/*
	        System.out.println("Server said: " + port1.getMostExpensiveProduct(null));
	        //Please input the parameters instead of 'null' for the upper method!
	
	        System.out.println("Create Web Service...");
	        Cashier port2 = service1.getCashierPort();
	        System.out.println("Call Web Service Operation...");
	        System.out.println("Server said: " + port2.getCartValue(null));
	        //Please input the parameters instead of 'null' for the upper method!
	
	        System.out.println("Server said: " + port2.discountCart(null,Double.parseDouble(args[1])));
	        //Please input the parameters instead of 'null' for the upper method!
	
	        System.out.println("Server said: " + port2.getMostExpensiveProduct(null));
	        //Please input the parameters instead of 'null' for the upper method!
	*/
	        System.out.println("***********************");
	        System.out.println("Call Over!");
	}
}
