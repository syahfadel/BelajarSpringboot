package com.domain.belajarspringdasar.listener;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.domain.belajarspringdasar.event.LoginSuccessEvent;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class UserListener {

    /*
     * selain menggnunakan interface Application Listener kita juga dapat
     * menggunakan annotation. lebih fleksibel karena sebuah bean dapat mendengar
     * lebih dari satu event.
     */

    @EventListener(classes = LoginSuccessEvent.class)
    public void onLoginSuccessEvent(LoginSuccessEvent event) {
        log.info("Success login for user {}", event.getUser());
    }

    @EventListener(classes = LoginSuccessEvent.class) // bisa beda event
    public void onLoginSuccessEvent2(LoginSuccessEvent event) {
        log.info("Success login2 for user {}", event.getUser());
    }

    @EventListener(classes = LoginSuccessEvent.class) // bisa beda event
    public void onLoginSuccessEvent3(LoginSuccessEvent event) {
        log.info("Success login3 for user {}", event.getUser());
    }
}
