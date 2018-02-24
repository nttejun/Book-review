// 위임 이론
Task = {
		setID : function(ID) { this.id = ID },
		outputID : function() {console.log(this.id); }
}

XYZ = Object.create(Task);

XYZ.prepareTask = function(ID, Label){
	this.setID(ID);
	this.label = Label;
};

XYZ.outputTaskDetails = function(){
	this.outputID();
	console.log(this.label);
};

XYZ.prepareTask("delegation", 200);
XYZ.outputTaskDetails();
