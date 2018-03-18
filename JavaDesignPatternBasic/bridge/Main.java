package bridge;
public class Main {
    public static void main(String[] args){
        Display d1 = new Display(new StringDisplayImpl("1"));
        Display d2 = new CountDisplay(new StringDisplayImpl("22"));
        CountDisplay d3 = new CountDisplay(new StringDisplayImpl("333"));
        
       		System.out.println(" [Display class]");
            d1.display();
            System.out.println(" ");
            
            System.out.println(" [CountDisplay class] ");
            d2.display();
            System.out.println(" ");
            
            System.out.println(" [CountDisplay class] ");
            d3.multiDisplay(5);
    }
}