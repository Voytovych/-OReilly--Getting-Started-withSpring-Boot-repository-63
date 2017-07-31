package com.oreilly.boot;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class MyApplicationRunner implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("These are the args for the application");
		
		for(String arg:args.getOptionNames()){
			System.out.println(arg);
		}
	}

}
