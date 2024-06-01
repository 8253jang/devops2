package kr.ac.koreatech.devops1.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class TestCotroller {

  @GetMapping("/a")
  public String getMethodName() {
      return "Ok";
  }
  
  
}
