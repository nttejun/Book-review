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
}
