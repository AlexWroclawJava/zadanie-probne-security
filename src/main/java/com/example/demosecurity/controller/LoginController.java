package com.example.demosecurity.controller;

import com.example.demosecurity.database.UserRepository;
import com.example.demosecurity.database.UserRoleRepository;
import com.example.demosecurity.model.User;
import com.example.demosecurity.model.UserRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import javax.persistence.PersistenceUnit;
import java.security.Principal;
import java.util.Collection;

@Controller
public class LoginController {

    @Autowired
    private UserRepository userRepository;
    private UserRoleRepository userRoleRepository;

    public LoginController(UserRepository userRepository, UserRoleRepository userRoleRepository) {
        this.userRepository = userRepository;
        this.userRoleRepository = userRoleRepository;
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/")
    public String mainPage(Principal principal, Model model) {

        Collection<SimpleGrantedAuthority> authorities = (Collection<SimpleGrantedAuthority>) SecurityContextHolder.getContext().getAuthentication().getAuthorities();

        String authority = authorities.toString().replace("ROLE_", "");
        model.addAttribute("authority", authority);

        if (principal != null) {
            String username = principal.getName();
            model.addAttribute("username", username);
        }
        return "index";
    }


    @GetMapping("/lista")
    public String zarejestrowani(Principal principal, Model model) {

        return "informacje";
    }


    @GetMapping("/profil")
    public String edytowanie(Model model, Principal principal) {
                User user = userRepository.getUserByUsername(principal.getName());
                model.addAttribute("user", user);
                return "profil";
           }

    @PostMapping("/profil")
   public String zedytuj(Model model, User user, Principal principal) {
                User newUser = userRepository.getUserById(user.getId());
                newUser.setUsername(user.getUsername());
                newUser.setPassword(user.getPassword());
                newUser.setName(user.getName());
                newUser.setLastname(user.getLastname());
                newUser.setPhone(user.getPhone());
                userRepository.save(newUser);
                return "index";
           }

    @GetMapping("/register")
    public String zarejestruj(Model model) {
        model.addAttribute("user", new User());
        return "registration";
    }

    @PostMapping("/register")
    public String rejestruj(Model model, User user) {
        User newUser = new User();
        UserRole role = new UserRole();
        role.setUsername(newUser.getUsername());
        role.setRole("ROLE_USER");
        newUser.setUsername(user.getUsername());
        newUser.setPassword(user.getPassword());
        newUser.setName(user.getName());
        newUser.setLastname(user.getLastname());
        newUser.setPhone(user.getPhone());
        model.addAttribute("user", newUser);
        userRoleRepository.save(role);
        userRepository.save(newUser);
        return "index";
    }
}

