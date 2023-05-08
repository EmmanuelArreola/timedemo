package com.cloud.n3xgen.timedemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import java.util.function.Supplier;
@Configuration
@Service
public class timeDemoStream  extends TimeSupplierApplicationExtraction{
	
	public timeDemoStream() {
		
	}
	
	@Override
	protected String testTimeSupplier() {
		final String time = timeSupplier.get();
		return time;
	}
   
    @Bean
    public Supplier<String> timeExtractor()  {
        return () -> {
            System.out.println("Starting");
            System.out.println("Testing" + testTimeSupplier());
            return testTimeSupplier();
        };
    }



}
