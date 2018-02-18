// 출력함수
function print(){
	console.log(this.a);
}

//bar는 print를 직접 가리키는 또 다른 레퍼런스다
//그 결과 bar() 실행마다 print를 가리키는 새로운 레퍼런스가 된다
//기본바인딩
var obj = {
		a : 2,
		print : print
};

var bar = obj.print;
var a = "print";

bar(); // undefined

//메서드 체이닝 방법
var obj2 = {
		a:42,
		print:print
};

var obj1 = {
		a:2,
		obj2:obj2
};

obj1.obj2.print(); // 42