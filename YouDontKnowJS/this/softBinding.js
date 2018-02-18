if (!Function.prototype.softBind) {
    Function.prototype.softBind = function(obj) {
        var fn = this,
            curried = [].slice.call( arguments, 1 ),
            bound = function bound() {
                return fn.apply(
                    (!this ||
                        (typeof window !== "undefined" && this === window) ||
                        (typeof global !== "undefined" && this === global)
                    ) ? obj : this,
                    curried.concat.apply( curried, arguments )
                );
            };
        bound.prototype = Object.create( fn.prototype );
        return bound;
    };
}

function foo(){
	console.log("name : " + this.name);
}

var obj = {name : "obj"},
	obj2 = {name : "obj2"},
	obj3 = {name : "obj3"};
	
var fooOBJ = foo.softBind(obj);

fooOBJ();

obj2.foo = foo.softBind(obj);

// 원하는 객체를 선택하여 바인딩하는 수동바인딩
obj2.foo();
fooOBJ.call(obj3);

// 기본 바인딩이 필요하면 소프트 바인딩을 사용
var softBindVar = obj2.foo;
softBindVar();

