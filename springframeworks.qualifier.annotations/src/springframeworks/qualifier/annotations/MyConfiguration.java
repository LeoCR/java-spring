package springframeworks.qualifier.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class MyConfiguration {
	@Bean(name="student_bean")
	@Scope(value="singleton")
	public Student getStudent(){
		return new Student();
	}
	@Bean(name="1")
	public Address getAddress(){
		return new Address("California 12 street");
	}
	@Bean(name="2")
	public Address getAddress2(){
		return new Address("New Yersey 43 street");
	}
}
