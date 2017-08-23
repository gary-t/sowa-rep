require.config({
    paths : {
        "jquery" : ["../components/jquery/jquery-3.2.1.min"],
        "bootstrap" : ["../components/bootstrap-3.3.7/js/bootstrap.min"],
        "holder" : ["../components/bootstrap-3.3.7/assets/js/vendor/holder.min"],
        "bootstrapValidator" : ["../components/bootstrapvalidator/js/bootstrapValidator.min"],
        "vue" : ["../components/vue/vue.min"],
        "vueRouter" : ["../components/vue/vue-router"]
    },
    shim : {
    	"bootstrap" : {
    		deps : ["jquery"],
    		exports : "bootstrap"
    	},
    	"bootstrapValidator" : {
    		deps : ["jquery"],
    		exports : "bootstrapValidator"
    	},
    	"vueRouter" : {
    		deps : ["vue"],
    		exports : "VueRouter"
    	}
    }
})

require(["jquery","bootstrapValidator","vue","vueRouter"],function($,bootstrapValidator,Vue,VueRouter){
		
	var vue = new Vue({
      el: '#myModal2',
      data: {
      },
      methods: {
      	// msm code
      	getSmsCode: function(){
      		$.ajax({
            	type:"POST",
//	            	url:paths.website_url + "site/getSmsCode",
				url:"http://127.0.0.1:8081/site/getSmsCode",
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
//	            	url:paths.website_url + "site/getKaptcha?date="+new Date()*1,
				url:"http://127.0.0.1:8081/site/getKaptcha?date="+new Date()*1,
            	dataType: "json",
            	success:function(data){
            		console.log(data);
            		if(data.success){
            			$("#kapctha").attr("src","data:image/jpeg;base64,"+data.data.identifyCode);
            		}
            	}
            });
      	}
      }
    });
	
	vue.getKapctha();
	
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
	   
	   
	Vue.use(VueRouter)
	const Foo = { template: '<div>foo</div>' }
	
	const routes = [
		  { path: '/foo', component: Foo }
		]
	const router = new VueRouter({routes})
	
	const app = new Vue({
		  router
	}).$mount('#login')

});

