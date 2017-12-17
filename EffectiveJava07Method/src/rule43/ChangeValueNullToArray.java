package rule43;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Beer {
    private final List<Beer> beerStock = new ArrayList<>();
    private static final List<Beer> EMPTY_STOCK_ARRAY = new ArrayList<>(0);

    // null 대신 빈 배열 반환
    private List<Beer> getBeer() {
        if (beerStock.isEmpty())
            return EMPTY_STOCK_ARRAY;
        return beerStock;
    }

    public static void main(String[] args){
        Beer beer = new Beer();
        System.out.println(beer.getBeer());
        System.out.println(Arrays.toString(new Beer[0]));
    }
}
