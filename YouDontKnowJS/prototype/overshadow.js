var anotherObj = {
		a : 2
};

var myObj = Object.create(anotherObj);
console.log(anotherObj.a);

// 프로퍼티 확인 hasOwnProperty
console.log(anotherObj.hasOwnProperty("a"));
console.log(myObj.hasOwnProperty("a"));
console.log(myObj.hasOwnProperty("anotherObj.a"));

// 내부구현은 myObj.a + 1 prototype 경유하여 get을 찾는다 
myObj.a++;
console.log(myObj.a);