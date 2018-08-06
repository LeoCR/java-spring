package hello;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class MvcConfig extends WebMvcConfigurerAdapter {
    
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        try {
        registry.addViewController("/spring_mvc_session/home").setViewName("home");
        registry.addViewController("/spring_mvc_session/").setViewName("home");
        registry.addViewController("/spring_mvc_session/hello").setViewName("hello");
        registry.addViewController("/spring_mvc_session/login").setViewName("login");
        registry.addViewController("/spring_mvc_session/error").setViewName("error");/*
        registry.addStatusController("/spring_mvc_session/error/", HttpStatus.UNAUTHORIZED);
        registry.addStatusController("/spring_mvc_session/error/", HttpStatus.NOT_FOUND);
         registry.addStatusController("/spring_mvc_session/error/", HttpStatus.METHOD_NOT_ALLOWED);
         registry.addStatusController("/spring_mvc_session/error/", HttpStatus.NOT_ACCEPTABLE); 
          registry.addStatusController("/spring_mvc_session/error/", HttpStatus.INTERNAL_SERVER_ERROR);*/
        } catch (Exception e) {
            //registry.addRedirectViewController("/spring_mvc_session/error/", "/error_page/");
        }
    }

}
