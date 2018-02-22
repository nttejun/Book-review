
class Vehicle {
	engines = 1

	ignition(){
		output("engine on");
	}

	activate(){
		ignition();
		output("start activate");
	}
}

class Car1 inherits Vehicle{

};
class Car inherits Vehicle{
	wheels = 4

	activate(){
		inherited:activate();
		output(wheels, " : wheels activate");
	};
};

class speedBoat inherits Vehicle {
	engines = 2

	ignition(){
		output(engines + " : engine activate");
	};
	pilot() {
		inherited:activate();
		output("underwater");
	};
};

var a = new Car();
console.log(a.activate());



class Vehicle {

	ignition() {
		output( "Turning on my engine." )
	}

	drive() {
		ignition()
		output( "Steering and moving forward!" )
	}
}

class Car inherits Vehicle {
	wheels = 4

	drive() {
		inherited:drive()
		output( "Rolling on all ", wheels, " wheels!" )
	};
};

class SpeedBoat inherits Vehicle {
	engines = 2

	ignition() {
		output( "Turning on my ", engines, " engines." )
	}

	pilot() {
		inherited:drive()
		output( "Speeding through the water with ease!" )
	}
}