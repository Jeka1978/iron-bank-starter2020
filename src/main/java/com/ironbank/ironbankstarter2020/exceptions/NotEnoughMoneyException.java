package com.ironbank.ironbankstarter2020.exceptions;

/**
 * @author Evgeny Borisov
 */
public class NotEnoughMoneyException extends RuntimeException {

    public NotEnoughMoneyException(String message) {
        super(message);
    }
}
