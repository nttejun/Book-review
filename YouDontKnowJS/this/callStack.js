//Call stack 쌓이는 순서
function stackFirst(){
	
	// stack first
	console.log("first");
	stackSecond();
}

function stackSecond(){
	// stack first >> second
	console.log("second");
	stackThird();
}

function stackThird(){
	// stack first >> second >> third
	console.log("third");
}

stackFirst();


//Call stack 후입선출 실행순서 
function executionFirst(){
	
	// stack execution first
	executionSecond();
	console.log("first");
}

function executionSecond(){
	// stack execution first >> second
	executionThird();
	console.log("second");
}

function executionThird(){
	// stack execution first >> second >> third
	console.log("third");
}

executionFirst();