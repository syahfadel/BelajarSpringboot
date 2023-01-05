package com.domain.belajarspringdasar.commandApp;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class LogCommnadLineRunner implements CommandLineRunner {
    // command line runner diperlukan jika ingin mendapatkan argument dari main
    // method

    // run akan otomatis dieksekusi saat spring berjalan, argumen didapat dari main
    // method
    @Override
    public void run(String... args) throws Exception {
        log.info("Log Command Line Runner : {}", Arrays.toString(args));

    }

}
