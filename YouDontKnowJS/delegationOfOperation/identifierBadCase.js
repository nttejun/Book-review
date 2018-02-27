// bar() 단축 메서드는 익명함수다
var shorten = {
    bar(){},
    baz: function baz(){return "A"}
};

// 반면 baz는 function baz()가 baz 프로퍼티로 붙었다
var nomal = {
    bar : function(){},
    baz : function baz(){}
}