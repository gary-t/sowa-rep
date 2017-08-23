require.config({
    paths : {
        "jquery" : ["../components/jquery/jquery-3.2.1.min"],
        "bootstrap" : ["../components/bootstrap-3.3.7/js/bootstrap.min"],
        "holder" : ["../components/bootstrap-3.3.7/assets/js/vendor/holder.min"],
        "bootstrapValidator" : ["../components/bootstrapvalidator/js/bootstrapValidator.min"],
        "vue" : ["../components/vue/vue.min"]
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

/*require(["jquery","bootstrap","bootstrapValidator","vue"],function($,bootstrap,bootstrapValidator,Vue){
	
});*/