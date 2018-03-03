package com.example.demosecurity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
    public class User {

        @Id
        @GeneratedValue
        private Long id;
        private String firstname;
        private String lastname;
        private Integer cell_number;

        private String username;
        private String password;
        private boolean enabled;
        
}
