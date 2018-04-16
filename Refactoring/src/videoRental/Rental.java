package videoRental;

public class Rental {
    private Movie _moive;
    private int _daysRented;

    public Rental(Movie movie, int daysRented){
        this._moive = movie;
        this._daysRented = daysRented;
    }

    public int get_daysRented(){
        return _daysRented;
    }

    public Movie get_moive(){
        return _moive;
    }

    public double getCharge(){
        double result = 0;
        switch (get_moive().get_priceCode()){
            case Movie.REGULAR:
                result += 2;
                if(get_daysRented() > 2)
                    result += (get_daysRented() - 2) * 1.5;
                break;
            case Movie.NEW_RELEASE:
                result += get_daysRented() * 3;
                break;
            case Movie.CHILDREN:
                result += 1.5;
                if(get_daysRented() > 3)
                    result += (get_daysRented() - 3) * 1.5;
                break;
        }
        return result;
    }
}
