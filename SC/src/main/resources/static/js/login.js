var login = {
	init : function() {
		var _this = this;

		$('#btn-login').on('click', function() {
			// 폼 인풋 널 체크
			// 학번 체크
			_this.save();
		});
	},
	save : function() {
//		var data = {
//			studentNum : $('#loginStudentNum').val()
//		};
//		$.ajax({
//			type : 'POST',
//			url : '/login',
//			dataType : 'json',
//			contentType : 'application/json; charset=utf-8',
//			data : JSON.stringify(data)
//		}).done(function() {
//			alert('로그인 되었습니다.');
//		});
//		.fail(function(data, status, jqXHR) {
//			if(status === 'parsererror'){
//				alert('등록되지 않은 학번입니다.');	
//			}
//			alert(JSON.stringify(data) );
//			alert(status);
//			alert(jqXHR);
//			alert('학번과 비밀번호를 확인해 주세요.');
//		});
	}
};

login.init();