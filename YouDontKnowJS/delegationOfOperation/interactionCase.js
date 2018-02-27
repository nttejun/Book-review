
// 네이버, 구글 중 누가 먼저 실행될지 확신할 수 없다
function uncertain(){

    var res = [];

    function response(data){
        res.push(data);
    }

    ajax("http://www.naver.com", response);
    ajax("http://www.google.com", response);

}


// 네이버, 구글 중 조건을 통해 누가 어느 값에 들어갈지 지정하여 누가 먼저 실행될지 확실할 수 있다
function certain(){

    var good = [];

    function response(data){
        if(data.url == "http://www.naver.com"){
            good[0] = data;
        }
        else if(data.url == "http://google.com"){
            good[1] = data;
        }
    }

    ajax("http://www.naver.com", response);
    ajax("http://www.google.com", response);

}


// 동시성 문제
// 첫 실행 시 baz() 내부 a, b 둘 중 하나는 undefiend 상태일 것이다
function overlab(){

    var a, b;
    
    function foo(x){
        a = x * 2;
        baz();
    }

    function bar(y){
        b = y * 2;
        baz();
    }

    function baz(){
        console.log(a + b);
    }

//  ajax("http://www.naver.com", foo);
//   ajax("http://www.google.com", bar);

    foo(3); // NaN
    bar(5); // 16
} //overlab();


// 동시성 해결방법은 여러가지가 있다
function notOverlab(){
    var a, b;

    function foo(x){
        a = x * 2;
        // a와 b가 존재하면 조건문 실행
        if(a&&b) {
            baz();
        }
    }

    function bar(y){
        b = y * 2;
        if(a&&b){
            baz();
        }
    }
    
    function baz(){
        console.log(a + b); // 16
    }

    console.log(foo(3)); // undefined
    console.log(bar(5)); // undefined

} //notOverlab();


// "첫 번째 호출만 실행한다"의 잘못된 코드
function faultCall(){
    var a;

    function foo(x){
        a = x * 2;
        baz();
    }
    
    function bar(x){
        a = x / 2;
        baz();
    }

    function baz(){
        console.log(a);
    }

    console.log(foo(3));
    console.log(bar(5));

} faultCall();


//"첫 번째 호출만 실행한다"의 올바른 코드
function onlyFirstFunctionCall(){
    var a;

    function foo(x){
        if(!a){
            a = x * 2;
            baz();
        }
    }

    function bar(x){
        if(!a){
            a = x / 2;
            baz();
        }
    }

    function baz(){
        console.log(a);
    }

    console.log(foo(3));
    console.log(bar(5));

} onlyFirstFunctionCall();

