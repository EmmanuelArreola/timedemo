package com.cloud.n3xgen.timedemo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

//@SpringBootTest
class TimedemoApplicationTests {

//	@Test
	void contextLoads() {
		TimeSupplierProperties properties = new TimeSupplierProperties();
		properties.setDateFormat("MM/dd/yy HH:mm:ss");
		TimeSupplierConfiguration mainInjection = new TimeSupplierConfiguration();
		
		
		System.out.println(mainInjection.timeSupplier(properties));

		}
}
