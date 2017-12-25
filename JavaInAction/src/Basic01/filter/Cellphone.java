package Basic01.filter;

import java.util.ArrayList;
import java.util.List;

public class Apple {

    public static List<Apple> filterIphone(List<Apple> storage){
        List<Apple> cellphone = new ArrayList<>();
        for(Apple apple : storage){
            if("Iphone".equals(apple.getCompany())){
                cellphone.add(apple);
            }
        }
        return cellphone;
    }

    public static List<Apple> filterModel(List<Apple> st)
}
