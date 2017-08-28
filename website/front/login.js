require.config({
    paths : {
        "jquery" : ["../components/jquery/jquery-3.2.1.min"],
        "bootstrap" : ["../components/bootstrap-3.3.7/js/bootstrap.min"],
        "holder" : ["../components/bootstrap-3.3.7/assets/js/vendor/holder.min"],
        "bootstrapValidator" : ["../components/bootstrapvalidator/js/bootstrapValidator"],
        "vue" : ["../components/vue/vue.min"],
        "constants" : ["../config/constants"]
    },
    shim : {
    	"bootstrap" : {
    		deps : ["jquery"],
    		exports : "bootstrap"
    	},
    	"bootstrapValidator" : {
    		deps : ["jquery"],
    		exports : "bootstrapValidator"
    	}
    }
})

require(["jquery","bootstrap","bootstrapValidator","vue","constants"],function($,bootstrap,bootstrapValidator,Vue,constants){
	
	var vue = new Vue({
      el: '#myModal2',
      data: {
      },
      methods: {
      	// msm code
      	getSmsCode: function(){
      		$.ajax({
            	type:"POST",
	            url:paths.website_url + "site/getSmsCode",
            	data:{
            		"phone":$("#mobile").val(),
            	},
            	dataType: "json",
            	success:function(data){
            		console.log(data);
            	}
            });
      	},
      	// kapctha
      	getKapctha: function(){
      		$.ajax({
            	type:"GET",
	            url:paths.website_url + "site/getKaptcha?date="+new Date()*1,
            	dataType: "json",
            	success:function(data){
            		console.log(data);
            		if(data.success){
            			$("#kapctha").attr("src","data:image/jpeg;base64,"+data.data.identifyCode);
            		}
            	}
            });
      	},
      	// doRegister
      	doRegister: function(){
      		//开启验证
//          $('#regForm').data('bootstrapValidator').validate();  
            $('#regForm').bootstrapValidator('validate');
//    		var flag = $("#regForm").data("bootstrapValidator").isValid();
//    		if(flag){
//    			alert(123)
//    		}
	   },
	   // doLogin
	   doLogin: function(){
	   		$('#loginForm').bootstrapValidator('validate');
	   }
      	
      }
    });
	
    vue.getKapctha();
    
    $("#loginForm").bootstrapValidator({
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
    
	$("#regForm").bootstrapValidator({
		message: 'This value is not valid',
        feedbackIcons: {
　　　　　　	valid: 'glyphicon glyphicon-ok',
　　　　　　	invalid: 'glyphicon glyphicon-remove',
　　　　　　 validating: 'glyphicon glyphicon-refresh'
　　　　 },
		fields: {
        	mobile: {
                validators: {
                    notEmpty: {
                        message: '请输入手机号'
                    }
                }
            },
            yzm: {
                validators: {
                    notEmpty: {
                        message: '请输入验证码'
                    }
                }
            },
            sjyzm: {
            	validators: {
            		notEmpty: {
                        message: '请输入手机验证码'
                    }
            	}
            },
            szmm: {
            	validators: {
            		notEmpty: {
                        message: '请输入密码'
                    }
            	}
            },
            qrmm: {
            	validators: {
            		notEmpty: {
                        message: '请输入确认密码'
                    }
            	}
            }
        }
	});
    /*function validRegister(){
    }*/
    
	// validate form
//  $("form.required-validate").each(function() {
//      var $form = $(this);
//      $form.bootstrapValidator({
//      	message: 'This value is not valid',
//          feedbackIcons: {
//  　　　　　　　　valid: 'glyphicon glyphicon-ok',
//  　　　　　　　　invalid: 'glyphicon glyphicon-remove',
//  　　　　　　　　validating: 'glyphicon glyphicon-refresh'
//  　　　　 },
//          fields: {
//          	acc: {
//                  validators: {
//                      notEmpty: {
//                          message: '用户名不能为空'
//                      }
//                  }
//              },
//              pwd: {
//                  validators: {
//                      notEmpty: {
//                          message: '密码不能为空'
//                      }
//                  }
//              }
//          }
//      });
//
//      // 修复bootstrap validator重复向服务端提交bug
//      $form.on('success.form.bv', function(e) {
//          // Prevent form submission
//          e.preventDefault();
//          
//          $.ajax({
//          	type:"GET",
//          	url:"http://localhost:8084/msite/login",
//          	data:{
//          		"userName":$("#acc").val(),
//          		"pwd":$("#pwd").val()
//          	},
//          	dataType: "json",
//          	success:function(data){
//          		if("100" == data.code){
//          			location.href="/front/home.html";
//          		}
//          	}
//          });
//      });
//
//
//  });
	   
});

