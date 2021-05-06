package ch.gisel.test.springboot.ws.config;

import ch.gisel.test.springboot.ws.IPersonWebService;
import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.ws.Endpoint;

@Configuration
public class WebServiceConfig {

    @Bean
    public Endpoint endpoint(Bus bus, IPersonWebService personWebService) {
        EndpointImpl endpoint = new EndpointImpl(bus, personWebService);
        endpoint.publish("/ws/person");
        return endpoint;
    }
}
