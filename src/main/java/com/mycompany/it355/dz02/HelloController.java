/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.it355.dz02;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author ana
 */
@Controller
@RequestMapping("/") 
public class HelloController {
@RequestMapping(method = RequestMethod.GET) 
public String printHello(ModelMap model) { 
    model.addAttribute("message", "IT355-DZ02");

// hello.jsp 
return "hello"; 
}
}

