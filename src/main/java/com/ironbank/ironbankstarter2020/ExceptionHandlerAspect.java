package com.ironbank.ironbankstarter2020;

import com.ironbank.ironbankstarter2020.exceptions.NotEnoughMoneyException;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Aspect
public class ExceptionHandlerAspect {


    @AfterThrowing(value = "execution(* com.deutsche.ironbank2020.services.*.*(..))",throwing = "ex")
    public void sendRavenIfNotEnoughMoney(NotEnoughMoneyException ex) {
        System.out.println("ворон полетел в рельсу");
    }
}
