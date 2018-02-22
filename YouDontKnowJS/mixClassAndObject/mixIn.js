// mixin 사용으로 Vehicle 기능을 상속받은 하위클래스가 Vehicle 기능을 모두 사용할 수 있다 ( = JS Lib, JS Framework애서 칭하는 extend() 상속기능과 동일 )
function mixin(sourceObj, targetObj){
		
		// check targetObj
		for(var key in targetObj){
			console.log("targetObj " + key);
		}
	
		// check sourceObj
		for(var key in sourceObj){
			console.log("sourceObj " + key);

			if(!(key in targetObj)){
				targetObj[key] = sourceObj[key];
			}
		}
		
		console.log(" ");
		
	return targetObj;
}

var Vehicle = {
		engines: 1,
		wheels: 4,
		
		ignition: function(){
			console.log("engine on");
		},
		
		drive: function(){
			this.ignition();
			console.log("start drive");
		}
};

var Car = mixin(Vehicle, {

	// Car 객체는 기본 설정된 바퀴 수를 사용하므로 별도 wheels 값을 할당하지 않았다
	// 호출할 대상을 .call() 사용으로 Car.drive() 라는 것을 명시했다
	drive: function(){
		Vehicle.drive.call(this);
		console.log(this.wheels + " wheels work");
	}
});

var Bike = mixin(Vehicle, {
	wheels: 2,
	drive: function(){
		Vehicle.drive();
		console.log(this.wheels + " wheels work");
	}
});

var None = mixin(Vehicle, {
	engines: 0,
	drive: function(){
		Vehicle.drive.call(this);
		console.log(this.engines + " engines work");
	}
});

Car.drive();
Bike.drive();
None.drive();
