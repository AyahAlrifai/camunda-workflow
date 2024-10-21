package com.ebp.workflow.service;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Service;

@Service("sendNotificationService")
public class NotificationService implements JavaDelegate {

    @Override
    public void execute(DelegateExecution execution) throws Exception {

        execution.getProcessEngineServices()
                .getRuntimeService()
                .createMessageCorrelation("SendNotification")
                .setVariable("recipient", "ayah@yopmail.com")
                .correlate();
    }
}
