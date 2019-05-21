package za.ac.cput;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


//@SpringBootApplication
@SpringBootApplication
public class App 
{

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    public static void main( String[] args )
    {

        SpringApplication.run(App.class, args);
        System.out.println( "Hello World!" );
    }
}
