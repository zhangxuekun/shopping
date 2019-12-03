package com.luryoo;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Application {

	@RequestMapping("/index")
	String index() {
		return "hello spring boot";
	}

	public static void main(String[] args) {
		//  关闭 banner
		//  SpringApplication app = new SpringApplication(Application.class);
        //  app.setBannerMode(Banner.Mode.OFF);
        //	app.run(args);
    	SpringApplication.run(Application.class, args);
	}

}
