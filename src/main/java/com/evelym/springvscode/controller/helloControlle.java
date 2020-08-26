package com.evelym.springvscode.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloControlle {
  @GetMapping(value = "/")
  public String getMethodName() {
    return "Olá Mundo VsCode!";
  }

}