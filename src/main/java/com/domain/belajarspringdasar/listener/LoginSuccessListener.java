package com.domain.belajarspringdasar.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import com.domain.belajarspringdasar.event.LoginSuccessEvent;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class LoginSuccessListener implements ApplicationListener<LoginSuccessEvent> {
    // Dalam kurung siku merupakan tipe yang ingin di listen
    @Override
    public void onApplicationEvent(LoginSuccessEvent event) {
        log.info("Success Login for User {}", event.getUser());

    }

}
