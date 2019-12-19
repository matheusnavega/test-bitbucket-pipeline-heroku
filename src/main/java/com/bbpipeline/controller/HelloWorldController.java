package com.bbpipeline.controller;

import com.bbpipeline.entity.HelloWorld;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "helloworld/")
public class HelloWorldController {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping(path = "{myName}/name")
    public @ResponseBody HelloWorld hello (@PathVariable(name = "myName", required = true) String myName) {

        HelloWorld helloWorld = new HelloWorld(myName);

        logger.info("Hello: {} testando!!!", helloWorld.getMyName());

        return helloWorld;
    }

}
