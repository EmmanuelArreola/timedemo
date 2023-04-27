/*
 * Copyright 2020-2020 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.cloud.n3xgen.timedemo;

import org.apache.commons.lang3.time.FastDateFormat;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Date;
import java.util.function.Supplier;

/**
 * @author Soby Chacko
 */
@Configuration
@EnableConfigurationProperties(TimeSupplierProperties.class)
public class TimeSupplierConfiguration {

	@Bean
	public Supplier<String> timeSupplier(TimeSupplierProperties timeSupplierProperties) {
		FastDateFormat fastDateFormat = FastDateFormat.getInstance(timeSupplierProperties.getDateFormat());
		return () -> fastDateFormat.format(new Date());
	}

}