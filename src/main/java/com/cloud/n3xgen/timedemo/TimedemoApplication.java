package com.cloud.n3xgen.timedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TimedemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TimedemoApplication.class, args);

	
//		TimeSupplierProperties properties = new TimeSupplierProperties();
//		properties.setDateFormat("MM/dd/yy HH:mm:ss");
//		TimeSupplierConfiguration mainInjection = new TimeSupplierConfiguration();
//		
//		
//		System.out.println(mainInjection.timeSupplier(properties).get());

		// Second way to extract
//		System.out.println("Main start");
//		timeDemoStream timeDemo = new timeDemoStream();
//		System.out.println(timeDemo.testTimeSupplier());
	}

}
