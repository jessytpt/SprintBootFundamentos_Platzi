package com.fundamentos.platzi.fundamentos.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
    @RequestMapping //para aceptar todas las peticiones http
    @ResponseBody //responder un cuerpo
    public ResponseEntity<String> function(){
        return new ResponseEntity<>("Hello from controller, change, other chance", HttpStatus.OK);
    }

}
