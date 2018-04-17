package videoRental;

import java.util.Enumeration;
import java.util.Vector;

public class Customer {
    private String _name;
    private Vector _rentals = new Vector();

    public Customer(String name) {
        _name = name;
    }

    public void addRental(Rental arg) {
        _rentals.addElement(arg);
    }

    public String get_name() {
        return _name;
    }

    // 대여내역을 생성하는 기능 statement
    public String statement() {
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        Enumeration rentals = _rentals.elements();
        String result = get_name() + "님의 대여기록 " + "\n";//1

        while (rentals.hasMoreElements()) {
            double thisAmount = 0;
            Rental each = (Rental) rentals.nextElement();

            // 대여료 계산
            thisAmount = each.getCharge();

            // 적립포인트 계산
            frequentRenterPoints += each.get_frequentRenterPoints();

            result += "\t" + each.get_moive().get_title() + "\t" + String.valueOf(thisAmount) + "\n";

            totalAmount += thisAmount;

        }

        result += "누적 대여료 : " + String.valueOf(totalAmount) + "\n";
        result += "적립 포인트 : " + String.valueOf(frequentRenterPoints);
        return result;
    }
}
