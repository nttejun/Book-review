// 함수의 내장 함수호출 실패
function Vehicle(){
	this.engine = 1;
}

Vehicle.prototype.ignition = function(){
	console.log("engine on");
}

Vehicle.prototype.drive = function(){
	this.ignition();
	console.log("engine on next is activate");
}

// Parasitic Inheritance Dose not work
function Car(){
	var car = new Vehicle();
	car.wheels = 4;
	
	var vehDrive = car.drive;
	
	car.drive = function(){
		vehDrive.call(this);
		console.log(
				this.wheels + " wheels work"
		);
		return car;
	}
//	car.drive(); // call Car.drive() for console confirm
}
// Car(); // call Car() function for console confirm


var car = new Car();

// Dose not work
// car.drive();
