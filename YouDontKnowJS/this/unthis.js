function identify(context){
	return context.name.toUpperCase();
}

function speak(context){
	var greeting = "use unthis greeting " + identify(context);
	console.log(greeting);
}

var me = {
	name : "wonjun"
}

var you = {
	name : "other"
}

identify(me);
identify(you);

speak(me);
speak(you);
