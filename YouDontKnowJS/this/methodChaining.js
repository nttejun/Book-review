var Address = function(){
	this._si = null;
	this._gu = null;
	this._dong = null;
}

Address.prototype.si = function(si){
	this._si = si;
	return this;
}

Address.prototype.gu = function(gu){
	this._gu = gu;
	return this;
}

Address.prototype.dong = function(dong){
	this._dong = dong;
	return this;
}

Address.prototype.print = function(){
	console.log(this._si + " " + this._gu + " " + this._dong);
}

var address = new Address();
address.si("서울특별시").gu("마포구").dong("마포동");

address.print();