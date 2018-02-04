package iteratorRestaurantOrder;

import iteratorAbstraction.Iterator;

public class OrderSheetIterator implements Iterator{
	
	private OrderSheet orderSheet;
	private int index;
	
	public OrderSheetIterator(OrderSheet orderSheet) {
		this.orderSheet = orderSheet;
		this.index = 0;
	}
	
	@Override
	public boolean hasNext() {
		if(index < orderSheet.getOrderCount()) {
			return true;
		} else {			
			return false;
		}
	}
	
	@Override
	public Object next() {
		Customer customer = orderSheet.getCustomer(index);
		index++;
		return customer;
	}
}
