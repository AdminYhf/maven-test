package com.yhf.controller;

import com.yhf.service.AdmainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("admain")
public class AdmainController {
    @Autowired
    private AdmainService admainService;

    @RequestMapping("/login")
    public Object login() {

        return admainService.getAll();
    }


}
