package pt.com.clevertiassesmentbff.config;

import static org.springframework.beans.factory.config.BeanDefinition.SCOPE_PROTOTYPE;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.cloud.openfeign.support.SpringEncoder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

import feign.codec.Encoder;
import feign.form.FormEncoder;

@Configuration
public class CoreFeignConfiguration {
	
	@Bean
	@Primary
	@Scope(SCOPE_PROTOTYPE)
	public Encoder feignFormEncoder(ObjectFactory<HttpMessageConverters> messageConverters) {
		return new FormEncoder(new SpringEncoder(messageConverters));
	}
}
