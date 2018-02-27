function asyncExecutionFlow(){

    doA(function(){ // 1
    
        doC(); // 3
    
            doD(function(){ // 4
                doF(); // 6
            })
    
        doE(); // 5

    })

    doB(); // 2

}