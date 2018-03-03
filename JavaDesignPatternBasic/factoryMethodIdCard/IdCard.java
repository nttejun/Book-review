package factoryMethodIdCard;
import factoryMethodProduct.*;

public class IdCard extends Product {
	private String owner;
	
	// Id Card 사용자 생성
	IdCard(String owner){
		System.out.println(owner +"님의 카드 생성");
		this.owner = owner;
	}
	
	public void use() {
		System.out.println(owner + "님의 카드 사용");
	}
	
	public String getOwner() {
		return owner;
	}
}
