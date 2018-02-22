var something = {
		some : Math.round((Math.random()*10) + 1)
};

// Object.create() 연결되어 있는 객체를 생성
var specific = Object.create(something);
console.log(specific.some);

// specific에 연결된 객체 프로퍼티 탐색 루프 실행
for(var value in specific){
	console.log("Find some value " + value);
}

// specific에 연결된 프로퍼티 "some" 존재여부를 확인
console.log("some" in specific);