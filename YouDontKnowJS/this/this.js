function identify(){
	return this.name.toUpperCase();
}

function speak(){
	var greeting = "use this greeting " + identify.call(this);
	console.log(greeting);
}

var me = {
	name : "wonjun"
};

var you = {
	name : "other"
};

identify.call(me);
identify.call(you);

speak.call(me);
speak.call(you);
