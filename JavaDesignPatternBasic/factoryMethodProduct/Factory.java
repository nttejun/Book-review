package factoryMethodProduct;

// 상위클래스로 골격 제공
//인스턴스가 필요한 인터페이스(API)를 결정하는 추상클래스
public abstract class Factory {
	public final Product create(String owner) {
		Product product = createProduct(owner);
		registerProduct(product);
		return product;
	}
	protected abstract Product createProduct(String owner);
	protected abstract void registerProduct(Product product);
}
