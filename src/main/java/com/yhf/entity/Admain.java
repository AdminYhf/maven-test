package com.yhf.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
//@ConfigurationProperties(prefix = "admain")
public class Admain {
    //@Value("100")
    private int id;
    //@Value("小明")
    private String username;
    //@Value("sdfg")
    private String password;


}
