package ch.gisel.test.springboot.ws.application;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.jaxrs.json.JacksonJaxbJsonProvider;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ComponentScan(basePackages = "ch.gisel.test.springboot.ws")
@ImportResource("classpath:beans.xml")
public class SpringBootTestWsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootTestWsApplication.class, args);
    }

    @Bean
    @ConditionalOnMissingBean
    public JacksonJaxbJsonProvider jsonProvider(ObjectMapper objectMapper) {
        JacksonJaxbJsonProvider provider = new JacksonJaxbJsonProvider();
        provider.setMapper(objectMapper);
        return provider;
    }
}
