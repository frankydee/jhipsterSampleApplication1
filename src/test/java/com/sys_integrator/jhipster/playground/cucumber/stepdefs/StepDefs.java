package com.sys_integrator.jhipster.playground.cucumber.stepdefs;

import com.sys_integrator.jhipster.playground.JhipsterSampleApplication1App;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = JhipsterSampleApplication1App.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
