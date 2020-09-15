package com.ironbank.ironbankstarter2020;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.core.io.support.SpringFactoriesLoader;

/**
 * @author Evgeny Borisov
 */
@Configuration
public class IronBankStarterConf {

    @Bean
    public ExceptionHandlerAspect aspect(){
        return new ExceptionHandlerAspect();
    }


}
