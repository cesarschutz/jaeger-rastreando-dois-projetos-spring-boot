package com.example.geo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author Cesar Schutz
 */
@RestController
public class CamadaController {

    @Autowired
    private RestTemplate restTemplate;
    
    @RequestMapping("/helloError")
    public String camadaRoteirizadorError() {
    	 ResponseEntity<String> response = restTemplate.getForEntity("http://localhost:8080/camadaError", String.class);
         return "hello " + response.getBody();
    }
    
    @RequestMapping("/hello")
    public String camadaRoteirizador() {
    	 ResponseEntity<String> response = restTemplate.getForEntity("http://localhost:8080/camada", String.class);
    	 return "hello " + response.getBody();
    }
}
