package rule41;

// 오버라이딩은 실행시점에 인자의 자료를 근거로 선택한다
class Beer {

    String name() {
        return "Beer";
    }

}

class Cass extends Beer {
    @Override
    String name() {
        return "Cass Beer";
    }
}

class Bigwave extends Beer {
    @Override
    String name() {
        return "Bigwave Beer";
    }
}

public class GoodCaseOverridden {

    public static void main(String args[]) {
        Beer[] beers = {
                new Beer(), new Cass(), new Bigwave()
        };
        for (Beer beer : beers)
            System.out.println(beer.name().toString());
    }
}
