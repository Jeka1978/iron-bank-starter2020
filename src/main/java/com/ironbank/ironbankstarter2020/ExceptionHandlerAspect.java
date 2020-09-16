package com.ironbank.ironbankstarter2020;

import com.ironbank.ironbankstarter2020.exceptions.NotEnoughMoneyException;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Aspect
public class ExceptionHandlerAspect {

    @Autowired
    private RavenSender ravenSender;

    @Autowired
    private ExceptionRegistrator exceptionRegistrator;
    @Value("${raven.destination}")
    private String destination;


    @AfterThrowing(value = "execution(* com.deutsche.ironbank2020.services.*.*(..))",throwing = "ex")
    public void sendRavenIfNotEnoughMoney(NotEnoughMoneyException ex) {
        exceptionRegistrator.sendException(ex);
        ravenSender.sendRaven(destination,ex);
    }
}
