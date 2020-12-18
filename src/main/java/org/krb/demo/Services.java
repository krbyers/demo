package org.krb.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Services {

  @RequestMapping("/hello")
  public String getNothing() {
    return "Sample hello message returned from hello...";
  }
}
