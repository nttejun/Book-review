package iteratorRestaurantOrder;

import iteratorAbstraction.Iterator;

public class Main {
	public static void main(String[] args ) {
		OrderSheet orderSheet = new OrderSheet(3);
		orderSheet.addOrder(new Customer("Tail"), new Menu("pizza"));
		orderSheet.addOrder(new Customer("Kill"), new Menu("coffee"));
		orderSheet.addOrder(new Customer("Zam"), new Menu("pie"));
		
		Iterator iterator = orderSheet.iterator();
		while(iterator.hasNext()) {
			Customer customers = (Customer)iterator.next();
			System.out.println("NAME : " + customers.getName());
		}
		
		while(iterator.hasNext()) {
			Menu menu = (Menu)iterator.next();
			System.out.println(" MENU : " + menu.getName());
		}
	}
}
