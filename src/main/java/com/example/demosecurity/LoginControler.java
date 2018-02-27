package com.example.demosecurity;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginControler {

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/")
    public String wyswietl() {
        return "strona";
    }

    @GetMapping("/zaszyfruj")
    @ResponseBody
    public String zaszyfruj(@RequestParam String input) {
        PasswordEncoder passwordEncoder= new BCryptPasswordEncoder();
        String hashedPassword = passwordEncoder.encode(input);
        return hashedPassword;
    }
}
