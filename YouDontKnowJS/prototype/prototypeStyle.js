// practice case 01
// Foo
function Foo(name){
	this.name = name;
}

Foo.prototype.myName = function(){
	return this.name;
};

// Bar
function Bar(name, label){
	Foo.call(this, name);
	this.label = label;
}

//ES6 Case Object.setPrototypeOf()
Object.setPrototypeOf(Bar.prototype, Foo.prototype);
//ES5 Case Object.create()
Bar.prototype = Object.create(Foo.prototype);

Bar.prototype.myLabel = function(){
	return this.label;
};

var a = new Bar("name is a", "label is obj a");

console.log(a.myName());
console.log(a.myLabel());
console.log(" ");

// practice case 02
function Product(name, price){
	this.name = name;
	this.price = price;
}

function Food(name, price){
	Product.call(this, name, price);
	this.category = "food";
}

function Dress(name, price){
	Product.call(this, name, price);
	this.category = "dress";
}

console.log(new Food("cheese", 5000).name);
console.log(new Dress("pants", 200000).price);

var test =  new Food("cake", 10000);
console.log(test.name);
console.log(test.price);

