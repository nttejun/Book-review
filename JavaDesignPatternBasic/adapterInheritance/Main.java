package adapterInheritance;

public class Main {
	public static void main(String[] args) {
		Prescription medicine = new MakeMedicine();
		//감기약 처방받은 고객
		medicine.coldMedicine();
		//두통약 처방받은 고객
		medicine.headacheMedicine();
	}
}
