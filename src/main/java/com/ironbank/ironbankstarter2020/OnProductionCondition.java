package com.ironbank.ironbankstarter2020;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import javax.swing.*;
import java.util.Optional;

/**
 * @author Evgeny Borisov
 */
public class OnProductionCondition implements Condition {

    private static Boolean answer;

    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        if (answer == null) {
            answer = JOptionPane.showInputDialog("is it production y/n").toLowerCase().contains("yes");
        }
        return answer;
    }
}
