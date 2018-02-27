// 이론적으로 구현한 코드가 완전히 신뢰할 수 있는가? 없다면 완벽하게 제어하자


// 불확실한 매개변수 사용 경우
function uncertain(){

    function addNumbers(x, y){
        return x+y;
    }

    // + 연산을 거치면서 타입을 완벽히 신뢰할 수 없다
    console.log(addNumbers(21, 21));
    console.log(addNumbers(21, "21"));
} 
uncertain();


// 불확실한 매개변수 체크사용 경우
function checkUncertain(){
    
    function addNumbers(x, y){
    
        // 불확실한 경우 최소한 방어선을 두자
        if(typeof x != "number" || typeof y != "number"){
            throw Error("인자 오류");
        }
    
        return x+y;
    
    }
    
    console.log(addNumbers(21, 21));
    console.log(addNumbers(21, "21"));

} 
checkUncertain();


// 확실하게 신뢰할 수 있는 경우
function certain(){

    function addNumbers(x, y){
        
        x = Number(x);
        y = Number(y);

        return x + y;

    }

    console.log(addNumbers(21, 21));
    console.log(addNumbers(21, "21"));

}
certain();