package adapterInheritance;

//고객은 감기약, 두통약을 처방받는 사실만 알고 내부에서 어떤 약을 사용하고 있는지 알 수 없다
public class MakeMedicine extends Medicine implements Prescription{

	@Override
	public void coldMedicine() {
		newColdMedicine();
	}

	@Override
	public void headacheMedicine() {
		oldHeadacheMedicine();
	}

}
