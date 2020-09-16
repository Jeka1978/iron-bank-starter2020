package com.ironbank.ironbankstarter2020;

import com.ironbank.ironbankstarter2020.exceptions.ExceptionModel;
import org.springframework.web.client.RestTemplate;

/**
 * @author Evgeny Borisov
 */

public class ExceptionRegistrator {

    private RestTemplate restTemplate = new RestTemplate();

    public void sendException(RuntimeException ex) {
        ExceptionModel model = ExceptionModel.builder().className(ex.getClass().getName()).message(ex.getMessage()).build();
        String answer = restTemplate.postForObject("http://localhost:9090/exceptionhandler/save", model, String.class);
        System.out.println("answer = " + answer);
    }
}
