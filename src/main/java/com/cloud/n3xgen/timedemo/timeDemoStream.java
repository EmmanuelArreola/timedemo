package com.cloud.n3xgen.timedemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Supplier;
@Configuration
public class timeDemoStream extends TimeSupplierApplicationExtraction {

    @Override
    protected void testTimeSupplier() {

    }
    @Bean
    public Supplier<String> timeExtractor()  {
        return () -> {
            final String time = timeSupplier.get();
            System.out.println("Starting");
            return time;
        };
    }
}
