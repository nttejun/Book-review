package factoryMethodMain;

import factoryMethodIdCard.*;
import factoryMethodProduct.*;

public class Main {
	public static void main(String[] args){
		Factory factory = new IdCardFactory();
		Product sindycard = factory.create("sindy");
		Product juncard = factory.create("jun");
	
		sindycard.use();
		juncard.use();
	}
}
