package com.pradeep.auto.stepdefinition;

import com.pradeep.auto.SpringBootContextConfiguration;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = SpringBootContextConfiguration.class)
public class Hooks {
}
