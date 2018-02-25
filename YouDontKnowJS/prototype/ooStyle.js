function Foo(who){
    this.me = who;
}

Foo.prototype.identify = function(){
    return "I am " + this.me;
};

function Bar(who){
    Foo.call(this, who);
}

Bar.prototype = Object.create(Foo.prototype);

Bar.prototype.speak = function(){
    console.log("Hello, " + this.identify() + ".");
};

var tom = new Bar("Tom");
var jerry = new Bar("Jerry");

tom.speak();
jerry.speak();
