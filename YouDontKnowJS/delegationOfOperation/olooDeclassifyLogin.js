var LoginController = {
    errors: [],
    getUser: function(){
        return document.getElementById(
            "login_username"
        ).value;
    },
    getPassword: function(){
        return document.getElementById(
            "login_password"
        ).value;
    },
    validateEntry: function(user, pw){
        user = user || this.getUser()
        pw = pw || this.getPassword();

        if(!(user && pw)){
            return this.failure(
                "ID와 비밀번호를 입력해 주십시오! "
            );
        }
        else if(user.length < 5){
            return this.failure(
                "비밀번호는 5자 이상이어야 합니다"
            );
        }
        return true;
    },
    showDialog: function(title, msg){
        //msg alert
    },
    failure: function(err){
        this.errors.push(err);
        this.showDialog("에러", "로그인 실패 : " + err);
    }
};

var AuthController = Object.create(LoginController);
AuthController.errors = [];

//DB서버 검증
AuthController.checkAuth = function(){
    var user = this.getUser();
    var pw = this.getPassword();

    if(this.validateEntry(user, pw)){
        this.server('/check-auth',{
            user:user,
            pw:pw
        })
        .then(this.accepted.bind(this))
        .fail(this.rejected.bind(this));
    }
};

AuthController.server = function(url, data){
    return $.ajax({
        url: url,
        data: data
    });
};

AuthController.accepted = function(){
    this.showDialog("성공", "인증 성공");
};

AuthController.rejected = function(){
    this.showDialog("인증실패 : " + err);
};