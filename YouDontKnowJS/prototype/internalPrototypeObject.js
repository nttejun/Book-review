function Foo(){}
Foo.prototype = {}

// Foo가 a를 생성한게 아니다
// Prototype Object가 a를 생성했다
var a = new Foo();
console.log(a.constructor === Foo); // false
console.log(a.constructor === Object); // true

