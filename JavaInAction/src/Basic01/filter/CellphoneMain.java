package Basic01.filter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CellphoneMain {
    public static void main(String[] args){
        Cellphone cellphone = new Cellphone();
        List<Cellphone> storage = new ArrayList<>();
        cellphone.filterCellphone(storage ,Cellphone::isIPhone);
        cellphone.filterCellphone(storage, Cellphone::isIPhoneX);
    }
}
