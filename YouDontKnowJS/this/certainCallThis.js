function chk(num) {
	console.log("chk : " + num);
	this.count++;
}

chk.count = 0;
var i;
for(i=0; i<10; i++){
	if(i>5){
		// certain call() method to this 
		chk.call(chk, i);
	}
}

console.log(chk.count);

