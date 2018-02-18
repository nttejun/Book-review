function foo(a, b){
	console.log("a : " + a + ", b: " + b);
}

// Case : 전역변수 참조 위험 
/* foo.apply(null, [1,2]); */

// Case : 전역변수 참조 방지
var ø = Object.create(null);
foo.apply(ø, [1, 2]); // 1, 2
foo.apply(ø, [20, 30, 40]); // 20, 30

var bar = foo.bind(ø, 2); 
bar(3); // 2, 3
