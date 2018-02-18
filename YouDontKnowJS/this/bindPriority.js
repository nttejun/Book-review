function foo(something) {
	this.a = something;
}

var obj1 = {};

var bar = foo.bind(obj1);
bar(2);

console.log(obj1.a); // 2

var baz = new bar(3);

// bar는 obj1에 하드바인딩 되어 new bar(3) 영향을 받지 않는다
console.log(obj1.a); // 2

// 새롭게 bar.a를 레퍼런스하고 있는 baz를 호출
console.log(baz.a); // 3