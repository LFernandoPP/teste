package br.com.alura.forum.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class LoginController {

    @GetMapping("/entra")
    public String entra() {
        return "logado!";
    }

    @GetMapping("/testa")
    public String testa() {
        return "testado!";
    }
}