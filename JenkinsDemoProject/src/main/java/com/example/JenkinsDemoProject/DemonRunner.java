package com.example.JenkinsDemoProject;

import org.springframework.boot.CommandLineRunner;

public class DemonRunner implements CommandLineRunner {
    private String SERVER_PORT;
    private String SERVER_NAME;

    {
        SERVER_NAME = System.getenv("SERVER_NAME");
        SERVER_PORT = System.getenv("SERVER_PORT");
    }
    @Override
    public void run(String... args) throws Exception {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ SERVER NAME:"+SERVER_NAME+"~~~~~~~~~~~~~~~~~~~");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ SERVER PORT:"+SERVER_PORT+"~~~~~~~~~~~~~~~~~~~~");
    }
}
