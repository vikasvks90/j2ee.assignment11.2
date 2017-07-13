package assignment11.session2.Assignment11_2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyAppConfig {
 
    @Bean(name="myMessage")
    public MyMessage getMyMessage(){
        return new PrintMessage();
    }
}

