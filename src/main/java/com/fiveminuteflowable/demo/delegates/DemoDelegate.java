package com.fiveminuteflowable.demo.delegates;

import org.flowable.engine.delegate.DelegateExecution;
import org.flowable.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

@Component
public class DemoDelegate implements JavaDelegate {

    public void execute(DelegateExecution execution) {
        execution.setVariable("mmmbop", "It's Gone!");
    }
}
