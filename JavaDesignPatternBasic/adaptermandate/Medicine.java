package adaptermandate;

public class Medicine {

	private String medicine;
	
	public Medicine(String medicine) {
		this.medicine = medicine;
	}

	public void newColdMedicine() {
		System.out.println("새롭게 개발된 " + medicine);
	}
	
	public void oldHeadacheMedicine() {
		System.out.println("이전에 개발된 " + medicine);
	}
}
