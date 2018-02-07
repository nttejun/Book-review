package adaptermandate;

public class Main {
	public static void main(String[] args) {
		//감기약 처방받은 고객
		Prescription firstClient = new MakeMedicine("감기약");
		firstClient.coldMedicine();
		
		//두통약 처방받은 고객
		Prescription secondClient = new MakeMedicine("두통약");
		secondClient.headacheMedicine();
	}
}
