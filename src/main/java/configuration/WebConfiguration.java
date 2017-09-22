package configuration;


import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

public class WebConfiguration {
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

}
