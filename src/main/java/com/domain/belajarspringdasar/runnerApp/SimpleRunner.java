package com.domain.belajarspringdasar.runnerApp;

import java.util.List;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class SimpleRunner implements ApplicationRunner {

    /*
     * Selain command line runner terdapat juga Application Runner yang membedakan
     * yaitu objeknya kalau command menjadi array argument string sedangkan
     * ApplicationRunner menjadi Objek argument yang menarik yaitu memiliki fitur
     * untuk parsing command line argumentnya. cukup implementasikan
     * ApplciationRunner
     */

    // argumen dimasukan dengan --profiles=Fadel --profiles="Putra Rizky"
    // profiles akan menampilkan [Fadel, Putra Rizky]
    @Override
    public void run(ApplicationArguments args) throws Exception {
        List<String> profiles = args.getOptionValues("profiles");
        log.info("profiles: {}", profiles);
    }

}
