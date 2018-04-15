package videoRental;

public class Movie {
    public static final int CHILDREN = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    private String _title;
    private int _priceCode;

    public Movie(String title, int priceCode){
        this._title = title;
        this._priceCode = priceCode;
    }

    public void set_priceCode(int arg){
        this._priceCode = arg;
    }

    public int get_priceCode(){
        return _priceCode;
    }

    public String get_title(){
        return _title;
    }
}

