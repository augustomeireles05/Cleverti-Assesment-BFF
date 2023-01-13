package pt.com.clevertiassesmentbff;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
@ComponentScan(basePackages = {"pt.com"})
@SpringBootApplication(scanBasePackages = {"pt.com"}, exclude = {DataSourceAutoConfiguration.class})
@EnableFeignClients
public class ClevertiAssesmentBffApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClevertiAssesmentBffApplication.class, args);
	}

}
