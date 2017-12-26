package Basic01.filter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CellphoneMain {
    public static void main(String[] args) {
        Cellphone cellphone = new Cellphone();
        List<Cellphone> storage = new ArrayList<>();

        // 메서드에 메서드 전달
        cellphone.filterCellphone(storage, Cellphone::isIPhone);
        cellphone.filterCellphone(storage, Cellphone::isIPhoneX);

        // 람다
        cellphone.filterCellphone(storage, (Cellphone c) -> "IPhone".equals(c.getCompany()));
        cellphone.filterCellphone(storage, (Cellphone c) -> "IPhoneX".equals(c.getModel()));

        // 순차처리 방식
        List<Cellphone> iPhoneCellphone = storage.stream().filter((Cellphone c) -> c.getCompany().equals("IPhone")).collect(Collectors.toList());

        // 병렬처리 방식
        List<Cellphone> iPhoneXCellphone = storage.parallelStream().filter((Cellphone c) -> c.getModel().equals("IPhoneX")).collect(Collectors.toList());


    }
}

