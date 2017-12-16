package rule42;

import java.util.Arrays;

public class PrintObjectToString {
    public static void main(String[] args){

        int[] digits = {1, 2, 3, 4};

        // Arrays.asList
        // 자바 1.5 이전 버전 기본자료형 컴파일 오류
        // 객체참조형 배열에만 동작했다
        // 기본자료형 배열은 컴파일부터 되지 않는다
        // 개선되었지만 원하지 않는 값 출력
        System.out.println(Arrays.asList(digits));  // [I@7bfcd12c]

        // Arrays.toString
        // 자바 1.5 부터 배열을 문자열로 출력 가능
        System.out.println(Arrays.toString(digits));    // [1, 2, 3, 4]
 
    }
}
