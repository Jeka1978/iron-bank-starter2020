package com.ironbank.ironbankstarter2020;

/**
 * @author Evgeny Borisov
 */
public class EmailRavenSender implements RavenSender {
    @Override
    public void sendRaven(String destination, RuntimeException ex) {
        System.out.println("sent to "+destination+" "+ex.getMessage());
    }
}
