$(function(){
	// validate form
    $("form.required-validate").each(function() {
        var $form = $(this);
        $form.bootstrapValidator({
        	message: 'This value is not valid',
            feedbackIcons: {
    　　　　　　　　valid: 'glyphicon glyphicon-ok',
    　　　　　　　　invalid: 'glyphicon glyphicon-remove',
    　　　　　　　　validating: 'glyphicon glyphicon-refresh'
    　　　　 },
            fields: {
            	acc: {
                    validators: {
                        notEmpty: {
                            message: '用户名不能为空'
                        }
                    }
                },
                pwd: {
                    validators: {
                        notEmpty: {
                            message: '密码不能为空'
                        }
                    }
                }
            }
        });

        // 修复bootstrap validator重复向服务端提交bug
        $form.on('success.form.bv', function(e) {
            // Prevent form submission
            e.preventDefault();
            
            $.ajax({
            	type:"GET",
            	url:"http://localhost:8084/msite/login",
            	data:{
            		"userName":$("#acc").val(),
            		"pwd":$("#pwd").val()
            	},
            	dataType: "json",
            	success:function(data){
            		if("100" == data.code){
            			location.href="/front/home.html";
            		}
            	}
            });
        });


    });
	
});