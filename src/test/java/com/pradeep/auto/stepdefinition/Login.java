package com.pradeep.auto.stepdefinition;

import com.pradeep.auto.config.DriverManager;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.logging.Logger;

public class Login {

    @Autowired
    private DriverManager driverManager;

    private final Logger logger = Logger.getLogger(Logger.class.getName());

    @When("^I launch Google$")
    public void launchGoogle(){
        logger.info("launching Application" + driverManager.application);
    }
}
