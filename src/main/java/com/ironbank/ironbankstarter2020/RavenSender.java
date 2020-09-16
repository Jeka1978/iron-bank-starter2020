package com.ironbank.ironbankstarter2020;

/**
 * @author Evgeny Borisov
 */
public interface RavenSender {
    void sendRaven(String destination, RuntimeException ex);
}
