package factoryMethodIdCard;

import java.util.ArrayList;
import java.util.List;

import factoryMethodProduct.Factory;
import factoryMethodProduct.Product;

// 하위 클래스로 구체적 내용을 구현
public class IdCardFactory extends Factory{
	private List owners = new ArrayList();
	
	// IdCard 생성
	protected Product createProduct(String owner) {
		return new IdCard(owner);
	}
	
	// 상품 등록
	protected void registerProduct(Product product) {
		owners.add(((IdCard)product).getOwner());
	}
	
	// 등록된 상품 목록 조회
	public List getOwners() {
		return owners;
	}
}
