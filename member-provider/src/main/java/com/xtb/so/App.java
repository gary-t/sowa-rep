package com.xtb.so;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * application run class
 *
 */
@SpringBootApplication
public class App extends SpringBootServletInitializer
{
	/**
	 * 让项目在tomcat上部署:
	 * 1.继承SpringBootServletInitializer
	 * 2.重写configure方法
	 */
    @Override
	protected SpringApplicationBuilder configure(
			SpringApplicationBuilder builder) {
		return builder.sources(App.class);
	}

	public static void main(String[] args) throws Exception {
        SpringApplication.run(App.class, args);
    }

}
