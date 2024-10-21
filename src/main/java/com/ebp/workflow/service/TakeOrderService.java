package com.ebp.workflow.service;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Service;

@Service("takeOrderService")
public class TakeOrderService implements JavaDelegate {

    @Override
    public void execute(DelegateExecution execution) {

        String drink = (String) execution.getVariable("drink");
        execution.setVariable("order", drink);
    }

    public String takeOrder(String order) {
        return "Your order is " + order;
    }
}
