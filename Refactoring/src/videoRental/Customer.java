package videoRental;

import java.util.Enumeration;
import java.util.Vector;

public class Customer {
    private String _name;
    private Vector _rentals = new Vector();

    public Customer(String name){
        _name = name;
    }

    public void addRental(Rental arg){
        _rentals.addElement(arg);
    }

    public String get_name(){
        return _name;
    }

    // 대여내역을 생성하는 기능 statement
    public String statement(){
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        Enumeration rentals = _rentals.elements();
        String result = get_name() + "님의 대여기록 " + "\n";

        while(rentals.hasMoreElements()){
            double thisAmount = 0;
            Rental each = (Rental) rentals.nextElement();

            // 대여료 계산
            switch (each.get_moive().get_priceCode()){
                case Movie.REGULAR:
                    thisAmount += 2;
                    if(each.get_daysRented() > 2)
                        thisAmount += (each.get_daysRented() - 2) * 1.5;
                    break;
                case Movie.NEW_RELEASE:
                    thisAmount += each.get_daysRented() * 3;
                    break;
                case Movie.CHILDREN:
                    thisAmount += 1.5;
                    if(each.get_daysRented() > 3)
                        thisAmount += (each.get_daysRented() - 3) * 1.5;
                    break;
            }

            // 적립포인트 1증가
            frequentRenterPoints++;

            if((each.get_moive().get_priceCode() == Movie.NEW_RELEASE) && each.get_daysRented() > 1) { frequentRenterPoints++;}
            result += "\t" + each.get_moive().get_title() + "\t" + String.valueOf(thisAmount) + "\n";

            totalAmount += thisAmount;

        }

        result += "누적 대여료 : " + String.valueOf(totalAmount) + "\n";
        result += "적립 포인트 : " + String.valueOf(frequentRenterPoints);
        return result;
    }
}
