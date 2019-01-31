package com.example.roteirizador;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Cesar Schutz
 */
@RestController
public class HelloController {

    @RequestMapping("/camadaError")
    public String helloError() {
    	String x = null;
    	x = x.toString();
        return "camada xxxx!";
    }

    @RequestMapping("/camada")
    public String hello() {
        return "camada xxxx!";
    }
}
