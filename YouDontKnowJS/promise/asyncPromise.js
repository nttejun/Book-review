// error case
var x, y = 10;
console.log(x + y); // Nan


// async
function add(getX, getY, cb){
    var x, y;
    getX(function(xVal){
        x = xVal;
        if(y!=undefined){
            cb(x+y);
        }
    });
    getY( function(yVal){
        y = yVal;
        if(x!=undefined){
            cb(x+y);
        }
    });
}

add(fetchX, fetchY, function(sum){
    console.log(sum);
});


// promise
function add(xPromise, yPromise){
    // 미래값을 준비하는 로직은 Promise.all() 내부에 있다
    return Promise.all([xPromise, yPromise])
    .then( function(values){
        return values[0] + values[1];
    });
}

add(fetchX(), fetchY())
.then( function(sum){
    cosnoel.log(sum);
})
