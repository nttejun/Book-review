package Basic01.filter;

import java.util.ArrayList;
import java.util.List;

public class CellphoneMain {
    public static void main(String[] args) {
        Cellphone cellphone = new Cellphone();
        List<Cellphone> storage = new ArrayList<>();

        // 메서드에 메서드 전달
        cellphone.filterCellphone(storage, Cellphone::isIPhone);
        cellphone.filterCellphone(storage, Cellphone::isIPhoneX);

        // 람다
        cellphone.filterCellphone(storage, (Cellphone c) -> "IPhone".equals(c.getCompany()));
        cellphone.filterCellphone(storage, (Cellphone c) -> "IPhone".equals(c.getModel()));

    }
}

