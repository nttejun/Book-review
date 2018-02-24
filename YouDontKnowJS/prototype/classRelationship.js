// Class relationship investigation : Case1 
// 클래스간 관계를 살펴본다
function isRelatedTo(o1, o2){
	function F(){}
		F.prototype = o2;
		return o1 instanceof F;
}

var a = {};
var b = Object.create(a);
console.log(isRelatedTo(b, a));


// Class relationship investigation : Case2
// Confirm prototype reflection
function Foo(){}
Foo.prototype.blah = "1";
var a = new Foo();
console.log(Foo.prototype.isPrototypeOf(a));

// Class relationship investigation : Case3
// Case1의 isRelatedTo()를 isPrototype() 이름으로 자바스크립트 언어로 내장시킨 것과 같다
console.log(a.isPrototypeOf(b));

// Class relationship investigation : Case4
console.log(Object.getPrototypeOf(a) === Foo.prototype);

// Class relationship investigation : Case5
console.log(a.__proto__ === Foo.prototype);

// __proto__ 실체 구현체로 추정 
Object.defineProperty(Object.prototyp, "__proto__",{
	get: function(){
		return Object.getPrototypeOf(this);
	},
	set: function(o){
		Object.setPrototypeOf(this, o);
		return o;
	}
});