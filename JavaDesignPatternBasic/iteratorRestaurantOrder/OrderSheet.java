package iteratorRestaurantOrder;

import iteratorAbstraction.Aggregate;
import iteratorAbstraction.Iterator;

public class OrderSheet implements Aggregate {
	public Customer[] customer;
	public Menu[] menu;
	public int count = 0;
	
	// 손님입장
	public OrderSheet(int order) {
		this.customer = new Customer[order];
		this.menu = new Menu[order];
	}
	// 주문
	public void addOrder(Customer customers, Menu menu) {
		this.customer[count] = customers;
		this.menu[count] = menu;
		count++;
	}
	public Customer getCustomer(int index) {
		return customer[index];
	}
	public Menu getMenu(int index) {
		return menu[index];
	}
	public int getOrderCount() {
		return count;
	}
	public Iterator iterator() {
		return new OrderSheetIterator(this);
	}
}
