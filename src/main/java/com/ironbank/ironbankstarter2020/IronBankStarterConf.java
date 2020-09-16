package com.ironbank.ironbankstarter2020;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.core.io.support.SpringFactoriesLoader;
import org.springframework.web.client.RestTemplate;

/**
 * @author Evgeny Borisov
 */
@Configuration
@EnableConfigurationProperties(RavenProps.class)
@ConditionalOnProperty(name = "raven.destination")
//@ConditionalOnProduction
public class IronBankStarterConf {





    @Bean
    public ExceptionRegistrator registrator(){
        return new ExceptionRegistrator();
    }

    @Bean
    public RavenSender ravenSender(){
        return new EmailRavenSender();
    }

    @Bean
    public ExceptionHandlerAspect aspect(){
        return new ExceptionHandlerAspect();
    }


}
