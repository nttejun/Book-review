// mixin 사용으로 Vehicle 기능을 상속받은 하위클래스가 Vehicle 기능을 모두 사용할 수 있다 ( =extend() 상속기능과 동일 )
function mixin(sourceObj, targetObj){
		
		// check targetObj
		for(var key in targetObj){
			console.log("targetObj " + key);
		}
	
		// check sourceObj
		for(var key in sourceObj){
			console.log("sourceObj " + key);

			// mixin result save
			if(!(key in targetObj)){
				targetObj[key] = sourceObj[key];
			}
		}
		
		console.log(" ");
		
	return sourceObj;
}

var Vehicle = {
		engines: 1,
		
		ignition: function(){
			console.log("engine on");
		},
		
		drive: function(){
			this.ignition();
			console.log("start drive");
		}
};

var Car = mixin(Vehicle, {
	wheels: 4,
	drive: function(){
		Vehicle.drive.call(this);
		console.log(this.wheels + " wheels work");
	}
});

var Bike = mixin(Vehicle, {
	wheels: 2,
	drive: function(){
		Vehicle.drive.call(this);
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
