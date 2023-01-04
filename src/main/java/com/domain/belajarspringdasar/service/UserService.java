package com.domain.belajarspringdasar.service;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

import com.domain.belajarspringdasar.data.User;
import com.domain.belajarspringdasar.event.LoginSuccessEvent;

@Component
public class UserService implements ApplicationEventPublisherAware {

    /*
     * Spring memiliki fitur yg namanya EventListener yang berfungsi untuk
     * komunikasi antar class menggunakan event atau berbasis event. Event di spring
     * merupakan objek turunan dari ApplicationEvent, Event Merupakan data yang
     * ditransfer dari class lain. Sedangkan Listener atau class yang menerima data
     * tersebut harus dibuat dari turunan ApplicationListener.
     * 
     * Ketika ingin mengirim data ke listener kita dapat menggunakan objek
     * ApplicationEventPublisher yang merupakan super interface dari
     * ApplicationContext. atau dapat juga menggunakan
     * ApplicationEventPublisherAware. untuk mendapatkan objek
     * ApplicationEventPublishernya. Event dapat dikirim ke lebih dari satu listener
     */

    private ApplicationEventPublisher applicationEventPublisher;

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }

    public boolean login(String username, String password) {
        if (isLoginSuccess(username, password)) {
            // mengirim data event menggunakan applicationEventPublisher.publishEvent
            applicationEventPublisher.publishEvent(new LoginSuccessEvent(new User(username)));
            return true;
        } else {
            return false;
        }
    }

    private boolean isLoginSuccess(String username, String password) {
        return "fadel".equals(username) && "fadel".equals(password);
    }
}
