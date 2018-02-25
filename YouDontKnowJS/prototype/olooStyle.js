Foo = {

    init : function(who) {
        this.me = who;
    },

    identify: function(){
        return "I am " + this.me;
    }

};

Bar = Object.create(Foo);

Bar.speak = function(){
    console.log("Hello, " + this.identify() + ".");
}

var tom = Object.create(Bar);
var jerry = Object.create(Bar);

tom.init("Tom");
tom.speak();

jerry.init("Jerry");
jerry.speak();



