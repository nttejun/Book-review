package Basic01.filter;

import java.util.ArrayList;
import java.util.List;

// filter
public class Cellphone {

    private String company;
    private String model;

    public String getCompany(){
        return this.company;
    }

    public String getModel(){
        return this.model;
    }

    public void setCompany(String company){
        this.company = company;
    }

    public void setModel(String model){
        this.model = model;
    }

    // After version 8 of java
    public static Boolean isIPhone(Cellphone cellphone){
        return "IPhone".equals(cellphone.getCompany());
    }

    public static Boolean isIPhoneX(Cellphone cellphone){
        return "IPhoneX".equals(cellphone.getModel());
    }

    // Only one implementation
    public static List<Cellphone> filterCellphone(List<Cellphone> storage, Result<Cellphone> cellphoneResult) {
        List<Cellphone> res = new ArrayList<>();
        for (Cellphone cellphone : storage) {
            if (cellphoneResult.result(cellphone)) {
                res.add(cellphone);
            }
        }
        return res;
    }

    // Before version 8 of java
    public static List<Cellphone> filterIphone(List<Cellphone> storage) {
        List<Cellphone> iPhone = new ArrayList<>();
        for (Cellphone cellphone : storage) {
            if ("IPhone".equals(cellphone.getCompany())) {
                iPhone.add(cellphone);
            }
        }
        return iPhone;
    }

    public static List<Cellphone> filterModel(List<Cellphone> storage) {
        List<Cellphone> iPhoneX = new ArrayList<>();
        for (Cellphone cellphone : storage) {
            if ("IPhoneX".equals(cellphone.getModel())) {
                iPhoneX.add(cellphone);
            }
        }
        return iPhoneX;
    }
}
