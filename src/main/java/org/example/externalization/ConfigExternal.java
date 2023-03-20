package org.example.externalization;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

@Configuration
//@PropertySource("classpath:/app.properties")
@PropertySources({@PropertySource("classpath:/app.properties"),
                 @PropertySource("classpath:/app1.properties")})
@ComponentScan
public class ConfigExternal {

    @Autowired
    Environment environment;

    @Bean
    public MusicPlayer musicPlayer(){
        MusicPlayer musicPlayer=new MusicPlayer(environment.getProperty("name.song"),
                                                environment.getProperty("name.artist"));
           return musicPlayer;
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer(){
        return new PropertySourcesPlaceholderConfigurer();
    }
}
