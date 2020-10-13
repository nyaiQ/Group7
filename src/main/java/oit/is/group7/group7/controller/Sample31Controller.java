package oit.is.group7.group7.controller;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * /sample3へのリクエストを扱うクラス authenticateの設定をしていれば， /sample3へのアクセスはすべて認証が必要になる
 */
@Controller
@RequestMapping("/sample3")
public class Sample31Controller {

  @GetMapping("step1")
  public String sample31() {
    return "sample31.html";
  }

}
