package rule41;

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

// 실행시점에 결과를 선택하는 경우라면 옳은 방법
// 실행시점에 인자의 자료를 근거로 선택한다
public class GoodCaseOverridden {

    public static void main(String args[]) {
        Beer[] beers = {
                new Beer(), new Cass(), new Bigwave()
        };
        for (Beer beer : beers)
            System.out.println(beer.name().toString());
    }
}
